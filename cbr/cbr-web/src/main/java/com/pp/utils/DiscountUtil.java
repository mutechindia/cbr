package com.pp.utils;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;

public class DiscountUtil {

	// CSV file line by line

	public static void main(String[] args) {
		List<Discount> dList = DiscountUtil.readDiscountSlabs("D:\\\\Discount.csv");
		Integer finalDiscount = 0;
		for (Discount dis : dList) {
			if (true) {
				finalDiscount = +finalDiscount
						+ (Integer.parseInt(dis.getDiscountPerc().substring(0, dis.getDiscountPerc().length() - 1)));
			}
		}
		System.out.println(finalDiscount);
	}

	public static List<Discount> readDiscountSlabs(String file) {
		try {

			// Create an object of filereader
			// class with CSV file as a parameter.
			FileReader filereader = new FileReader(file);

			// create csvReader object passing
			// file reader as a parameter
			CSVReader csvReader = new CSVReader(filereader);
			String[] nextRecord;

			List<Discount> disList = new ArrayList<Discount>();

			// we are going to read data line by line
			while ((nextRecord = csvReader.readNext()) != null) {
					if (!nextRecord[1].equals("start"))
						disList.add(new Discount(nextRecord[0], Integer.parseInt(nextRecord[1]),
								Integer.parseInt(nextRecord[2]), nextRecord[3]));
				}
				return disList;
			}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
