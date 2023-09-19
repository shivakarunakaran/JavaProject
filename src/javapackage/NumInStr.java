//FetchingOnlyNumbersInString

package javapackage;

public class NumInStr 
{
	public static void main(String[] args) 
	{
		String str="asd2134 nf823 8932hisud";
		System.out.println(FetchNum(str));		
	}
	
	static String FetchNum(String str)
	{
		str=str.replaceAll("[^0-9]"," ");//("[^0-9]", " "); 
		
		str=str.replaceAll(" +", " ");
		
		if(str.equals(""))
			return "-1";
		return str;	
	}
}
