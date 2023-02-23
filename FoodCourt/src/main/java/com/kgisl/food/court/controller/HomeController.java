package com.kgisl.food.court.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kgisl.food.court.model.User;

@Controller
public class HomeController {

	List<String> pizzaList;

	@ModelAttribute
	public void preLoad(Model model) {
		pizzaList = new ArrayList<>();
		pizzaList.add("Meat Pizza");
		pizzaList.add("Veggie Pizza");
		pizzaList.add("Pepperoni Pizza");
		pizzaList.add("BBQ Chicken Pizza");
	}

	List<String> toppings;

	@ModelAttribute
	public void preLoadToppings(Model model) {
		toppings = new ArrayList<>();
		toppings.add("Potato, sausage, pancetta/speck/bacon.");
		toppings.add("Gorgonzola and mushroom.");
		toppings.add("Black olives, anchovies, capers.");
		toppings.add("Capers, anchovies, eggplant, capsicum.");
	}

	List<String> sizes;

	@ModelAttribute
	public void preLoadSizes(Model model) {
		sizes = new ArrayList<>();
		sizes.add("Small -$100");
		sizes.add("Medium -$150");
		sizes.add("Big -$200");
	}

	@GetMapping("/index")
	String index() {
		return "index";
	}

	@GetMapping("/login")
	String login(Model model) {
		return "login";
	}

	@GetMapping(value = "/order")
	public String orderFood(@ModelAttribute("user") User user, Model model) {
		model.addAttribute("getdata", user.toString());
		model.addAttribute("pizzaList", pizzaList);
		model.addAttribute("toppings", toppings);
		model.addAttribute("sizes", sizes);
		return "order";
	}

	@PostMapping(value = "/confirm")
	public String confirmOrder(@ModelAttribute("user") User user, Model model) {
		model.addAttribute("getdata", user.toString());
		model.addAttribute("localDateTime", LocalDateTime.now());
		return "confirm";
	}

	@PostMapping(value = "/summary")
	public String getSummary(@ModelAttribute("user") User user, Model model) {
		model.addAttribute("getdata", user.toString());
		model.addAttribute("localDateTime", LocalDateTime.now());
		return "summary";
	}

}
