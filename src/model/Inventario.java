package model;
import java.util.ArrayList;
import java.util.List;

public class Inventario{

    private List<Prenda> prendas;

    public Inventario(){
        this.prendas = new ArrayList<>();
    }

    public void addPrenda(Prenda prenda){
        this.prendas.add(prenda);
    }

    public List<Prenda> getPrendas(){
        return this.prendas;
    }



}