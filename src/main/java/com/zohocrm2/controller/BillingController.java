package com.zohocrm2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm2.entities.Billing;

@Controller
public class BillingController {
	
	@RequestMapping("/showGenerateBillPage")
	public String showGenerateBillPage() {
		return "generate_bill";
	}
	@RequestMapping("/generateBill")
	public String generateBill(@ModelAttribute("bill")Billing bill) {
		
		return "search_billing_result";
	}
}
