package model;

public class Pantalon extends Prenda {

    private String talla;
    private String tipo;

    public Pantalon(int id ,String nombre, int cantidadDisponible, int cantidadVendida, String estado, double precio, String talla, String tipo) {
        super(id, nombre, cantidadDisponible, cantidadVendida, estado, precio);
        this.talla = talla;
        this.tipo = tipo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
