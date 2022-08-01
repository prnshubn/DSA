import java.util.Scanner;
public class Merge
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
        divide(ar,0,n-1);
        
        System.out.println("The sorted array is:");
        for (int i = 0; i < n; i++)
            System.out.print(ar[i]+" ");
	}
	
	public static void divide(int[] ar, int start, int end)
	{
		if(start>=end)
			return;
		int mid=start+(end-start)/2;
		divide(ar,start,mid);
		divide(ar,mid+1,end);
		conquer(ar,start,mid,end);
	}
	
	public static void conquer(int[] ar, int start, int mid, int end)
	{
		int[] merged=new int[end-start+1];
		int idx=0;
		int idx1=start;
		int idx2=mid+1;
		while(idx1<=mid && idx2<=end)
		{
			if(ar[idx1]<=ar[idx2])
				merged[idx++]=ar[idx1++];
			else
				merged[idx++]=ar[idx2++];
		}
		while(idx1<=mid)
			merged[idx++]=ar[idx1++];
		while(idx2<=end)
			merged[idx++]=ar[idx2++];
		for(int i=0,j=start;i<merged.length;i++,j++)
            ar[j]=merged[i];
	}
}