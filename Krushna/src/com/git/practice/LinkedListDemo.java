package com.git.practice;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args)
	{
		LinkedList linkedList = new LinkedList();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		
		System.out.println(linkedList);
		for(Object e :linkedList)
		{
			System.out.println(e);
		}
		

	}

}
