import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(fibonacci(input));
    }

    public static int fibonacci(int input) {
        int result;
        if (input == 0) {
            result = 0;
        }
        if (input == 1 || input == 2) {
            result = 1;
        }
        else {
        result = fibonacci(input - 1) + fibonacci(input - 2);}
        return result;
    }


}
