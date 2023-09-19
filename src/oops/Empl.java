package oops;

public class Empl {
	
	String empname;
	String design;
	String empid;
	
	Empl(String empname,String design,String empid)
	{
		this.empname=empname;
		this.design=design;
		this.empid=empid;
	}

	public static void main(String[] args) {
		Empl emp=new Empl("Isla","Test","124");
		System.out.println(emp.empname);
		System.out.println(emp.design);
		System.out.println(emp.empid);
	}

}
