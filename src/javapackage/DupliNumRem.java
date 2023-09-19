package javapackage;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class DupliNumRem 
{	
	static void RemoDup(int a[])
	{
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		
		for(int i=0;i<a.length;i++)
			
			set.add(a[i]);
		
		System.out.print(set);
	}
	
	public static void main(String argd[])
	{
		int a[]= {2,3,2,4,22,5,44,6,7,8,7,22,6,44,1};
		
		Arrays.sort(a);
		
		RemoDup(a);
	}
}
