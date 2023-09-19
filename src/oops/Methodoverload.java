// Method Overloading - CompileTimePolymorphism

package oops;

public class Methodoverload 
{
	public void add() 
	{
		int a=27,b=31,c;
		c=a+b;
		System.out.println(c);
	}
	
	public void add(int a,int b) 
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public void add(int a,double b) 
	{
		double c=a+b;
		System.out.println(c);
	}
	
	public void add(double a,int b) 
	{
		double c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
		Methodoverload method=new Methodoverload();
		method.add();	
		method.add(10,20);
		method.add(24,20.5);
		method.add(12.4,30);
	}
}
