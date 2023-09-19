// Exception
package oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptionprgm 
{

	public static void main(String[] args) throws FileNotFoundException
	{
		FileInputStream f=new FileInputStream("C:\\Users\\Shiva Karunakaran\\Documents\\Git.txt");
//		System.out.println("File Found");
		try 
		{
			int a=5,b=0;
			int c=a/b;
			System.out.println(c);
		}
	
		catch (ArithmeticException e) 
		{
			System.out.println(e.getMessage());
			System.out.println("Arithmetic Exception");
		}
		
		try
		{
			int a[]=new int[2];
			a[0]=10;
			a[1]=24;
			System.out.println(a[3]);
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println(e.getMessage());
			System.out.println("Array Index Out Of Bounds");
		}
	}

}
