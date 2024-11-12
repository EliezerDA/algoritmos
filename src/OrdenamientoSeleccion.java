import java.util.Scanner;

public class OrdenamientoSeleccion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lectura de la cantidad de números
        System.out.print("\n¿Cuántos números quieres ingresar? ");
        int n = scanner.nextInt();

        // Crear el arreglo para almacenar los números
        int[] numeros = new int[n];

        // Lectura de los números ingresados por el usuario
        System.out.println("Ingresa los números:");
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Ordenar el arreglo utilizando el algoritmo de selección
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Encontrar el índice del mínimo en la sublista no ordenada
            for (int j = i + 1; j < n; j++) {
                if (numeros[j] < numeros[minIndex]) {
                    minIndex = j;
                }
            }

            // Intercambiar el valor mínimo encontrado con el primer elemento de la sublista no ordenada
            int temp = numeros[minIndex];
            numeros[minIndex] = numeros[i];
            numeros[i] = temp;
        }

        // Imprimir la lista ordenada
        System.out.print("Lista ordenada: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
