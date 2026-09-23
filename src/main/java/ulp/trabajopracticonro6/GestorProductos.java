/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ulp.trabajopracticonro6;

import java.util.TreeSet;

/**
 *
 * @author sgort
 */
public class GestorProductos {

    private TreeSet<Producto> productos;

    public GestorProductos() {
        productos = new TreeSet<>();
    }

    public TreeSet<Producto> getProductos() {
        return productos;
    }

    public boolean agregarProducto(Producto producto) {
        return productos.add(producto);
    }

    public boolean eliminarProducto(Producto producto) {
        return productos.remove(producto);
    }
}
