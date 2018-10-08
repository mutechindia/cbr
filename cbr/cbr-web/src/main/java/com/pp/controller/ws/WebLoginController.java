package com.pp.controller.ws;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pp.model.User;

@Controller
public class WebLoginController {
    
	//Using @RequestMapping With Dynamic URIs
	@RequestMapping(value = "/userlogin/{email}/{password}", method = RequestMethod.GET)
	public ResponseEntity<User> getUserInformation(@PathVariable String email, @PathVariable String password) {
		System.out.println(email);
		System.out.println(password);
		User user=new User();
		user.setUserId(1);
		
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/userlogin", method = RequestMethod.POST)
	public ResponseEntity<Boolean> userLogin(@RequestBody User user) {
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	
	@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> userDelete(@PathVariable Integer id) {
		System.out.println("deleted");
		return new ResponseEntity<String>("user deleted", HttpStatus.OK);
	}
}
