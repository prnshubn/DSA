import java.util.Scanner;
public class Quick
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements to be entered in array");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        
        //sorting
        
        System.out.println("The sorted array is:");
        for (int i = 0; i < n; i++)
            System.out.print(ar[i]+" ");
	}
}