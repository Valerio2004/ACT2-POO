package tienda;

import java.util.ArrayList;
import java.util.Iterator;

public class Tienda {
    private ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("La tienda no tiene productos.");
        } else {
            productos.forEach(System.out::println);
        }
    }

    public Producto buscarProducto(int id) {
        for (Producto p : productos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public boolean eliminarProducto(int id) {
        Iterator<Producto> iterator = productos.iterator();
        while (iterator.hasNext()) {
            Producto p = iterator.next();
            if (p.getId() == id) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
}
