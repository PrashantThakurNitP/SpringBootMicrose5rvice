package com.loblaws.SmsService.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class Smsrequest {
	private String number;
	private String message;


}
