package com.java.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaString {

	public static void main(String[] args) {
		
		 List<Person> persons =  Arrays.asList(new Person("sandya", "choppara", 40),
				new Person("ravi", "rani", 40), new Person("sanvik", "kuchika", 40));
		 
		 //1. Sort the persons using lastname
		 
		 Collections.sort(persons, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLname().compareTo(o2.getLname());
			}
		 });
		 
		 // Using Lambda
		 
		 Collections.sort(persons, (o1,o2)-> o1.getLname().compareTo(o2.getLname()));
		
		 //2. create a method that prints all elemnets in the list
		 
		 //printAll(persons);
		 
		 persons.forEach(System.out::println);
		 
		 //3. create a method that prints all peope that last name starts with d
		 
		 persons.stream().filter(p->p.getLname().startsWith("c")).forEach(System.out:: println);
		 
		 //printAllwithCondition(persons);
		
	}

	/*
	 * private static void printAll(List<Person> persons) {
	 * 
	 * for(Person person: persons) { System.out.println(person); }
	 * 
	 * }
	 * 
	 * private static void printAllwithCondition(List<Person> persons) { for(Person
	 * person: persons) { if(person.getLname().startsWith("C"))
	 * System.out.println(person); } }
	 * 
	 */}
