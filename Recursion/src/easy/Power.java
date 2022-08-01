package easy;
import java.util.Scanner;
public class Power
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base");
		int x=sc.nextInt();
		System.out.println("Enter index");
		int n=sc.nextInt();
		long result1=nPower(x,n);
		long result2=lognPower(x,n);
		System.out.println(x+"^"+n+" is: "+result1);
		System.out.println(x+"^"+n+" is: "+result2);
	}
	
	//here recursion stack height is "n", so it takes more memory
	public static long nPower(int x,int n)
	{
		if(n==0)
			return 1;
		if(x==0)
			return 0;
		long p=nPower(x,n-1);
		return x*p;
	}
	
	//here recursion stack height is "log(n)", so it takes less memory
	public static long lognPower(int x,int n)
	{
		if(n==0)
			return 1;
		if(x==0)
			return 0;
		
		//if n is even
		if((n&1)==0)
			return lognPower(x,n/2)*lognPower(x,n/2);
		
		//if n is odd
		else
			return lognPower(x,n/2)*lognPower(x,n/2)*x;
	}
}