package com.loblaws.SmsService.config;

import org.springframework.context.annotation.Configuration;

import com.twilio.Twilio;
@Configuration
public class TwilioInitializer {
private final Twilioproperties twilioproperties;
	
	public TwilioInitializer(Twilioproperties twilioproperties)
	{
		this.twilioproperties=twilioproperties;
		Twilio.init(twilioproperties.getAccountSid(), twilioproperties.getAuthToken());
		System.out.println("twilio intialized with account: "+twilioproperties.getAccountSid());
	}

}
