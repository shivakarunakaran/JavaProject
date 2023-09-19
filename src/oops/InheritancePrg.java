//Inheritance
package oops;

class Member
{
	String name;
	int age;
	
	public void display() 
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println();
	}
}

class Employee extends Member
{
	String specialization;
}
class Manager extends Member
{
	String department;
}
public class InheritancePrg
{	
	public static void main(String[] args) 
	{
		Employee emp=new Employee();
		emp.name="Rose";
		emp.age=24;
		System.out.print(emp.specialization="Developer : ");
		emp.display();
		
		Manager man=new Manager();
		man.name="isla";
		man.age=27;
		System.out.print(man.department="HR: ");
		man.display();		
	}
}