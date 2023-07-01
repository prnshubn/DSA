/*
 * subsequence means it can be contiguous/non-contiguous but it follows the order
 * eg-> [3,1,2]
 * the subsequences of [3,1,2] are: [],[3],[1],[2],[3,1],[1,2],[3,2],[3,1,2]. Here elements are in order.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ArraySubsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        findSequences(0, ar, list);
    }

    public static void findSequences(int idx, int[] ar, ArrayList<Integer> list) {
        if (idx == ar.length) {
            System.out.println(list);
            return;
        }
        list.add(ar[idx]);
        findSequences(idx + 1, ar, list);
        list.remove(list.size() - 1);
        findSequences(idx + 1, ar, list);
    }
}