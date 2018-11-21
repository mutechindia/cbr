package test;

public class NumberPattern {

	public static void main(String[] args) {

		
		int size=10;
		int odd=1;
		int noOfSpace=size-1;
		for (int i = 1; i < size; i++) {
			int k=0;
			for (int j = 0; j < noOfSpace; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=odd; j++) {
				if(j<=i)
				{
					k=k+1;
				}
				else
				{
					k=k-1;
				}
				System.out.print(k);
				
			}
			System.out.println();
			odd=odd+2;
			noOfSpace--;
		}
	}

}
