package test;

public class TestTryCatch {
	public static int tryCatchcase1() {
		try {
		return 1;
		} catch (Exception e) {
//			return 2;
		} finally {
			return 3;
		}

	}

	/*
	 * public static int tryCatchcase2() { try { new RuntimeException(); return 1; }
	 * catch (Exception e) {
	 * 
	 * } finally { System.out.println(); } }
	 */

	public static int tryCatchcase3() {
		try {
			new RuntimeException();
			return 1;
		} catch (Exception e) {
			return 2;
		} finally {
			return 3;
		}
	}

	public static void main(String[] args) {
		System.out.println(tryCatchcase1());
	}

}
