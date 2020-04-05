package com.pizzaDelivery.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PizzaController {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		Pizza thePizza = new Pizza();
		model.addAttribute("pizza", thePizza);
		return "pizza-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute ("pizza") Pizza thePizza, BindingResult theBindingResult) {
		
		if(theBindingResult.hasErrors()) {
			return "pizza-form";
		}else {
			return "pizza-confirmation";
		}
	}

}
