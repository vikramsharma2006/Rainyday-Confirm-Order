package com.example.rainyday.ConfirmOrder.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.rainyday.ConfirmOrder.model.OrderDetails;
import com.example.rainyday.ConfirmOrder.model.OrderPlaced;
import com.example.rainyday.ConfirmOrder.serviceInterface.serviceInterface;


@RestController
public class OrderConfirmation {
	
	@Autowired
	OrderDetails orderdetails;
	
	@Autowired
	serviceInterface setDetails;
	
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@PostMapping("/order")
	public  ResponseEntity<OrderDetails> setOrderid( @RequestBody OrderPlaced orderid) {
		
		logger.info("inside the setorderid:");
		
		OrderDetails orderdetails=setDetails.setOrderDetails(orderid);
		
		logger.info("outside the orderdetails");
		
		return ResponseEntity.status(HttpStatus.CREATED).body(orderdetails);
		
	}
	
	
	
	
}
