package test;

import java.util.Iterator;

public class P2 implements Iterable{

	public static void main(String[] args) {
		int j = 0;
		int k = 0;
		for (int i = 0; i < 10; i++) {
			j=j++;// j++; temp=j; j=j+1; j=temp;
			System.out.println(j);
			int y=j++;
			System.out.println("y"+y);
			//j =++j;
		}
		System.out.println(j);
		System.out.println("----------------------------");
		int x = 5;
		boolean b1 = true;
		boolean b2 = false;

		if (x == 4 && !b1)
			System.out.println("\"print 1");
		System.out.println("\"print 2");

		if (b2 = true && b1)
			System.out.println("print 3");
		System.out.println("----------------------------");
	}

	@Override
	public Iterator iterator() {
		return null;
	}

	
	
}
