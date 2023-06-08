package com.tmf.products.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.tmf.products.Product;
import com.tmf.spring.demo.spring_hibernate_integration.services.ProductServices;

@Controller
public class ProductController {
	@Autowired
	private ProductServices service;
	
	@RequestMapping("getString")
	public String getData() {
		return "Welcome to Spring Web MVC";
	}
	
	@RequestMapping({"/localIndex","/localHome"})
	public String getHome(ModelMap model) {
		Product p1 = new Product(101,"Soap",72.00);
		Product p2 = new Product(102,"Paste",177.00);
		Product p3 = new Product(103,"Oil",154.00);
		Product p4 = new Product(104,"Deturgent",102.00);
		Product p5 = new Product(105,"Shampoo",188.00);
		
		List<Product> products = Arrays.asList(p1,p2,p3,p4,p5);
		model.addAttribute("pros", products);
		
		return "index";
	}
	
	@RequestMapping({"/","/home"})
	public String getIndex(ModelMap model) {
		
		model.addAttribute("pros", service.displayAllProducts());
		
		return "index2";
	}
}
