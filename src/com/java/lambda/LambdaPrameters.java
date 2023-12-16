package com.java.lambda;

interface Addition{
	public int add(int a, int b);
}
public class LambdaPrameters {

	public static void main(String[] args) {
//		Addition addition = (a,b)->a+b;
//		System.out.print(addition.add(6,7));
		
		Addition addition = (a,b)->{int c= a+b; return c;};
		System.out.println(addition.add(7, 8));
	}
}
