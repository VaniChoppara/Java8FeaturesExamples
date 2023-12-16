package com.java.fi;

public class RunnableFIAnonymus {

	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Example On runnable Interface usit Anonymous Implementation");
			}
		});
		t.start();
	}

}
