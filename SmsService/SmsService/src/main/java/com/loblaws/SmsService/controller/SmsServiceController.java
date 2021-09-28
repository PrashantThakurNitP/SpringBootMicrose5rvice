package com.loblaws.SmsService.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.loblaws.SmsService.dto.Smsrequest;
import com.loblaws.SmsService.service.SmsService;

@RestController
public class SmsServiceController {
	@Autowired
	private SmsService smsservice;

	@GetMapping("/home")
	public String showHome() {

		return "index";

	}

	@PostMapping("/sendmessage/order")
	public ResponseEntity<Object> sendMessageOrderUpdate(Smsrequest smsrequest) {
		String status = smsservice.sendOrderUpdate(smsrequest);
		if ("sent".equals(status) || "queued".equals(status)) {
			return new ResponseEntity<Object>("Order update message sent successfully to "+smsrequest.getNumber(), HttpStatus.OK);
		}
		return new ResponseEntity<Object>("failed to send message", HttpStatus.NOT_FOUND);
	}
	@PostMapping("/sendmessage/delivery")
	public ResponseEntity<Object> sendMessageDeliveryUpdate(Smsrequest smsrequest) {
		String status = smsservice.sendDeliveryUpdate(smsrequest);
		if ("sent".equals(status) || "queued".equals(status)) {
			return new ResponseEntity<Object>("Delivery update message sent successfully to "+smsrequest.getNumber(), HttpStatus.OK);
		}
		return new ResponseEntity<Object>("failed to send message", HttpStatus.NOT_FOUND);
	}

}
