package com.loblaws.SmsService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loblaws.SmsService.config.Twilioproperties;
import com.loblaws.SmsService.dto.Smsrequest;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
@Service
public class SmsService {
	private final Twilioproperties twilioproperties;

	@Autowired
	public SmsService(Twilioproperties twilioproperties)
	{
		this.twilioproperties=twilioproperties;
	}
	
	//send message to number
	public String sendOrderUpdate(Smsrequest smsrequest)
	{
		System.out.print("sms request is "); System.out.println(smsrequest.getNumber());
     
		Message message=Message.creator(new PhoneNumber("+91"+smsrequest.getNumber()), new PhoneNumber(twilioproperties.getFromNumber()), "Hello "+smsrequest.getMessage()+"  Your order has been booked").create();
        return message.getStatus().toString();
        
	
	}
	public String sendDeliveryUpdate(Smsrequest smsrequest)
	{
		System.out.print("sms request is "); System.out.println(smsrequest.getNumber());
     
		Message message=Message.creator(new PhoneNumber("+91"+smsrequest.getNumber()), new PhoneNumber(twilioproperties.getFromNumber()), "Hello "+smsrequest.getMessage()+"  Your order delivered").create();
        return message.getStatus().toString();
        
	
	}
}
