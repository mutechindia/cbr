package test;

import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class StringFindByString {
	public static void main(String args[]) throws IOException {
		String s1 = "hellohellhello";
		String s2 = "hello";

		int j = 0, cnt = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == s2.charAt(j)) {
				j++;
			} else {
				if (s1.charAt(i) == s2.charAt(0)) {

				} else {
					j = 0;
				}
			}
			if (j == s2.length()) {
				cnt++;
				j = 0;
				i = i-s2.length() + 1;
			}

		}
		System.out.println(cnt);

	}
}
