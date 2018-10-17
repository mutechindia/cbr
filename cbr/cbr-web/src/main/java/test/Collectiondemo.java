package test;

import static java.lang.System.out;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Collectiondemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		LinkedList list = new LinkedList();
		map.put(101, "A");
		map.put(102, "B");
		out.println(map.remove(101, "D"));
		out.println(map);
		Runnable run1 = new Runnable() {

			@Override
			public void run() {
				for (Map.Entry<Integer, String> entry : map.entrySet()) {
					System.out.println(entry.getKey() + " " + entry.getValue());
				}
			}
		};

		Runnable run2 = new Runnable() {

			@Override
			public void run() {
				map.remove(101);
			}
		};
		Thread t1 = new Thread(run1);
		Thread t2 = new Thread(run2);
		t1.start();
		t2.start();
		System.out.println("map" + map);

	}

}
