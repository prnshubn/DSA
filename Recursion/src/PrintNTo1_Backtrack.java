import java.util.Scanner;

public class PrintNTo1_Backtrack
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		int i=1;
		printNum(i,n);
	}
	public static void printNum(int i,int n)
	{
		if(i>n)
			return;
		printNum(i+1,n);
		System.out.println(i);
	}
}