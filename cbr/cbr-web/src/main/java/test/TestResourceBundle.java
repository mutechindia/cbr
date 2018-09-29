package test;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestResourceBundle {

	
		public static void main(String[] args) {

			// en_US
			System.out.println("Current Locale: " + Locale.getDefault());
			ResourceBundle mybundle = ResourceBundle.getBundle("welcome");

			// read MyLabels_en_US.properties
			System.out.println("Say how are you in US English: " + mybundle.getString("lang.email"));

			Locale.setDefault(new Locale("fr", "FR"));

			// read MyLabels_ms_MY.properties
			System.out.println("Current Locale: " + Locale.getDefault());
			mybundle = ResourceBundle.getBundle("welcome");
			System.out.println("Say how are you in Malaysian Malaya language: " + mybundle.getString("lang.email"));
			Locale.setDefault(new Locale("hi", "HI"));
			
			// read MyLabels_ms_MY.properties
			System.out.println("Current Locale: " + Locale.getDefault());
			mybundle = ResourceBundle.getBundle("welcome");
			System.out.println("Say how are you in Malaysian Malaya language: " + mybundle.getString("lang.email"));

		}

	}

