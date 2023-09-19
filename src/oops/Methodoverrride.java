// MethodOverriding - RunTimePolymorphism 
package oops;

class Phone //ParentClass
{
	 void display() 
	{
		System.out.println("Huawei ");
	}
}

class Model extends Phone //ChildClass
{
	@Override
	 void display() 
	{
		super.display();
		System.out.println("'P20'Lite");
	}
}

public class Methodoverrride 
{
	public static void main(String[] args) 
	{
		Model m=new Model();
		m.display();
	}
}
