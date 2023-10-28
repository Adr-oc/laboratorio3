package model;

public class Collar extends Prenda {

    private String talla;
    private String material;

    public Collar(int id, String nombre, int cantidadDisponible, int cantidadVendida, String estado, Double precio, String talla, String material) {
        super(id, nombre, cantidadDisponible, cantidadVendida, estado, precio);
        this.talla = talla;
        this.material = material;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMaterial() {
        return material;
    }
    
}