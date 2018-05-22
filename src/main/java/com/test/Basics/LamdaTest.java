package com.test.Basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LamdaTest {

	public void addListNumbers(Consumer<List<Integer>> c, Supplier<List<Integer>> s) {
		c.accept(s.get());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Functional Programming");

		LamdaTest obj = new LamdaTest();

		List<Integer> al = new ArrayList<Integer>();

		al.add(10);
		al.add(20);
		al.add(40);
		al.add(30);

		obj.addListNumbers(number -> {
			List<Integer> al1 = new ArrayList<Integer>();
			al1 = number.stream().collect(Collectors.toList());
			Collections.sort(al1);
			for (int i : al1) {
				System.out.println("i=" + i);
			}
		}, () -> al);

	}

}
