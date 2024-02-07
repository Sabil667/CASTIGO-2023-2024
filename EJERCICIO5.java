public class EJERCICIO5 {

    public static void main(String[] args) {
        int n = 10;

        // Obtener la tabla de multiplicar para los 10 primeros números naturales
        int[][] tablas = obtenerTablasDeMultiplicar(n);

        // Imprimir las tablas de multiplicar
        for (int i = 0; i < tablas.length; i++) {
            System.out.println("Tabla de multiplicar del " + i + ":");
            for (int j = 0; j < tablas[i].length; j++) {
                System.out.println(i + " x " + j + " = " + tablas[i][j]);
            }
            System.out.println(); // Nueva línea para formato
        }
    }

    // Función para obtener las tablas de multiplicar de los N primeros números
    public static int[][] obtenerTablasDeMultiplicar(int n) {
        int[][] tablas = new int[n][10];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                tablas[i][j] = i * j;
            }
        }

        return tablas;
    }
}
