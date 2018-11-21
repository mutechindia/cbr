package test;

public class P3 {

	public static void main(String[] args) {
		int k = 407;
		int r = 0;
		while (k != 0) {
			r = r * 10 + k % 10;
			k = k / 10;
		}
		System.out.println(r);

		String s = "10";
		int ko = Integer.parseInt(s);
		System.out.println(ko);

	}

}
