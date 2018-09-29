package com.pp.controller.ws;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pp.model.UserDTO;

@Controller
public class WebLoginController {

	@RequestMapping(value = "/userlogin/{email}/{password}", method = RequestMethod.GET)
	public ResponseEntity<UserDTO> getUserInformation(@PathVariable String email, @PathVariable String password) {
		System.out.println(email);
		System.out.println(password);
		UserDTO dt=new UserDTO();
		dt.setId(1);
		dt.setEmail("r@com");
		dt.setPassword("*****");
		
		return new ResponseEntity<UserDTO>(dt, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/userlogin", method = RequestMethod.POST)
	public ResponseEntity<Boolean> userLogin(@RequestBody UserDTO user) {
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> userDelete(@PathVariable Integer id) {
		System.out.println("deleted");
		return new ResponseEntity<String>("user deleted", HttpStatus.OK);
	}
}
