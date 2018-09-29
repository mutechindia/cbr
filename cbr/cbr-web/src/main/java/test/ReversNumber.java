package test;

public class ReversNumber {

	public static String reverseString(String s1) {
		String rev = "";
		for (int i = s1.length() - 1; i > 0; i--) {
			rev = rev + s1.charAt(i);
		}
		return rev;

	}

	public static int reverse(int num) {
		int reverse = 0;
		while (num != 0) {
			reverse = reverse * 10 + num % 10;
			num = num / 10;
		}
		return reverse;
	}

	public static boolean paladrom(int num) {
		int paldrom = 0, number = num;

		while (num != 0) {
			paldrom = paldrom * 10 + num % 10;
			num = num / 10;
		}
		return paldrom == number;
	}

	public static void main(String[] args) {
		System.out.println(reverse(12));
		System.out.println(10 / 2 + 55 * 2 - 6 - 10 % 2);
		System.out.println(paladrom(121));
		System.out.println(reverseString("gourav"));
		StringBuffer sb = new StringBuffer("gourav");
		String s1 = convert("gourav");
		String s = "gouravgo";
		s = s.concat("singh");

		System.out.println(s);
		System.out.println(stringawailable("gourav", "go"));

	}

	private static int stringawailable(String s1, String s2) {
		int j = 0, count = 0;
		if (s1 != null && s2 != null && s1.length() > s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) == s2.charAt(j))
					j++;
				else
					j = 0;
				if (j == s2.length()) {
					count++;
					j = 0;
				}
			}
		}
		return count;

	}

	private static String remove(String string) {
		return null;
	}

	private static String convert(String string) {

		return null;
	}

}