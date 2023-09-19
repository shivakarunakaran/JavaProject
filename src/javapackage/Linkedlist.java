//LinkedList

package javapackage;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist 
{

	public static void main(String[] args) 
	{
		LinkedList<String> li=new LinkedList<String>();
		li.add("isla");
		li.add("rose");
		li.add("isla");
		Iterator<String> iter=li.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}

	}

}
