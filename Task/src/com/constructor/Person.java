package com.constructor;
public class Person{
	//Attributes
	private String name;
	private int age;
	
	//constructor
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
		
		
}
	public static void main(String[]args) {
		//create instances of the person
		Person person1 = new Person("Alice",25);
		Person person2 = new Person("Alice",25);
		
		// display name and ages
		System.out.println("person1 : Nmae - "+ person1.name +"Age - " +person1.age );
		System.out.println("person2 : Nmae - "+ person2.name +"Age - " +person2.age );

	}
}

