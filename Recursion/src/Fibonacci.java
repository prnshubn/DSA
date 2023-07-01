import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int a = 0, b = 1;
        if (n <= 0)
            System.out.println("Invalid Input");
        else if (n == 1)
            System.out.println(a);
        else {
            System.out.print(a + "," + b + ",");
            fibonacci(a, b, n - 2);
        }
    }

    public static void fibonacci(int a, int b, int n) {
        if (n == 0)
            return;
        int c = a + b;
        System.out.print(c + ",");
        fibonacci(b, c, n - 1);
    }
}
