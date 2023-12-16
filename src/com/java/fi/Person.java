package com.java.fi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person {
	
	private int id;
	private String name;
	private String city;
	
	public Person(int id, String name, String city) {
		this.id=id;
		this.name=name;
		this.city=city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	public static void main(String[] args) {
		
		Person p1= new Person(101,"Sandya", "Tenali");
		Person p2= new Person(103,"Ravi", "Tenali");
		Person p3= new Person(102,"Teja", "Tenali");
		
		List<Person> personList=  Arrays.asList(p1,p2,p3);
		System.out.println(personList);
		Collections.sort(personList, new PersonComparator());
		System.out.println(personList);
		
		// Lambda Expression
		Collections.sort(personList, (o1,o2)->o2.getName().compareTo(o1.getName()));
		System.out.println(personList);
	}
	
}

class PersonComparator implements Comparator<Person>{
	@Override
	public int compare(Person o1, Person o2) {
		return o1.getName().compareTo(o2.getName());
	}
}