package com.tka.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ArrayListCountry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> alMh = new ArrayList<>();
		alMh.add("Pune");
		alMh.add("Mumbai");
		alMh.add("Nagpur");
	
		ArrayList <String>alMp = new ArrayList<String>();
		alMp.add("Bhopal");
		alMp.add("Ujjain");
		alMp.add("Indore");
		
		HashMap <String , ArrayList<String>> hmIndia = new HashMap<>();
		hmIndia.put("Maharastra", alMh);
		hmIndia.put("Mp", alMp);
		
		HashMap<String,HashMap<String,ArrayList<String>>> hmAll = new HashMap<>();
		hmAll.put("India", hmIndia);
		
		System.out.println(hmAll);
		
		Set<String> countrySet = hmAll.keySet();
		for (String s : countrySet) {
			System.out.println("Country : "+s);

			HashMap<String,ArrayList<String>> statehm = hmAll.get(s);
			Set<String> st = statehm.keySet();
			for(String t : st) {
				System.out.println("States : "+t);
				ArrayList<String> it = statehm.get(t);
				for (String i:it) {
					System.out.println(i);
				}
				
			}
			
		}
		
		
		
		
	}

}
