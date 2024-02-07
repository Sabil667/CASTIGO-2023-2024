import java.util.Scanner;

public class EJERCICIO4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int minimo = Integer.MAX_VALUE;
        int maximo = Integer.MIN_VALUE;

        System.out.println("Introduce números enteros positivos. Introduce un número negativo para finalizar.");

        do {
            System.out.print("Introduce un número: ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                // Verificar mínimo y máximo
                minimo = Math.min(minimo, numero);
                maximo = Math.max(maximo, numero);
            }
        } while (numero >= 0);

        if (minimo == Integer.MAX_VALUE && maximo == Integer.MIN_VALUE) {
            System.out.println("No se introdujeron números positivos.");
        } else {
            System.out.println("El mínimo de la lista es: " + minimo);
            System.out.println("El máximo de la lista es: " + maximo);
        }

        scanner.close();
    }
}
