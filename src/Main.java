public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 10000; i++) {
            int number = i + 1;

            if (number % 3 == 0) {
                System.out.print("Fizz");
            }
            if (number % 5 == 0) {
                System.out.print("Buzz");
            }
            if ((number % 3 == 0 && number % 5 == 0)) {
                System.out.print(number);
            }
            System.out.println("");
        }

    }
}