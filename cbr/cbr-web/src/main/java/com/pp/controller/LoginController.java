package com.pp.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.pp.exception.CustomizedException;
import com.pp.model.User;
import com.pp.validator.LoginValidator;

@Controller
public class LoginController {
	
	@Autowired
	private LoginValidator loginValidator;

	private static Logger log = Logger.getLogger(LoginController.class);

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showPage(Map<Object, Object> map) {
		log.info("-----loginshowpage---");
		User user = new User();
		map.put("user", user);
		return "login";
	}

	@RequestMapping(value = "/loginsubmit", method = RequestMethod.GET)
	public String login(Model model, @ModelAttribute("user") User user, HttpServletRequest request,
			BindingResult result) {

		log.info("-----------loginsubmit-----");
		loginValidator.validate(user, result);
		if (result.getErrorCount() > 0) {
			log.error("--------error----------");
			return "login";
		} else {
			HttpSession session = request.getSession();
			session.setAttribute("login", user);
			log.info("--------session set------");
			return "welcome";
		}

	}

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String showPageWelcome() {
		return "welcome";
	}

	@ExceptionHandler(CustomizedException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "IOException occured")
	public void handleIOException() {
		log.error("IOException handler executed");
		System.out.println("controller exception");
		// returning 404 error code
	}
}
