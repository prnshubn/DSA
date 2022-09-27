public class ReverseArray
{
	public static void main(String[] args)
	{
		int[] ar= {1,2,3,4,5,6,7,8};
		int n=ar.length,startIdx=0,endIdx=ar.length-1;
		reverseArray(ar,startIdx,n);
		for(int i=0;i<ar.length;i++)
			System.out.print(ar[i]+" ");
	}
	//using one pointer
	public static void reverseArray(int[] ar,int start,int n)
	{
		if(start>=n/2)
			return;
		int temp=ar[start];
		ar[start]=ar[n-start-1];
		ar[n-start-1]=temp;
		reverseArray(ar, start+1, n);
	}
	
	//using two pointers
	/*
	public static void reverseArray(int[] ar,int start,int end)
	{
		if(start>=end)
			return;
		int temp=ar[start];
		ar[start]=ar[end];
		ar[end]=temp;
		reverseArray(ar, start+1, end-1);
	}
	*/
}