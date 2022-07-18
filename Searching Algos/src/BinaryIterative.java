import java.util.Arrays;
import java.util.Scanner;
public class BinaryIterative
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements to be entered in array");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter array elements in sorted order");
        for (int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        Arrays.sort(ar);
        System.out.println("Enter element to be searched");
        int search = sc.nextInt();
        int pos=-1, min=0, max=n-1, mid;
        while(min<=max)
        {
        	mid=min+((max-min)/2);
        	if(ar[mid]==search)
        	{
        		pos=mid;
        		break;
        	}
        	else if(search>ar[mid])
        		min=mid+1;
        	else
        		max=mid-1;
        }
        if(pos==-1)
        	System.out.println("Element not found");
        else
        	System.out.println("Element "+search+" found in index "+pos);
	}
}
