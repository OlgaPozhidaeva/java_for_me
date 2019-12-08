public class Fibonacci {

    public static void main(String[] args) {
        int one = 0;
        int next = 1;
        for (int i = 0; i < 10; i++) {
            next = one + next;
            one = next - one;
            System.out.println(next);
        }
    }
}
