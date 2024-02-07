import java.util.Scanner;

public class EJERCICIO6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el valor de N para los primeros N números primos: ");
        int n = scanner.nextInt();

        int[] primos = obtenerPrimos(n);

        System.out.println("Los primeros " + n + " números primos son: " + java.util.Arrays.toString(primos));

        scanner.close();
    }

    public static int[] obtenerPrimos(int n) {
        int[] primos = new int[n];
        for (int count = 0, numero = 2; count < n; numero++) {
            if (esPrimo(numero)) {
                primos[count++] = numero;
            }
        }
        return primos;
    }

    public static boolean esPrimo(int numero) {
        return numero >= 2 && java.util.stream.IntStream.rangeClosed(2, (int) Math.sqrt(numero)).noneMatch(i -> numero % i == 0);
    }
}
