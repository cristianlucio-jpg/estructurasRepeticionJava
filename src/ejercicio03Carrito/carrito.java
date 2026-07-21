package ejercicio03;

import java.util.Scanner;

/**
 * Clase carrito.
 * 
 * Objetivo: Calcular el total de una compra con varios productos.
 * 
 * Contenido temático:
 * - Ciclos for: permiten recorrer los productos ingresados.
 * - Acumuladores: suman los precios para obtener el total.
 * 
 * Ejemplo:
 * Ingrese: 3 productos con precios → Resultado: total de la compra.
 * 
 * @author Cristian Alexis Lucio Narváez
 */
public class carrito {

    /**
     * Método principal que ejecuta el programa.
     * 
     * Este método solicita al usuario la cantidad de productos,
     * luego lee los precios de cada uno y finalmente calcula
     * el total de la compra.
     * 
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de productos: ");
        int cantidadProductos = teclado.nextInt();

        double totalCompra = 0;

        // Se leen los precios de cada producto y se acumulan en totalCompra
        for (int i = 1; i <= cantidadProductos; i++) {
            System.out.print("Ingrese el precio del producto " + i + ": ");
            double precioProducto = teclado.nextDouble();
            totalCompra += precioProducto;
        }

        // Se muestra el resultado final
        System.out.println("El total de la compra es: $" + totalCompra);

        teclado.close(); // Buen hábito: cerrar el recurso Scanner
    }
}
