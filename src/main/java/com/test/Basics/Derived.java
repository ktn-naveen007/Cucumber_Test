package com.test.Basics;

public class Derived extends Base {
	
	Derived(int i){
		super(i);
		System.out.println("derived class constructor"+i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Derived d = new Derived(20);
		
		Base b = new Derived(10);

	}

}
