package Interview;

public class FindSymbol {
	
	public static void main(String[] args) {
		String str = "hellowze@hsl klshf";
		int count=0;
		
		for(int i=0; i<str.length(); i++) {
			if(!Character.isDigit(str.charAt(i))&&!Character.isLetter(str.charAt(i))&&!Character.isWhitespace(str.charAt(i))) {
				System.out.println(str.charAt(i));
				count++;
			}
		}
		System.out.println(count);
	}

}
