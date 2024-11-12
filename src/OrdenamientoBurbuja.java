public class OrdenamientoBurbuja {

    /**
     * Método que ordena un arreglo de enteros utilizando el algoritmo de ordenamiento burbuja.
     * En cada pasada, el elemento más grande "burbujea" hacia el final del arreglo.
     * @param arr Arreglo de enteros a ordenar.
     */
    public static void ordenar(int[] arr) {
        int n = arr.length; // Longitud del arreglo

        // Recorre el arreglo varias veces, comparando elementos adyacentes
        for (int i = 0; i < n - 1; i++) {
            // Compara los elementos adyacentes y los intercambia si están en el orden incorrecto
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambia los elementos si están en el orden incorrecto
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Método principal que prueba el método de ordenamiento.
     * Crea un arreglo de enteros, lo ordena usando el método 'ordenar',
     * y luego imprime el arreglo ordenado en la consola.
     */
    public static void main(String[] args) {
        int[] numeros = {5, 3, 8, 4, 2}; // Arreglo de enteros desordenado

        ordenar(numeros); // Llama al método de ordenamiento por burbuja

        // Imprime el arreglo ordenado
        for (int num : numeros) {
            System.out.print(num + " "); // Imprime cada número del arreglo
        }
    }
}