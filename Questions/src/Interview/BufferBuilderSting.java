package Interview;

public class BufferBuilderSting {
	public static void main(String[] args) {
//		String s = "Hellow";
//		s = "Hello World";
//		System.out.println(s);
		
		String s = "Hello";
		 String s2 = s.concat(" Java");;
		
		//System.out.println(s);
		System.out.println(s2);
		
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" World");
		
		sb.delete(02, 04); // it cannot be write as sb.delete(02,01);
		System.out.println(sb);
		
		StringBuffer sf = new StringBuffer ("Hello");
		sf.append(" Java Learner");
		System.out.println(sf);
		sf.delete(02, 05);
		System.out.println(sf); 
		
	}
}
