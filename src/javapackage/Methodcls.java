package javapackage;

public class Methodcls 
{
	public static void main(String[] args) 
	{
		Methodcls obj=new Methodcls();
		obj.add();
		int subvalue=obj.sub();
		System.out.println("subvalue = "+subvalue);
		obj.mul(3,2);
		double divan=obj.div(40.5,2.5);
		System.out.println("division = "+divan);
	}
	
	//Method without parameter & return type
	public void add()
	{
		int a=10,b=4,c;
		c=a+b;
		System.out.println("Sum c = "+c);
	}
	
	//Method without parameter & with return type
	public int sub()
	{
		int a=10,b=5,c;
		c=a-b;
		return c;
	}
	
	//Method with parameter & without return type
	public void mul(int a, int b)
	{
		int c=a*b;
		System.out.println("Multiple of c = "+c);
	}
	
	//Method with parameter & return type
	public double div(double a,double b)
	{
		double c=a/b;
		return c;
	}
}

