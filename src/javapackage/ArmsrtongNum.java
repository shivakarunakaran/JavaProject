package javapackage;

public class ArmsrtongNum 
{	
	public static void main(String[] args)
	{
		int n=153;
		int temp=n;
		int p=0;	
		while(n>0)
		{
			int rem=n%10;
			p=(p)+(rem*rem*rem);
			n=n/10;
		}
		if(p==temp)
			System.out.println(p);
		else
			System.out.println("Not Match");
	}
}