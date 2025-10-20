public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        int suma = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 1) {
                suma += i;
            }
        }
        System.out.println("Suma brojeva je: " + suma);
    }
// testing remote push
}