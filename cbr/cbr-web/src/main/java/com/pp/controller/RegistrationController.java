package com.pp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.pp.model.RegistrationDTO;
import com.pp.repositary.RegistrationRepository;
import com.pp.validator.RegistrationValidator;

@Controller
public class RegistrationController {

	@Autowired
	private RegistrationRepository registrationRepository;

	@Autowired
	private RegistrationValidator registrationValidator;

	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String registrationShowPage(Model model) {
		RegistrationDTO reg = new RegistrationDTO();
		model.addAttribute("RegistrationDTO", reg);
		return "registration";
	}

	@RequestMapping(value = "/registrationsubmit", method = RequestMethod.POST)
	public String registrationSubmitPage(@ModelAttribute("RegistrationDTO") RegistrationDTO reg, BindingResult result,
			RedirectAttributes redirAttr) {
		registrationValidator.validate(reg, result);
		System.out.println(result.hasErrors());
		System.out.println(result.getErrorCount());
		if (result.hasErrors()) {
			return "registration";
		} else {
			registrationRepository.registrationSave(reg);
//			redirAttr.addFlashAttribute("register", reg);
			return "redirect:/login";
		}

	}

}
