import java.util.Scanner;
public class BinaryRecursive
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
        System.out.println("Enter element to be searched");
        int search = sc.nextInt();
        int pos=binarySearch(ar, search, 0, n);
        if(pos==-1)
        	System.out.println("Element not found");
        else
        	System.out.println("Element "+search+" found in index "+pos);
	}
	
	public static int binarySearch(int[] ar, int search, int min, int max)
	{
		int mid;
		while(min<=max)
		{
			mid=min+((max-min)/2);
			if(ar[mid]==search)
			{
				return mid;
			}
			else if(search>ar[mid])
				return binarySearch(ar, search, mid+1, max);
			else
				return binarySearch(ar, search, min, mid-1);
		}
		return -1;
	}
}
