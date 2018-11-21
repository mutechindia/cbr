package test;

class Auto {
	static int l=10;
	
	public Auto(int l) {
       this.l=l;
	}
	/*public static void m(Integer i) {
		System.out.println("Integer");
	}*/

	public static void m(int i) {
		System.out.println("int");
	}
	
	public static void m(byte b) {
		System.out.println("byte");
	}

	public static void m(int... as) {
		System.out.println("var args");

	}
}

public class AutoBoxing extends Auto {

	public AutoBoxing(int l) {
		super(l);
	}
	public static void main(String[] args) {
		byte b=19;
		m(null);

	}
}
