//MultiLevelInheritance
package oops;

class Animal
{
	void eat()
	{
		System.out.println("Eat");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking");
	}
}
class Babydog extends Dog
{
	void sleep()
	{
		System.out.println("Sleeping");
	}
}
public class MultiInheritance 
{
	public static void main(String[] args) 
	{
		Babydog baby=new Babydog();
		baby.eat();
		baby.bark();
		baby.sleep();
	}
}
