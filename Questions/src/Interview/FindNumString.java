package Interview;

public class FindNumString {
	
	public static void main(String[] args) {
		
		String s = "abcl$43acb.com";
		 for(int i=0; i<s.length();i++) {
			 char c = s.charAt(i);
			 if(c>=48 && c<=57) {
				 System.out.println("Number : " + c);
			 }
			 else if((c>=65 && c<=90)|| (c>=97 && c<=122)){
				 System.out.println("Alpha : " +c);
			 }
			 else {
				 System.out.println("Special character : " +c);
			 }
		 }
	}
}
