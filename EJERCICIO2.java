
public class EJERCICIO2 {

    public static void main(String[] args) {
        mostrarMaximoChar();
        mostrarMaximoShort();
        mostrarMaximoInt();
    }

    public static void mostrarMaximoChar() {
        char maxChar = Character.MAX_VALUE;
        System.out.println("Mayor número entero representable con char: " + (int) maxChar);
    }

    public static void mostrarMaximoShort() {
        short maxShort = Short.MAX_VALUE;
        System.out.println("Mayor número entero representable con short: " + maxShort);
    }

    public static void mostrarMaximoInt() {
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Mayor número entero representable con int: " + maxInt);
    }
}
