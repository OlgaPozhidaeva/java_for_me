public class Fibonacci {

    public static void main(String[] args) {
     int one = 0;
     int two = 1;
     for (int i = 0; i < 10; i++){
         two = one + two;
         one = two - one;
            System.out.println(i);
        }
    }
}
