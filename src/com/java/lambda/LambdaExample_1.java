package com.java.lambda;

interface Shape{
	
	public void draw();
}

public class LambdaExample_1{
	public static void main(String[] args) {
//		Shape rectangle = ()-> System.out.println("Rectangle");
//		//rectangle.draw();
//		Shape circle = () -> System.out.println("Circle");
//		//circle.draw();
//		Shape triganle = ()-> System.out.println("Triangle");
//		//triganle.draw();
//		Shape square = () -> System.out.println("Square");
//		//square.draw();
		print( ()-> System.out.println("Rectangle"));		
		print( ()-> System.out.println("circle"));
		print( ()-> System.out.println("triganle"));
		print( ()-> System.out.println("square")); 
	}
	
	public static void print(Shape s) {
		s.draw();
	}

}
