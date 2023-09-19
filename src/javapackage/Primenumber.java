// PrimeNumber with parameter & with return type

package javapackage;

public class Primenumber 
{	
	public static void main(String[] args) 
	{
		 int n=43;
		 if(isprime(n))
		 {
			 System.out.println(n+" is a prime number");
		 }
		 else
		 {
			 System.out.println(n+" is not prime number");
		 }
	}
	
	public static boolean isprime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}return true;
	}
}