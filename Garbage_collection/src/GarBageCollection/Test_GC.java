package GarBageCollection;

public class Test_GC {

	void m1() {
		System.out.println("m1 method");
	}
	protected void finalize() {
		System.out.println("finalize method");
	}
	public static void main(String[] args) {
		Test_GC a = new Test_GC();
		a.m1();
		a=null;
		a.m1();
		System.gc();
		
	}
}
