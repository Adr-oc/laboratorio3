package controller;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Pantalon;
import model.Prenda;
import model.Camisa;
import model.Collar;
import utils.CSVReader;
import model.Inventario;

public class Controller {

    public Inventario inventario = new Inventario();
    public List<String> CaDisponibles;
    public List<String> VentasCategoria;
    public List<String> ProdCategoria;
   
    public Controller(){
        this.inventario = inventario;
        ListToPrenda(inventario);
    }

    public void ListToPrenda(Inventario inventario){
        String filename = "src/db/data.csv";
        int startLine = 1;
        int categoryColumn = 6;

        // Read CSV file
        try{
            List<String[]> rows = CSVReader.read(filename);
            int endLine = rows.size()-1;

            for (int i = startLine; i <= endLine; i++) {
                String[] row = rows.get(i);
                //System.out.println(row[categoryColumn]);
                String categoria = row[categoryColumn];
                int id = Integer.parseInt(row[0]);
                String nombre = row[1];
                int ca_disponible = Integer.parseInt(row[2]);
                int ca_vendido = Integer.parseInt(row[3]);
                String estado = row[4];
                Double precio = Double.parseDouble(row[5]);
                String talla = row[6];
                String unique = row[7];

                switch(categoria) {
                    case "pantalon":
                      Pantalon pantalon = new Pantalon(id,nombre,ca_disponible,ca_vendido,estado,precio,talla,unique);
                      inventario.addPrenda(pantalon);
                      break;

                    case "camisa":
                      Camisa camisa = new Camisa(id, nombre, ca_disponible, ca_vendido, estado, precio, talla, unique);
                      inventario.addPrenda(camisa);
                      break;

                    case "collar":
                      Collar collar = new Collar(id, nombre, ca_disponible, ca_vendido, estado, precio, talla, unique);
                      inventario.addPrenda(collar);
                      break;

                    default:
                      break;
                  }

            }

        }catch (IOException e){
            System.err.println("Error reading CSV file: " + e.getMessage());
        }

    }


    public Inventario getInventario() {
      return inventario;
    }

    public void setInventario(Inventario inventario) {
      this.inventario = inventario;
    }

    public List<String> getCaDisponibles(List<Prenda> prendas) {
      int totalPantalon = 0;
      int totalCamisa = 0;
      int totalCollar = 0;

      for (Prenda prenda : prendas) {
        switch (prenda.getClass().getSimpleName()) {
          case "Pantalon":
            Pantalon pantalon = (Pantalon) prenda;
            totalPantalon += pantalon.getCantidadDisponible();
            break;

          case "Camisa":
            Camisa camisa = (Camisa) prenda;
            totalCamisa += camisa.getCantidadDisponible();
            break;
          
          case "Collar":
            Collar collar = (Collar) prenda;
            totalCollar += collar.getCantidadDisponible();
            break;  

          default:
            break;
        }
      }
      List <String> categoriasCaDisponibles = List.of("Pantalones: " + totalPantalon, "Camisas: " + totalCamisa, "Collares: " + totalCollar);
      return categoriasCaDisponibles;
    }

    public List<String> getProdCategoria(List<Prenda> prendas, String categoria) {
      List <String> ProductoCategoria = new ArrayList();
      for (Prenda prenda : prendas) {
        if (prenda.getClass().getSimpleName().equals(categoria)) {
          ProductoCategoria.add(prenda.getId()+" "+prenda.getNombre());
        }
      }
      return ProductoCategoria;
    }


    public List<String> getVentasCategoria(List<Prenda> prendas) {
      int totalPantalon = 0;
      int totalCamisa = 0;
      int totalCollar = 0;

      for (Prenda prenda : prendas) {
        switch (prenda.getClass().getSimpleName()) {
          case "Pantalon":
            Pantalon pantalon = (Pantalon) prenda;
            totalPantalon += (pantalon.getCantidadVendida()*pantalon.getPrecio());
            break;

          case "Camisa":
            Camisa camisa = (Camisa) prenda;
            totalCamisa += (camisa.getCantidadVendida()*camisa.getPrecio());
            break;
          
          case "Collar":
            Collar collar = (Collar) prenda;
            totalCollar += (collar.getCantidadVendida()*collar.getPrecio());
            break;  

          default:
            break;
        }
      }
      List <String> Ventas = List.of("Pantalones: " + totalPantalon, "Camisas: " + totalCamisa, "Collares: " + totalCollar);
      return Ventas;
    }


}
