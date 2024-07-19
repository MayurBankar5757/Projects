package Interview;

public class StringPalindrome {
	public static void main(String[] args) {
		String s = "madam",rev ="";
		 
		for(int i=s.length()-1; i>=0; i--) {
			rev +=	s.charAt(i); //rev = rev  +	s.charAt(i);
			}
		if(s.equals(rev)) {
			System.out.println("It is palindrome String");
		}
		else {
			System.out.println("It is not Palindrome String");
		}
	}
}
