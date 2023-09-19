// Encapsulation
package oops;

class Employe
{
	private String name; 
	private int age;
	private String city;
	
	public String getname() 
	{
		return name;
	}
	public void setname(String name) 
	{
		this.name = name;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public String getcity()
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city=city;
	}
}

public class EncapPrgm 
{
	public static void main(String[] args) 
	{
		Employe obj=new Employe();
		obj.setname("Isla Rose ");
		System.out.println(obj.getname());
		obj.setAge(24);
		System.out.println(obj.getAge());
		obj.setCity("Sydney");
		System.out.println(obj.getcity());
	}
}
