import java.util.Scanner;

public class Print1ToN_Backtrack
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
		if(n<1)
			return;
		printNum(n-1);
		System.out.println(n);
	}
}