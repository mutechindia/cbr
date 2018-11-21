package test;

class T {
	public static final int x = 100;
	static {
		System.out.println("static belock");
	}
}

public class Test3 {

	public static void main(String[] args) {
		System.out.println(T.x);

	}

}
