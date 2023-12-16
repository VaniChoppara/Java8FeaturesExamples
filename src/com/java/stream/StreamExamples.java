package com.java.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {

	public static void main(String[] args) {
		Stream<Integer> s1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 10);
		Stream<Integer> filterStream = s1.filter(n -> n % 2 == 0);
		filterStream.forEach(System.out::println);

		List<String> nameList = Arrays.asList("Sandya", "Syamala", "Sanvik", "Radya", "RaviKiran");

		nameList.stream().filter(s -> s.startsWith("S") && s.length() >= 6).map(s -> s + " " + s.length())
				.forEach(System.out::println);

		Person p1 = new Person();
		p1.setId(101);
		p1.setName("name1");
		p1.setCity("City1");
		p1.setAge(25);

		Person p2 = new Person();
		p2.setId(102);
		p2.setName("name2");
		p2.setCity("City2");
		p2.setAge(25);
		

		Person p3 = new Person();
		p3.setId(103);
		p3.setName("name3");
		p3.setCity("City3");
		p3.setAge(20);

		List<Person> personList = Arrays.asList(p1, p2, p3);
		
		Person minAge = personList.stream().collect(Collectors.minBy(Comparator.comparingInt(p->p.getAge()))).get();	
		System.out.println("--------MIN-----------------------"+minAge);
		
		Person maxAge = personList.stream().collect(Collectors.minBy(Comparator.comparingInt(p->p.getAge()))).get();	
		System.out.println("-------MAX------------------------"+maxAge);
		
		double avgAge = personList.stream().collect(Collectors.averagingInt(p->p.getAge())).doubleValue();	
		System.out.println("-------double------------------------"+avgAge);
		
		Map<Integer, List<Person>> ageGroup = personList.stream().collect(Collectors.groupingBy(p->p.getAge()));
		System.out.println("-------------Grouping--------------------");		
		ageGroup.forEach((k,v)-> System.out.println(v));
		
		
		personList.stream().filter(p -> p.getId() > 101).map(p -> p.getId() + " " + p.getName())
				.forEach(System.out::println);

		List<String> javaCourses = Arrays.asList("java", "java", "SpringBoot", "Micro Services");

		List<String> uiCourses = Arrays.asList("Angular", "Java script", "React", "TypeScript");

		List<String> dbCourses = Arrays.asList("mysql", "oracle", "dynamo", "mongoDB");

		List<String> realTimeTools = Arrays.asList("docker", "kafka", "jenkin", "github");

		List<List<String>> courses = Arrays.asList(javaCourses, uiCourses, dbCourses, realTimeTools);

		courses.stream().flatMap(s -> s.stream()).forEach(System.out::println);

		Stream<List<String>> stream2 = courses.stream();
		Stream<String> stream3 = stream2.flatMap(s -> s.stream());
		stream3.forEach(System.out::println);

		System.out.println("-----------------------------------------------");
		
		javaCourses.stream().skip(3).forEach(System.out::println);
		javaCourses.stream().limit(3).forEach(System.out::println);
		javaCourses.stream().distinct().forEach(System.out::println);
		
	}
}
