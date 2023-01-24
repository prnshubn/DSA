import java.util.ArrayList;
import java.util.Scanner;

public class SubsequencesHavingTargetSum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		System.out.println("Enter the sum");
		int k=sc.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
			ar[i]=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		findSequences(0, ar, list, 0, k);
		System.out.println("End of all subsequences having sum "+k);
		findOneSequence(0, ar, list, 0, k);
		System.out.println("End of any one subsequence having sum "+k);
		System.out.println("Number of subsequences having sum "+k+" is: "+countSequences(0, ar, 0, k));
		
	}
	
	//printing all the subsequences having the sum k
	public static void findSequences(int idx, int[] ar, ArrayList<Integer> list, int s, int k)
	{
		if(idx==ar.length)
		{
			if(s==k)
				System.out.println(list);
			return;
		}
		list.add(ar[idx]);
		s+=ar[idx];
		findSequences(idx+1, ar, list, s, k);
		list.remove(list.size()-1);
		s-=ar[idx];
		findSequences(idx+1, ar, list, s, k);
	}
	
	//printing any one subsequence having sum k
	public static boolean findOneSequence(int idx, int[] ar, ArrayList<Integer> list, int s, int k)
	{
		if(idx==ar.length)
		{
			if(s==k)
			{
				System.out.println(list);
				return true;
			}
			else
				return false;
		}
		list.add(ar[idx]);
		s+=ar[idx];
		if(findOneSequence(idx+1, ar, list, s, k)==true)
			return true;
		list.remove(list.size()-1);
		s-=ar[idx];
		if(findOneSequence(idx+1, ar, list, s, k)==true)
			return true;
		return false;
	}
	
	//counting the number of subsequences having the sum k
	public static int countSequences(int idx, int[] ar, int s, int k)
	{
		if(s>k) //this base case can only be done if array contains positives only
			return 0;
		if(idx==ar.length)
		{
			if(s==k)
				return 1;
			return 0;
		}
		//list.add(ar[idx]);
		s+=ar[idx];
		int c1=countSequences(idx+1, ar, s, k);
		//list.remove(list.size()-1);
		s-=ar[idx];
		int c2=countSequences(idx+1, ar, s, k);
		return c1+c2;
	}
}