package com.test.Basics;

public class Base {
	
	protected Base(int i){
		System.out.println("base class constructor"+i);
	}
	
	static
	{
		System.out.println("static initialization block base class");
	}
	
	{
		System.out.println("instance initialization block base class");
	}
	
	

}
