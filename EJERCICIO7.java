import java.util.Scanner;
import java.util.ArrayList;

public class FactoresPrimos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        // Obtener factores primos del número
        ArrayList<Integer> factoresPrimos = descomponerEnFactoresPrimos(numero);

        // Imprimir los factores primos
        System.out.println("Los factores primos de " + numero + " son: " + factoresPrimos);

        scanner.close();
    }

    // Función para descomponer un número en factores primos
    public static ArrayList<Integer> descomponerEnFactoresPrimos(int numero) {
        ArrayList<Integer> factoresPrimos = new ArrayList<>();
        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                factoresPrimos.add(i);
                numero /= i;
            }
        }
        return factoresPrimos;
    }
}
