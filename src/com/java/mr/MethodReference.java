package com.java.mr;

public class MethodReference {

   static void m2() {
	   System.out.println("This is method 2 data");
   }
   public static void main(String[] args) {
	MrInterface mr=MethodReference::m2; 
	mr.m1();
	
	CrReference cr=CreateCalss::new;
	cr.create();
	System.out.println(cr.hashCode());
   }
   
}
