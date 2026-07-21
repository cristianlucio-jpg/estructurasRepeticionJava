package ejercicio04;

import java.util.Scanner;

/**
 * Clase promedioNotas.
 * 
 * Objetivo: Calcular el promedio de notas de un estudiante.
 * 
 * Contenido temático:
 * - Ciclos for: permiten recorrer las notas ingresadas.
 * - Acumuladores: suman los valores para calcular el promedio.
 * - Operaciones aritméticas: división para obtener el resultado final.
 * 
 * Ejemplo:
 * Ingrese: 4 notas → Resultado: promedio final.
 * 
 * @author Cristian Alexis Lucio Narváez
 */
public class promedioNotas {

    /**
     * Método principal que ejecuta el programa.
     * 
     * Este método solicita al usuario la cantidad de notas,
     * luego lee cada una de ellas, calcula la suma total
     * y finalmente obtiene el promedio dividiendo entre
     * la cantidad de notas ingresadas.
     * 
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de notas: ");
        int cantidadNotas = teclado.nextInt();

        double sumaNotas = 0;

        // Se leen las notas y se acumulan en sumaNotas
        for (int i = 1; i <= cantidadNotas; i++) {
            System.out.print("Ingrese la nota " + i + ": ");
            double nota = teclado.nextDouble();
            sumaNotas += nota;
        }

        // Se calcula el promedio final
        double promedioFinal = sumaNotas / cantidadNotas;

        // Se muestra el resultado
        System.out.println("El promedio es: " + promedioFinal);

        teclado.close(); // Buen hábito: cerrar el recurso Scanner
    }
}
