import java.util.Scanner;

public class PrintNTo1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		printNum(n);
	}
	public static void printNum(int n)
	{
		if(n==0)
			return;
		System.out.println(n);
		printNum(n-1);
	}
}