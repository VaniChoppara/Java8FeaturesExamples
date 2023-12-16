package com.java.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
		Predicate<Integer> p = (n) -> n > 20;
		System.out.println(p.test(21));

		String[] names = { "sandya", "Sanvik", "Radya", "Ravi" };
		Predicate<String> nameLength = (n) -> n.length() > 5;

		for (String name : names) {
			if (nameLength.test(name)) {
				System.out.println(name);
			}
		}
		Predicate<Integer> age = (n) -> n > 18;
		
		Person p1 = new Person("Sandya", 40);
		Person p2 = new Person("Ravi", 43);
		Person p3 = new Person("Sanvik", 9);
		Person p4 = new Person("Radya", 8);

		List<Person> persons = Arrays.asList(p1, p2, p3, p4);

		for (Person person : persons) {
			if (age.test(person.getAge()))
				System.out.println("Eligible for vote "+person.getName());
		}
		
		
		Predicate<Integer> minAge=(n)->n>21;
		Predicate<Integer> maxAge=(n)->n<62;
		
		Person p5 = new Person("Sandya", 40);
		Person p6 = new Person("Ravi", 43);
		Person p7 = new Person("Sanvik", 22);
		Person p8 = new Person("Radya", 8);
		
		List<Person> bachlers= Arrays.asList(p4,p5,p6,p7,p8);
		Predicate<Integer> eligibleAge= minAge.and(maxAge);
		
		for(Person bachler: bachlers) {
			if(eligibleAge.test(bachler.getAge()))
				System.out.println("Eligible for marry " + bachler.getName());
		}

		
		BiPredicate<Integer, Integer> bp= (a, b) -> a+b>15;
		
		System.out.println(bp.test(10, 3));
		
		

	}
}

class Person {
	String name;
	Integer age;

	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
