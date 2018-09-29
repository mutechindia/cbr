package test;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class Employee {
	int id;
	String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
		throw new RuntimeException();
	}

	@Override
	public int hashCode() {
		return 1;
	}

}

public class Test {
	public static Set permutation(String s1) {
		Set set = new HashSet();
		for (int i = 0; i < s1.length() - 1; i++) {
			set.add(insert(s1, s1.charAt(0), s1.charAt(i)));
		}

		return set;
	}

	public static String insert(String s1, char oldch, char newch) {
		return s1;

	}

	public static void main(String[] args) {

		HashMap<Employee,String> list = new HashMap<Employee,String>();
		list.put(new Employee(1, "gourav"),"gourav");
		list.put(new Employee(2, "deepak"),"deepak");
		list.put(new Employee(3, "ravi"),"ravi");
		list.put(new Employee(4, "gourav"),"gourav");
		list.put(new Employee(5, "kishna"),"kishna");
       Set <Map.Entry<Employee, String>>set= list.entrySet();
       LinkedHashMap<Employee, String> linkedHashMap=new LinkedHashMap<Employee,String>();
       Set<Employee> keyset= list.keySet();
       Collection<String> value=list.values();
		for (Map.Entry<Employee, String> entry : set) {
			System.out.println( entry.getKey().id+" "+entry.getValue());
		}
		
	}

}

class Mycomp implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.name.equals(o2.name) && (o1.id < o2.id))
			return -1;
		else
			return o1.name.compareTo(o2.name);
	}

}