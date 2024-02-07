
public class EJERCICIO1 {

    public static void main(String[] args) {
        // Definir variables
        int diasEnUnAnio = 365;
        int horasEnUnDia = 24;
        int minutosEnUnaHora = 60;
        int segundosEnUnMinuto = 60;

        // Calcular el número total de segundos en un año
        int segundosEnUnAnio = calcularSegundosEnUnAnio(diasEnUnAnio, horasEnUnDia, minutosEnUnaHora, segundosEnUnMinuto);

        // Imprimir el resultado
        System.out.println("El número de segundos en un año es: " + segundosEnUnAnio);
    }

    // Función para calcular el número de segundos en un año
    public static int calcularSegundosEnUnAnio(int dias, int horas, int minutos, int segundos) {
        return dias * horas * minutos * segundos;
    }
}
