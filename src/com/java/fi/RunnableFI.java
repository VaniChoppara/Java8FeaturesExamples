package com.java.fi;

public class RunnableFI implements Runnable{

	@Override
	public void run() {
		System.out.println("Example On runnable Interface");
	}
	
	public static void main(String[] args) {
		
		RunnableFI fi=new RunnableFI();
		Thread t=new Thread(fi);
		t.start();
	}

}
