// Static Final
package oops;

public class Finalprg 
{
	String name;
	static String city="Sydney";
	static final double pi=3.14;
	
	
	public static void main(String[] args) 
	{
		Finalprg obj=new Finalprg();
		System.out.println(obj.name="Isla");
		System.out.println(city);
		city="Paddington";
		System.out.println(city);
		System.out.println(obj.pi);

	}

}
