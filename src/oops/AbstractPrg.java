// Abstract Class
package oops;

abstract class Cricket
{
	abstract void test();
	abstract void oneday();
}

class Aussies extends Cricket
{
	@Override
	public void test() 
	{
		System.out.println("Australia Test Cricketer Steven Smith");
	}

	@Override
	public void oneday() 
	{
		System.out.println("Australia One-Day Cricketer David Warner");
	}
}

class England extends Cricket
{
	@Override
	public void test() 
	{
		System.out.println("England Test Cricketer Joe Root");
	}

	@Override
	public void oneday() 
	{
		System.out.println("England One-Day Cricketer Jos Buttler");		
	}
}

public class AbstractPrg
{
	public static void main(String[] args) 
	{	
		Aussies aus=new Aussies();
		aus.test();;
		aus.oneday();
		
		England eng=new England();
		eng.test();
		eng.oneday();
	}
}
