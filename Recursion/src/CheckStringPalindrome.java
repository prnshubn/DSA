

import java.util.Scanner;

public class CheckStringPalindrome
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		int n=s.length();
		boolean result=checkPalindrome(s,0,n-1);
		if(result)
			System.out.println("String is palindrome :)");
		else
			System.out.println("String is not palindrome :(");
	}
	public static boolean checkPalindrome(String s, int start, int end)
	{
		if(start>=end)
			return true;
		if(s.charAt(start)!=s.charAt(end))
			return false;
		return checkPalindrome(s,start+1,end-1);
	}
}