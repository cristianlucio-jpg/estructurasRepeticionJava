package ejercicio02;

import java.util.Scanner;

/**
 * Clase arreglo.
 * 
 * Objetivo: Leer un conjunto de números y mostrarlos en orden.
 * 
 * Contenido temático:
 * - Arreglos unidimensionales: permiten almacenar múltiples valores en una sola estructura.
 * - Ciclos for: recorren los elementos del arreglo para lectura y escritura.
 * 
 * Ejemplo:
 * Ingrese: 3 números → Resultado: se muestran en orden ingresado.
 * 
 * @author Cristian Alexis Lucio Narváez
 */
public class arreglo {

    /**
     * Método principal que ejecuta el programa.
     * 
     * Este método solicita al usuario la cantidad de elementos,
     * luego lee los números ingresados y finalmente los muestra
     * en el mismo orden en que fueron introducidos.
     * 
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos: ");
        int cantidadElementos = teclado.nextInt();

        // Se crea el arreglo con la cantidad indicada por el usuario
        int[] numeros = new int[cantidadElementos];

        // Se leen los números y se almacenan en el arreglo
        for (int i = 0; i < cantidadElementos; i++) {
            System.out.print("Ingrese número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        // Se muestran los números en el orden ingresado
        System.out.println("Elementos ingresados:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        teclado.close(); // Buen hábito: cerrar el recurso Scanner
    }
}
