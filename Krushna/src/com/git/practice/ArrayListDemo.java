package com.git.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) 
	{ 
		ArrayList arrayList = new ArrayList();
		arrayList.add("krushna");
		arrayList.add("sunil");
		arrayList.add("deshmukh");
		
		System.out.println(arrayList);
		Iterator itr = arrayList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("krushna");
		

	}

}
