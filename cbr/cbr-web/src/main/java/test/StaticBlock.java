package test;

class Demo {

	static {
		System.out.println("sb1");
	}
	static Demo demo = new Demo();

	static {
		System.out.println("sb1");
	}

	public Demo() {
		System.out.println("Ibc");
	}

	{
		System.out.println("ib");
	}
}

public class StaticBlock {

	public static void main(String[] args) {
		Demo demo = new Demo();

	}

}
