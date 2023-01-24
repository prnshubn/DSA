

import java.util.Scanner;

public class PrintNTo1_Backtrack
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		int i=1;
		print(i,n);
	}
	public static void print(int i, int n)
	{
		if(i>n)
			return;
		print(i+1,n);
		System.out.println(i);
	}
}
