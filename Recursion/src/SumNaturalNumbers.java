//functional way

import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        long result = sumNatural(n);
        System.out.println("Sum of n natural numbers is: " + result);
    }

    public static long sumNatural(int n) {
        if (n == 0)
            return 0;
        return n + sumNatural(n - 1);
    }
}

//parameterized way
/*
import java.util.Scanner;
public class SumNaturalNumbers
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		sumNatural(1,n,0);
	}

	public static void sumNatural(int i, int n, int sum)
	{
		if(i==n)
		{
			sum+=n;
			System.out.println("Sum of n natural numbers is: "+sum);
			return;
		}
		sum+=i;
		sumNatural(i+1,n,sum);
	}
}
*/