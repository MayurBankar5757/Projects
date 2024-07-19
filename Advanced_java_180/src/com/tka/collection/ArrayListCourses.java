package com.tka.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ArrayListCourses {

	public static void main(String[]args) {
		ArrayList <String> alco = new ArrayList<>();
		alco.add("OOPs concept");
		alco.add("Collection");
		alco.add("Exception handling");
		alco.add("JDBC");
		
		ArrayList<String> alAd = new ArrayList<String>();
		alAd.add("Servlet");
		alAd.add("Jsp");
		alAd.add("hibernate");
		alAd.add("SpringBoot");
		
		ArrayList<String>alWeb = new ArrayList<>();
		alWeb.add("Html");
		alWeb.add("CSS");
		alWeb.add("Javascript");
		alWeb.add("Angular");
		
		HashMap<String,ArrayList<String>> hlco = new HashMap<>();
		hlco.put("WebDev", alWeb);
		hlco.put("Advanced Java", alAd);
		hlco.put("Core Java", alco);
	
		HashMap <String,HashMap<String,ArrayList<String>>> hlAll = new HashMap<>();
		hlAll.put("J2EE", hlco);
		
		System.out.println(hlAll);
		
		Set<String> courseSet = hlAll.keySet();
		for(String s : courseSet) {
			System.out.println(s);
			HashMap<String,ArrayList<String>> hlco1 = hlAll.get(s);
			Set<String> courseset1 = hlco1.keySet();
			for(String t : courseset1) {
				System.out.println();

				System.out.println("Module : " +t);
				ArrayList<String> p = hlco1.get(t);
				for(String i : p) {
					System.out.println(i);
				}
			}
		}
		
		
		
		
		
	}
}
