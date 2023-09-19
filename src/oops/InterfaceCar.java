//Interface

package oops;

interface Car_details
{	
	public void price();
	public void color();	
}

interface Car_accessories extends Car_details
{
	public void acceleration();
	public void speed();		
}

class Kia implements Car_accessories
{
	@Override
	public void price() 
	{
		System.out.println("Kia Price");
	}
	@Override
	public void color() 
	{
		System.out.println("Kia Color");
	}
	@Override
	public void acceleration() 
	{
		System.out.println("Kia Acceleration");
	}
	@Override
	public void speed() 
	{
		System.out.println("Kia Speed");
	}
}
	
class Benz implements Car_accessories
{
	@Override
	public void price() 
	{
		System.out.println("Benz Price");
	}
	@Override
	public void color() 
	{
		System.out.println("Benz Color");
	}
	@Override
	public void acceleration() 
	{
		System.out.println("Benz Acceleration");
	}
	@Override
	public void speed() 
	{
		System.out.println("Benz Speed");
	}
}

public class InterfaceCar 
{
	public static void main(String[] args) 
	{
		 Car_accessories ob=new Kia();
		 ob.price();
		 ob.color();
		 ob.acceleration();
		 ob.speed();
		 ob=new Benz();
		 ob.price();
		 ob.color();
		 ob.acceleration();
		 ob.speed();
	}

}
