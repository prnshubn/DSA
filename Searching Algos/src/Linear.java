import java.util.Scanner;
public class Linear
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
        int pos=-1;
        
        //search
        for(int i=0;i<n;i++)
        {
        	if(ar[i]==search)
        		pos=i;
        }
        if(pos==-1)
        	System.out.println("Element not found");
        else
        	System.out.println("Element "+search+" found in index "+pos);
	}
}