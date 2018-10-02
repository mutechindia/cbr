package test;

public class P1 {
	public static void MutipleThreeOrFiveSum() {
		int sum = 0;
		for (int i = 3; i < 100; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

	public static void faboniSeries(int i) {
        int num1=0;
        int num2=1;
        int sum=0;
		for (int j = 0; j < i; j++) {
			sum=num1+num2;
			num1=sum;
			System.out.print(sum+" ");
			num2=sum;
		}
	}
		
	
	public static void main(String[] args) {
		MutipleThreeOrFiveSum();
		faboniSeries(10);
	}

}
