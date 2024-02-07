import java.util.Scanner;

public class EJERCICIO6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el valor de N para los primeros N números primos: ");
        int n = scanner.nextInt();

        // Obtener la lista de los N primeros números primos
        int[] primos = obtenerPrimos(n);

        // Imprimir la lista de primos
        System.out.println("Los primeros " + n + " números primos son:");
        for (int primo : primos) {
            System.out.print(primo + " ");
        }

        scanner.close();
    }

    // Función para obtener los N primeros números primos
    public static int[] obtenerPrimos(int n) {
        int[] primos = new int[n];
        int count = 0; // Contador de números primos encontrados
        int numero = 2; // Comenzar desde el primer número primo

        while (count < n) {
            if (esPrimo(numero)) {
                primos[count] = numero;
                count++;
            }
            numero++;
        }

        return primos;
    }

    // Función para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
