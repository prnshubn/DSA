import java.util.ArrayList;
import java.util.Scanner;

public class CombinationSum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the sum");
        int k = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        combinationSum(0, ar, list, k);
    }

    public static void combinationSum(int idx, int[] ar, ArrayList<Integer> list, int k) {
        if (idx == ar.length) {
            if (k == 0)
                System.out.println(list);
            return;
        }
        if (ar[idx] <= k) {
            list.add(ar[idx]);
            combinationSum(idx, ar, list, k - ar[idx]);
            list.remove(list.size() - 1);
        }
        combinationSum(idx + 1, ar, list, k);
    }
}
