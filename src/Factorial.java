public class Factorial {
    public static void main(String[] args) {
        int factorial = 1;
        for (int i = 1; i <= 6; i++) {

            factorial = i * factorial;
        }
        System.out.println("factorial " + factorial);
    }
}
