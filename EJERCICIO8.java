import java.util.Scanner;

public class EJERCICIO8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = recibirNumerosPorTeclado(scanner);

        double media = calcularMedia(numeros);
        int minimo = calcularMinimo(numeros);
        int maximo = calcularMaximo(numeros);

        System.out.println("Media: " + media);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Máximo: " + maximo);

        scanner.close();
    }

    public static int[] recibirNumerosPorTeclado(Scanner scanner) {
        System.out.println("Introduce números enteros. Introduce 0 para finalizar.");

        int[] numeros = new int[100];
        int index = 0, numero;

        while ((numero = scanner.nextInt()) != 0) {
            numeros[index++] = numero;
        }

        return java.util.Arrays.copyOf(numeros, index);
    }

    public static double calcularMedia(int[] array) {
        return java.util.Arrays.stream(array).average().orElse(0);
    }

    public static int calcularMinimo(int[] array) {
        return java.util.Arrays.stream(array).min().orElse(0);
    }

    public static int calcularMaximo(int[] array) {
        return java.util.Arrays.stream(array).max().orElse(0);
    }
}
