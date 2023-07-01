import java.util.Scanner;

public class InsertionAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements to be entered in array");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++)
            ar[i] = sc.nextInt();

        //sorting
        for (int i = 1; i < n; i++) {
            int key = ar[i];
            int j = i - 1;
            while (j >= 0 && ar[j] > key) {
                ar[j + 1] = ar[j];
                j--;
            }
            ar[j + 1] = key;
        }

        System.out.println("The sorted array in ascending order is:");
        for (int i = 0; i < n; i++)
            System.out.print(ar[i] + " ");
    }
}