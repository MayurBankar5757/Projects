package Interview;

public class StringRoatate {
	public static void main(String[]args) {
		String str1 ="ABCD";
		String str2 = "CDAF";
		
		if(isRoation(str1,str2)) {
			System.out.println("String is Rotate");
		}
		else {
			System.out.println("String not rotate");
		}
		
	}
	public static boolean isRoation(String str1,String str2) {
		return (str1.length()== str2.length())&& ((str1+str1).indexOf(str2) !=-1);
	} 

}
