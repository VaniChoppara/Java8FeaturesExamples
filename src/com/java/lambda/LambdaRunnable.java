package com.java.lambda;

public class LambdaRunnable {
	
	public static void main(String[] args) {
//	Runnable runnable=()-> System.out.println("Thread calling from Lamda Runnable interface");
//	 Thread thread1= new Thread(runnable);	
	 Thread thread1= new Thread(()-> System.out.println("Thread calling from Lamda Runnable interface"));	
	 thread1.start();
	}
}
