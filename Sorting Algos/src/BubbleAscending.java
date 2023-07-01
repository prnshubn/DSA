import java.util.Scanner;

public class BubbleAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements to be entered in array");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++)
            ar[i] = sc.nextInt();

        //sorting
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] > ar[j]) {
                    int temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }

        System.out.println("The sorted array in ascending order is:");
        for (int i = 0; i < n; i++)
            System.out.print(ar[i] + " ");
    }
}
