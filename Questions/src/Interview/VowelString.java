package Interview;

public class VowelString {
	 public static void main(String[] args) {
		String s = "aeouiAsaE";
		
		for(int i=0; i<s.length();i++) {
			char c = s.charAt(i);
			if((c=='a'|| c=='e' || c=='i' || c=='o' || c=='u')||(c=='A'|| c=='E' || c=='I' || c=='O' || c=='U') ){
				System.out.println("Vowel  :" +c);
			}
		}
	}
}
