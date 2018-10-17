package com.pp.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.pp.model.Registration;
import com.pp.repo.RegistrationDAO;
import com.pp.validator.RegistrationValidator;

@Controller
public class RegistrationController {
	
	private static Logger log = Logger.getLogger(RegistrationController.class);

	@Autowired
	private RegistrationDAO registration;

	@Autowired
	private RegistrationValidator registrationValidator;

	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String registrationShowPage(Model model) {
		Registration reg = new Registration();
		model.addAttribute("RegistrationDTO", reg);
		return "registration";
	}

	@RequestMapping(value = "/registrationsubmit", method = RequestMethod.POST)
	public String registrationSubmitPage(@ModelAttribute("RegistrationDTO") Registration reg, BindingResult result,
			RedirectAttributes redirAttr) 
	  {
		registrationValidator.validate(reg, result);
		log.error(RegistrationController.class+"  Registration Validation" + " error "+result.hasErrors());
		if (result.hasErrors()) {
			return "registration";
		} else {
			registration.save(reg);
//			redirAttr.addFlashAttribute("register", reg);
			return "redirect:/login";
		}

	}

}
