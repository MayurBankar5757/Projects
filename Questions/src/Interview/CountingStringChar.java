package Interview;

import java.util.HashMap;

public class CountingStringChar {
	public static void main(String[] args) {
		String s = "Hello";
		HashMap <Character,Integer>h = new HashMap<>();
		int count =0;
		for(int i=0; i<s.length(); i++) {
			
			if(h.containsKey(s.charAt(i))) {
				count= h.get(s.charAt(i));
				count++;
				h.put(s.charAt(i), count);
				
			}else {
				h.put(s.charAt(i), 1);
			}
			
		}
//		System.out.println(h); we can display also using this
		
		//display
		for(Character key : h.keySet()) {
			System.out.println(key +" : "+ h.get(key));
		}
	}

}
