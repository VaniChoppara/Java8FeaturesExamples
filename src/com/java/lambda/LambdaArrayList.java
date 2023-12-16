package com.java.lambda;

import java.util.ArrayList;
import java.util.Arrays;

public class LambdaArrayList {
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
		numbers.add(1);
		numbers.add(5);
		//printing using lambda expression
		numbers.forEach((n)->System.out.print(n));
		
		//printing using method reference
		numbers.forEach(System.out::println);

	}
}
