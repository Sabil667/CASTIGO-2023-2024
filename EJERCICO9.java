import java.util.Scanner;

public class ProductoEscalar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = pedirDimension("Introduce la dimensión de los vectores: ", scanner);

        int[] vector1 = pedirVector("Introduce los elementos del primer vector:", n, scanner);
        int[] vector2 = pedirVector("Introduce los elementos del segundo vector:", n, scanner);

        int productoEscalar = calcularProductoEscalar(vector1, vector2);

        System.out.println("El producto escalar de los dos vectores es: " + productoEscalar);

        scanner.close();
    }

    // Función para pedir la dimensión de los vectores
    public static int pedirDimension(String mensaje, Scanner scanner) {
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    // Función para pedir los elementos de un vector
    public static int[] pedirVector(String mensaje, int dimension, Scanner scanner) {
        System.out.println(mensaje);
        int[] vector = new int[dimension];

        for (int i = 0; i < dimension; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }

        return vector;
    }

    // Función para calcular el producto escalar de dos vectores
    public static int calcularProductoEscalar(int[] vector1, int[] vector2) {
        int productoEscalar = 0;

        for (int i = 0; i < vector1.length; i++) {
            productoEscalar += vector1[i] * vector2[i];
        }

        return productoEscalar;
    }
}
