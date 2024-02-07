public class EJERCICIO3 {

    public static void main(String[] args) {
        int begin = 1;
        int end = 100;

        int suma = 0;
        int cantidadMultiplos = 0;

        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                suma += i;
                cantidadMultiplos++;
                System.out.println("Múltiplo de 5: " + i);
            }
        }

        System.out.println("La suma de los múltiplos de 5 es: " + suma);
        System.out.println("Cantidad de múltiplos de 5: " + cantidadMultiplos);
    }
}