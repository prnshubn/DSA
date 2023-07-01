public class ReverseArray {
    public static void main(String[] args) {
        int[] ar1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] ar2 = {10, 20, 30, 40, 50, 60, 70, 80};
        int n = ar1.length, start = 0, end = ar2.length - 1;
        reverseArrayOne(ar1, start, n);
        for (int i = 0; i < ar1.length; i++)
            System.out.print(ar1[i] + " ");
        System.out.println();
        reverseArrayTwo(ar2, start, end);
        for (int i = 0; i < ar2.length; i++)
            System.out.print(ar2[i] + " ");
    }

    //using one pointer
    public static void reverseArrayOne(int[] ar, int start, int n) {
        if (start > n / 2)
            return;
        int temp = ar[start];
        ar[start] = ar[n - start - 1];
        ar[n - start - 1] = temp;
        reverseArrayOne(ar, start + 1, n);
    }

    //using two pointers
    public static void reverseArrayTwo(int[] ar, int start, int end) {
        if (start >= end)
            return;
        int temp = ar[start];
        ar[start] = ar[end];
        ar[end] = temp;
        reverseArrayTwo(ar, start + 1, end - 1);
    }
}
