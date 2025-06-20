package main.java.org.ejercicio1;

public class MostrarPreciosProductos {
    public static void main(String[] args) {
        double[] precios = {12.5, 8.99, 4.5, 15.0, 23.75, 6.8, 9.99, 10.0, 13.45, 7.3,
                19.99, 3.0, 5.25, 11.5, 14.75};

        System.out.println("Precios de los productos:");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Producto " + (i + 1) + ": $" + precios[i]);
        }
    }
}
