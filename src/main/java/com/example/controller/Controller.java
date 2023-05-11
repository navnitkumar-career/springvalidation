package com.example.controller;

import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.entities.User;

@org.springframework.stereotype.Controller
public class Controller {

	@GetMapping("/Form")
	public String loginForm(Model model)
	{
		model.addAttribute("User",new User());
		return "loginForm";
	}
	
	@PostMapping("/processLoginForm")
	public String processLoginForm(@Valid @ModelAttribute("User") User user , BindingResult result) 
	{
		if(result.hasErrors())
		{
			System.out.println(result);
			return "loginForm";
		}
		System.out.println(user);
		return "successLogin";
	}
}
