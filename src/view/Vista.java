package view;
import java.util.List;
import java.util.Scanner;
import controller.Controller;
import model.Inventario;

public class Vista {
    Controller controller = new Controller();
    Inventario inventario = controller.getInventario();
    Scanner scanner = new Scanner(System.in);

    public Vista() {
        this.controller = controller;
        this.inventario = inventario;
    }
    
    public void menu() {
        String choice = "";
        while (!choice.equals("4")) {

            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("Tienda de ropa");
            System.out.println("1. Ver inventario");
            System.out.println("2. Ver productos por categoría");
            System.out.println("3. Ver ventas de todas las categorías");
            System.out.println("4. Salir");

            choice = scanner.nextLine();
            System.out.print("\033[H\033[2J");
            System.out.flush();

            switch (choice) {
                case "1":
                    displayInventory();
                    
                    break;
                case "2":
                    displayProductsByCategory();
                    break;
                case "3":
                    displaySalesByCategory();
                    break;
                case "4":
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elija una opción del 1 al 4.");
                    break;
            }
        }
    }
    

    public void displayInventory() {
        List<String> prodCategoria = controller.getCaDisponibles(inventario.getPrendas());
        System.out.println("Productos disponibles: ");
        for (String string : prodCategoria) {
            System.out.println(string);
        }
        System.out.println("Presione Enter para continuar...");
        scanner.nextLine();
        
    }

    public void displayProductsByCategory() {
        System.out.println("Eliga una categoría: ");
        System.out.println("1. Pantalones");
        System.out.println("2. Camisas");
        System.out.println("3. Collares");
        String choice = scanner.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        switch (choice) {
            case "1":
                List<String> prodCategoria = controller.getProdCategoria(inventario.getPrendas(), "Pantalon");
                System.out.println("Pantalones disponibles: ");
                System.out.println("");
                System.out.println("ID  Nombre");
                for (String string : prodCategoria) {
                    System.out.println(string);
                }
                System.out.println("Presione Enter para continuar...");
                scanner.nextLine();
                break;
            case "2":
                List<String> prodCategoria2 = controller.getProdCategoria(inventario.getPrendas(), "Camisa");
                System.out.println("Camisas disponibles: ");
                System.out.println("");
                System.out.println("ID  Nombre");
                for (String string : prodCategoria2) {
                    System.out.println(string);
                }
                System.out.println("Presione Enter para continuar...");
                scanner.nextLine();
                break;
            case "3":
                List<String> prodCategoria3 = controller.getProdCategoria(inventario.getPrendas(), "Collar");
                System.out.println("Collares disponibles: ");
                for (String string : prodCategoria3) {
                    System.out.println(string);
                }
                System.out.println("Presione Enter para continuar...");
                scanner.nextLine();
                break;
            default:
                System.out.println("Opción inválida. Por favor, elija una opción del 1 al 3.");
                break;
        }
    }

    public void displaySalesByCategory() {
        List<String> salesCategory = controller.getVentasCategoria(inventario.getPrendas());
        System.out.println("Ventas por categoría: ");
        System.out.println("");
        System.out.println("Categoría  Ventas(Q)");
        for (String string : salesCategory) {
            System.out.println(string);
        }
        System.out.println("Presione Enter para continuar...");
        scanner.nextLine(); 
    }

}
