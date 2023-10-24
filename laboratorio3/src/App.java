import java.io.IOException;
import java.util.List;
import java.util.ResourceBundle.Control;
import controller.Controller;
import model.Camisa;
import model.Inventario;
import model.Pantalon;
import model.Prenda;
import utils.CSVReader;
import view.Vista;

public class App {
    public static void main(String[] args) throws Exception {
        Vista vista = new Vista();
        vista.menu();
    }
}