import java.util.Scanner;
public class SelectionDescending
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
        for(int i=0;i<n;i++)
        {
        	int min=i;
        	for(int j=i+1;j<n;j++)
        	{
        		if(ar[j]>ar[min])
        			min=j;
        	}
        	int temp=ar[min];
        	ar[min]=ar[i];
        	ar[i]=temp;
        }
        
        System.out.println("The sorted array in descending order is:");
        for (int i = 0; i < n; i++)
            System.out.print(ar[i]+" ");
	}
}
