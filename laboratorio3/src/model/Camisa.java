package model;

public class Camisa extends Prenda {

    private String talla;
    private String color;

    public Camisa(int id ,String nombre, int cantidadDisponible, int cantidadVendida, String estado, double precio, String talla, String color) {
        super(id, nombre, cantidadDisponible, cantidadVendida, estado, precio);
        this.talla = talla;
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}

