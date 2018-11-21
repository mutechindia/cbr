package test;

public enum Month implements Cloneable{
	jan(1), fab(2), march(3);
	int val;

	private Month(int i) {
		val = i;
	}

	public static void main(String[] args) {
		System.out.println(Month.jan);
	}
}
