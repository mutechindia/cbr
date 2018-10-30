package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class MainTest {

	ArrayList<String> list = new ArrayList() {
		{

			add("22, Rajan Anand, Engineering, 1600000");
			add("23, Swati Patil, Testing, 800000");
			add("27, Vijay Chawda, Engineering, 800000");
			add("29, Basant Mahapatra, Engineering, 600000");
			add("32, Ajay Patel, Testing, 350000");
			add("34, Swaraj Birla, Testing, 350000");
		}
	};

	@Test
	void testProcessData() {

		assertEquals(new LinkedHashMap<String, Integer>() {
			{
				put("Engineering", 600000);
				put("Testing", 350000);
			}
		}, Main.processData(list));
	}

}
