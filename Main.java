package tienda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de la Tienda ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Buscar producto por ID");
            System.out.println("4. Eliminar producto por ID");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Precio: ");
                    double precio = scanner.nextDouble();
                    tienda.agregarProducto(new Producto(id, nombre, precio));
                    break;
                case 2:
                    tienda.listarProductos();
                    break;
                case 3:
                    System.out.print("ID a buscar: ");
                    int buscarId = scanner.nextInt();
                    Producto encontrado = tienda.buscarProducto(buscarId);
                    if (encontrado != null)
                        System.out.println("Producto encontrado: " + encontrado);
                    else
                        System.out.println("Producto no encontrado.");
                    break;
                case 4:
                    System.out.print("ID a eliminar: ");
                    int eliminarId = scanner.nextInt();
                    if (tienda.eliminarProducto(eliminarId))
                        System.out.println("Producto eliminado.");
                    else
                        System.out.println("Producto no encontrado.");
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
