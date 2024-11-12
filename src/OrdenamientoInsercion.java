import java.util.Scanner;

public class OrdenamientoInsercion {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario cuántos números desea ingresar
        System.out.print("\n¿Cuántos números quieres ingresar? ");
        int n = scanner.nextInt(); // Guardamos el número de elementos que el usuario quiere ingresar

        // Crear un arreglo de enteros para almacenar los números
        int[] numeros = new int[n];

        // Solicitar al usuario que ingrese los números
        System.out.println("Ingresa los números:");
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt(); // Almacenamos cada número ingresado en el arreglo
        }

        // Aplicar el algoritmo de ordenamiento por inserción
        for (int i = 1; i < n; i++) {
            int clave = numeros[i]; // Tomamos el elemento actual (clave) para compararlo con los anteriores
            int j = i - 1; // Empezamos a comparar con el elemento anterior a la clave

            // Desplazar los elementos mayores que la clave una posición hacia la derecha
            while (j >= 0 && numeros[j] > clave) {
                numeros[j + 1] = numeros[j]; // Desplazamos el elemento hacia la derecha
                j = j - 1; // Continuamos comparando con el siguiente elemento anterior
            }

            // Insertar la clave en su posición correcta
            numeros[j + 1] = clave; // Colocamos la clave en su lugar en el arreglo
        }

        // Imprimir el arreglo ordenado
        System.out.print("Lista ordenada: ");
        for (int numero : numeros) {
            System.out.print(numero + " "); // Imprimir cada número de la lista ordenada
        }
    }
}
