
package ejercicio05;

import java.util.Scanner;

/**
 * Clase registrosVentas.
 * 
 * Objetivo: Registrar ventas y calcular el total.
 * 
 * Contenido temático:
 * - Ciclos for: permiten recorrer las ventas ingresadas.
 * - Acumuladores: suman los valores para obtener el total.
 * - Entrada y salida de datos: interacción con el usuario.
 * 
 * Ejemplo:
 * Ingrese: 5 ventas → Resultado: total de ventas.
 * 
 * @author Cristian Alexis Lucio Narváez
 */
public class registrosVentas {

    /**
     * Método principal que ejecuta el programa.
     * 
     * Este método solicita al usuario la cantidad de ventas,
     * luego lee el valor de cada una y finalmente calcula
     * el total de todas las ventas registradas.
     * 
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de ventas: ");
        int cantidadVentas = teclado.nextInt();

        double totalVentas = 0;

        // Se leen los valores de cada venta y se acumulan en totalVentas
        for (int i = 1; i <= cantidadVentas; i++) {
            System.out.print("Ingrese el valor de la venta " + i + ": ");
            double valorVenta = teclado.nextDouble();
            totalVentas += valorVenta;
        }

        // Se muestra el resultado final
        System.out.println("El total de ventas es: $" + totalVentas);

        teclado.close(); // Buen hábito: cerrar el recurso Scanner
    }
}
