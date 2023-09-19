//Remove Consonants/Vowels

package javapackage;
public class RemConso 
{

	public static void main(String[] args) 
	{
		String input="Isla Rose0630";
		String regex="([^aeiouAEIOU]+)";//ReturnVowels
//		String regex="([^BCDFGHJKLMNPQRSTVXZbcdfghjklmnpqrstvxz0-9]+)";//RemoveVowels
		String result=input.replaceAll(regex, "");
		System.out.println("Result : "+result);
	}
}

//{
//	static String remVowel(String str)
//	{
//		return str.replaceAll("[BCDFGHJKLMNPQRSTVXZbcdfghjklmnpqrstvxz0-9]", "");//ReturnVowels
////		return str.replaceAll("[AEIOUaeiou]", "");//RemoveVowels 
//	}
//	public static void main(String[] args) 
//	{
//		String str="IslaRose0630";
//		System.out.println(remVowel(str));
//	}
//}