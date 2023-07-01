import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        long result = factorial(n);
        System.out.println("Factorial of number is: " + result);
    }

    public static long factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }
}
