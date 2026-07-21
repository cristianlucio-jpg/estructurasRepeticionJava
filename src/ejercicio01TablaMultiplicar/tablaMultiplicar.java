package ejercicio01;

import java.util.Scanner;

/**
 * Clase tablaMultiplicar.
 * 
 * Objetivo: Mostrar la tabla de multiplicar de un número ingresado.
 * 
 * Contenido temático:
 * - Estructuras de repetición (for): permiten ejecutar un bloque de código
 *   varias veces, en este caso para calcular cada producto de la tabla.
 * - Entrada de datos con Scanner: captura el número ingresado por el usuario.
 * - Salida de datos con System.out: muestra la tabla en pantalla.
 * 
 * Ejemplo:
 * Ingrese: 5 → Resultado: 5x1=5 ... 5x10=50
 * 
 * @author Cristian Alexis Lucio Narváez
 */
public class tablaMultiplicar {

    /**
     * Método principal que ejecuta el programa.
     * 
     * Este método solicita al usuario un número entero y muestra en pantalla
     * su tabla de multiplicar del 1 al 10.
     * 
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numeroBase = teclado.nextInt();

        // El bucle for recorre los valores del 1 al 10.
        // En cada iteración se calcula el producto y se muestra en pantalla.
        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroBase + " x " + i + " = " + (numeroBase * i));
        }

        teclado.close(); // Buen hábito: cerrar el recurso Scanner
    }
}
