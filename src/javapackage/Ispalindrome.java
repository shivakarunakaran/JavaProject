package javapackage;

public class Ispalindrome 
{

	public static void main(String[] args) 
	{
		String str="Malayalam";
		String reverseStr="";
		for(int i=(str.length()-1);i>=0;i--)
		{
			reverseStr=reverseStr+str.charAt(i);
		}
		if(str.toUpperCase().equals(reverseStr.toUpperCase()))
		{
			System.out.println(str+" is a Palindrome");
		}
		else
		{
			System.out.println(str+" is not a Palindrome");
		}
	}

}
