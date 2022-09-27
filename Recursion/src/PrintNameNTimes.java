import java.util.Scanner;

public class PrintNameNTimes
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String s=sc.nextLine();
		System.out.println("Enter how many times you want to print");
		int n=sc.nextInt();
		printName(s,n);
	}
	public static void printName(String s,int n)
	{
		if(n==0)
			return;
		System.out.println(s);
		printName(s,n-1);
	}
}
