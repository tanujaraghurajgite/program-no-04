//program no:04 write a java program to calculate to find out whether the given string is pallindrom or not
import java.io.*;
import java.util.*;
class stringpalindromornot
{
	public static void main(String args[])
	{
		String x,y="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string you want to ckeck=");
		x=sc.next();
		int n=x.length();
		for(int i=n-1;i>=0;i--)
		{
			y=y+x.charAt(i);
		}
		if(x.equalsIgnoreCase(y))
		{
			System.out.println("The string is palindrom");
		}
		else
		{
			System.out.println("The string is not palindrom");
		
		}
	}
}
		
		