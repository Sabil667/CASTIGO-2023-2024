import java.util.Random;
import java.util.Scanner;

public class EJERCICIO10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la dimensión de la matriz cuadrada: ");
        int dimension = scanner.nextInt();

        int[][] matriz = generarMatrizSimetrica(dimension);

        // Imprimir la matriz por pantalla
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    // Función para generar una matriz cuadrada simétrica con números aleatorios
    public static int[][] generarMatrizSimetrica(int dimension) {
        int[][] matriz = new int[dimension][dimension];
        Random random = new Random();

        for (int i = 0; i < dimension; i++) {
            for (int j = i; j < dimension; j++) {
                int numeroAleatorio = random.nextInt(100) + 1; // Números aleatorios entre 1 y 100
                matriz[i][j] = numeroAleatorio;
                matriz[j][i] = numeroAleatorio; // Simetría
            }
        }

        return matriz;
    }
}
