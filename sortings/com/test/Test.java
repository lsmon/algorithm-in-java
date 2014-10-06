package com.test;

import java.util.LinkedList;
import java.util.List;

import sortings.Sort;


public class Test {

	public static void main(String[] args) {
		List<Integer> randomIntegers = new LinkedList<>();
		randomIntegers.add(9);
		randomIntegers.add(8);
		randomIntegers.add(1);
		randomIntegers.add(3);
		randomIntegers.add(4);
		randomIntegers.add(5);
		randomIntegers.add(2);
		randomIntegers.add(10);
		randomIntegers.add(7);
		randomIntegers.add(12);
		randomIntegers.add(11);
		
		List<Double> randomDoubles = new LinkedList<>(); 
		randomDoubles.add(3.14);
		randomDoubles.add(1.23);
		randomDoubles.add(3.13);
		randomDoubles.add(2.663);
		randomDoubles.add(1.763);
		randomDoubles.add(8.56);
		randomDoubles.add(2.78);
		randomDoubles.add(1.65);
		randomDoubles.add(21.6);
		
		List<Float> randomFloats = new LinkedList<>();
		randomFloats.add(0.987716904719999F);
		randomFloats.add(1.23F);
		randomFloats.add(3.13F);
		randomFloats.add(2.663F);
		randomFloats.add(1.763f);
		randomFloats.add(8.56F);
		randomFloats.add(2.78F);
		randomFloats.add(1.65F);
		randomFloats.add(21.6F);
		
		System.out.println("integer list" + randomIntegers.toString());
		Sort.insertionSortingIntegers(randomIntegers);
		System.out.println("sorted integer list" + randomIntegers.toString());
		
		
		System.out.println("double list" + randomDoubles.toString());
		Sort.insertionSortingDoubles(randomDoubles);
		System.out.println("sorted double list" + randomDoubles.toString());
		
		
		System.out.println("float list" + randomFloats.toString());
		Sort.insertionSortingFloats(randomFloats);
		System.out.println("sorted float list" + randomFloats.toString());
		
	}

}
