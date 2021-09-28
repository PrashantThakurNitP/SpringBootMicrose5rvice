package com.loblaws.SmsService.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@Configuration
@ConfigurationProperties("twilio")
public class Twilioproperties {
	
	private String accountSid;
	private String authToken;
	private String fromNumber;
	
}
