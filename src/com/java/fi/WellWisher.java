package com.java.fi;

public class WellWisher {

	static void wish(Greeting greet) {
		greet.greet();
	}

	public static void main(String[] args) {
		
		Greeting hg = new HindiGreeting();
		Greeting eg = new EnglishGreeating();
		wish(hg);
		wish(eg);

		// Anonymous Implementation for the Functional Interface
		wish(new Greeting() {
			@Override
			public void greet() {
			System.out.println("Namaskar.....");
			}
		});
		
		wish(new Greeting() {
			@Override
			public void greet() {
			System.out.println("English Greeting");
			}
		});
		
		// Using Lambda Expression for the Functional interface
		wish(()-> System.out.println("Namaskarr....."));
		wish(()-> System.out.println("English Greeting....."));

	}
}
