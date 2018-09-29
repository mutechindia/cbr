package test;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.simple.JSONValue;

public class JsonDemo {

	public static void main(String[] args) {
		HashMap<String, ArrayList<String>> country = new HashMap<String, ArrayList<String>>();

		ArrayList<String> city = new ArrayList<String>();
		city.add("Mumbai");
		city.add("Delhi");
		city.add("kolkata");

		country.put("India", city);

		// convert from Java Object to JSON string
		String jsonText = JSONValue.toJSONString(country);

		System.out.println(jsonText);

		// convert from JSON string to Java Object
		HashMap<String, ArrayList<String>> jCountry = (HashMap<String, ArrayList<String>>) JSONValue.parse(jsonText);

		System.out.println(jCountry.get("India"));
	}

}
