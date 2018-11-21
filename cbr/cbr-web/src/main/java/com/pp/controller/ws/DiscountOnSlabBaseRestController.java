package com.pp.controller.ws;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.pp.utils.Discount;
import com.pp.utils.DiscountUtil;

@Controller
public class DiscountOnSlabBaseRestController {

	@RequestMapping(value = "/discount/{usertype}/{amount}", method = RequestMethod.GET)
	public ResponseEntity<Integer> getUserInformation(@PathVariable String usertype, @PathVariable Integer amount) {
		List<Discount> dList = DiscountUtil.readDiscountSlabs("D:\\\\Discount.csv");
		Integer discount = 0;
		if (dList != null) {
			//check slabs
			for (Discount disc : dList) {
				int discountOn = 0;
				if (disc.getUserType().equals(usertype) && disc.getStart() <= amount) {

					if (amount >= disc.getStart() && amount <= disc.getEnd()) {
						discountOn = amount - disc.getStart();
					} else {
						discountOn = disc.getEnd() - disc.getStart();
					}
				}
				discount = discount + discountOn
						* Integer.parseInt(disc.getDiscountPerc().substring(0, disc.getDiscountPerc().length() - 1))
						/ 100;
			}
			return new ResponseEntity<Integer>(amount - discount, HttpStatus.OK);
		}
		return null;
	}

}
