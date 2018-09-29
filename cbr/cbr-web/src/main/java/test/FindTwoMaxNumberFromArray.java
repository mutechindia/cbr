package test;

public class FindTwoMaxNumberFromArray {

	public static void main(String[] args) {
		int arry[] = { 10, 10, 7, 9, 20, 20, 20, 10, 10 };
		int num1 = arry[0];
		int num2 = arry[1];

		for (int i = 0; i < arry.length; i++) {
			if (num1 < arry[i]) {
				num1 = arry[i];
			} else if ((num2 <arry[i]) && (arry[i] != num1)) {
				num2 = arry[i];
			}
		}
		System.out.println(num1);
		System.out.println(num2);
	}

}
