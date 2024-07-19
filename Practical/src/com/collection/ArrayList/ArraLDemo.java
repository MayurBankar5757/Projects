package com.collection.ArrayList;
import java.util.*;
public class ArraLDemo {
	public static void main(String[] args) {

	ArrayList<String> list = new ArrayList<>(); 
	
	list.add("Apple");
	list.add("Mango");
	list.add("guava");
	list.add("orange");
	list.add("Peach");
		
	/* Teaversing list through Iterator
	Iterator<String> itr = list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	*/
	System.out.println(list.contains("Pineapple"));
	System.out.println("element at given index no is "+ list.get(3));
	list.set(2, "Watermelon");
	list.remove(4);
	list.add("peach");
	System.out.println("The index no of mango is"+ list.indexOf("Mango"));
	
	for(String s : list) {
		System.out.println(s);
	}
	
	}

}

