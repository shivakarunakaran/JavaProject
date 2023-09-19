//ReverseStringWord

package javapackage;

public class RevStrWord 
{

	public static void main(String[] args) 
	{
		String str="Testing Training Center";
		String ar[]=str.split(" ");
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.print(ar[i]+" ");
		}
		
//		String s1="hello world";
//		String s2=s1.replace("hello", "hi");
//		System.out.println(s2);
	}
}
