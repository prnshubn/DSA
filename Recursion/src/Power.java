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
		System.out.println("Power of "+x+"^"+n+" is: "+power(x,n));
		System.out.println("Power of "+x+"^"+n+" is: "+logPower(x,n));
	}
	
	//height of recursion stack is O(n) hence TC is O(n)
	public static double power(int x, int n)
	{
		if(n<0)
			return (1/power(x,-n));
		if(n==0)
			return 1;
		else
			return x*power(x,n-1);
	}
	
	//height of recursion stack is O(log(n)) hence TC is O(log(n))
	public static double logPower(int x,int n)
	{
		if(n==0)
			return 1;
		if(n<0)
			return (1/logPower(x,-n));
		if(n%2==0)
			return logPower(x,n/2)*logPower(x,n/2);
		else
			return (x*logPower(x,(n-1)/2)*logPower(x,(n-1)/2));
	}
}