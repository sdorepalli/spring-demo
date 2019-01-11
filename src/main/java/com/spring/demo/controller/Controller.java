package com.spring.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.model.PaymentMethod;

@RestController
@RequestMapping("/customers")
public class Controller {
	
	/*
	 * @RequestMapping(value="/value", method = RequestMethod.GET) public String
	 * showPaymentMethod Details(@RequestParm("key") String key PaymentMethod
	 * paymentmethod) { paymentmethod.setKey(key);
	 * 
	 * }
	 */
}
