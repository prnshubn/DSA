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
        quickSort(ar,0,n-1);
        
        System.out.println("The sorted array is:");
        for (int i = 0; i < n; i++)
            System.out.print(ar[i]+" ");
	}
	
	public static void quickSort(int[] ar, int low, int high)
	{
		if(low<high)
		{
			int pivotIdx=partition(ar,low, high);
			quickSort(ar, low, pivotIdx-1);
			quickSort(ar, pivotIdx+1, high);
		}
	}
	
	public static int partition(int[] ar, int low, int high)
	{
		int pivot=ar[high];
		int i=low-1;
		for(int j=low;j<high;j++)
		{
			if(ar[j]<pivot)
			{
				i++;
				//swap
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		}
		//swap with pivot
		i++;
		int temp=ar[i];
		ar[i]=ar[high];
		ar[high]=temp;
		return i; //returning pivot index
	}
}