package javapackage;

public class TotalCharInStr 
{

	public static void main(String[] args) 
	{
		String str="islarose";
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			count++;
		}
		System.out.println("Total Char In String : "+count);
	}

}
