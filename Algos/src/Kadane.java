import java.util.Scanner;
public class Kadane
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements to be entered in array");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter array elements in array");
        for (int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        
        //algorithm
        int currSum=0, maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
        	currSum+=ar[i];
        	if(maxSum>currSum)
        		maxSum=currSum;
        	if(currSum<0)
        		currSum=0;
        }
        System.out.println("The largest sum of continuous subaray is: "+maxSum);
	}
}
