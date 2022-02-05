package com.cosmere.collection;
import java.util.ArrayList;
import java.util.Collection;

public class Course {

	public static void main(String[] args) {

		Collection<String> collection = new ArrayList();
		collection.add("Java");
		collection.add("SQL");
		collection.add("HTML");
		collection.add("CSS");
		collection.add("Javascript");
		collection.add("Hibernate");
		collection.add("Spring");
		collection.add("JDBC");
		
		System.out.println(collection);
		
		System.out.println();
		
		for(String str : collection ) {
			System.out.println(str);
		}

		System.out.println();
		
		System.out.println("Size of the elements " +collection.size());
		
		System.out.println();
		
		System.out.println("Remove " +collection.remove("Spring"));
		System.out.println(collection);
		System.out.println("Size of the elements " +collection.size());
		
		System.out.println("isEmpty " +collection.isEmpty());
		System.out.println("Remove All " +collection.removeAll(collection));
		System.out.println("isEmpty " +collection.isEmpty());
		
		System.out.println();
		
		Collection collection1 = new ArrayList();
		collection1.add("Java");
		collection1.add("SQL");
		collection1.add("HTML");
		collection1.add("CSS");
		collection1.add("Javascript");
		collection1.add("Hibernate");
		collection1.add("Spring");
		collection1.add("JDBC");
		
		
		
		System.out.println(collection1);
		
		Collection collection2 = new ArrayList();
		collection2.addAll(collection1);
		collection2.add("Bootsrap");
		collection2.add("Jquery");
		
		System.out.println(collection2);
		
		Collection collection3 = new ArrayList();
		collection3.add(collection2);
		collection3.add("ReactJS");
		
		System.out.println(collection3);
		System.out.println(collection3.size());
		
		System.out.println();
		
		System.out.println(collection3.contains("ReactJS"));
        System.out.println(collection2.remove("JDBC"));
		System.out.println(collection3.containsAll(collection2));
		
		System.out.println();
		
		add(10);
		add(10+20);
		
		System.out.println();
		display("John");
		
		
	}
	
	static void add(int... values) {
		for(Integer i : values) {
			System.out.println(i);
		}
	}
	
	static <E> void  display(String name) {
		System.out.println(name);
	}
	
	

}

