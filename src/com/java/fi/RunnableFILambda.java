package com.java.fi;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableFILambda {
	public static void main(String[] args) {
		
		Callable ci= ()-> {System.out.println("Example On runnable Interface Using Lambda"); return null;};
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		//executorService.execute(ci);
		
	}
}
