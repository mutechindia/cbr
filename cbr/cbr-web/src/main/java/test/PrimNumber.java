package test;

import java.util.Scanner;

public class PrimNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if (primNumber(sc.nextInt()) != false)
			System.out.println("prime number");
		else
			System.out.println("number is not prime");

	}

	private static boolean primNumber(int num) {
		int number = (num < 0) ? -num : num;
		for (int i = 2; i < number; i++) {
			if ((number % i != 0)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

}
