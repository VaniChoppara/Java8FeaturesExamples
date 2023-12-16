package com.java.fi;

public class CallableFILambda {
	public static void main(String[] args) {
		Thread t = new Thread(() -> System.out.println("Example On runnable Interface Using Lambda"));
		t.start();
	}
}
