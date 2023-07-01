import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CombinationSum2 {
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
        Arrays.sort(ar);
        ArrayList<Integer> list = new ArrayList<>();
        combinationSum(0, ar, list, k);
    }

    public static void combinationSum(int idx, int[] ar, ArrayList<Integer> list, int k) {
        if (k == 0) {
            System.out.println(list);
            return;
        }
        for (int i = idx; i < ar.length; i++) {
            if (i > idx && ar[i] == ar[i - 1])
                continue;
            if (ar[i] > k)
                break;
            list.add(ar[i]);
            combinationSum(i + 1, ar, list, k - ar[i]);
            list.remove(list.size() - 1);
        }
    }
}
