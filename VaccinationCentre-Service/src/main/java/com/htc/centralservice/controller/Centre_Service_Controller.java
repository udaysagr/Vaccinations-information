package com.htc.centralservice.controller;

import java.util.List;

import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.htc.centralservice.entity.Centre_Service;
import com.htc.centralservice.repository.Centre_Interface;

@RestController
@Component
public class Centre_Service_Controller {

	@Autowired
	private Centre_Interface centreServiceInterface;
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	@Autowired
	private Exchange exchange;

	@Value("${data_sendingVia.routingKey}")
	private String routingKey;
	
	@GetMapping("/vaccine/centre/{centre_id}")
	public Centre_Service getCentrebyId(@PathVariable Long centre_id) {
		return centreServiceInterface.findById(centre_id).get();
	}
	
	@PostMapping("/create/centre")
	public Centre_Service createCentre(@RequestBody Centre_Service centreService) {
		
		rabbitTemplate.convertAndSend(exchange.getName(),routingKey,centreService);
		return centreServiceInterface.save(centreService);
	}
	
	@GetMapping("/vaccination/centre/{pincode}")
	public List<Centre_Service> getCentrebypinCode(@PathVariable Long pincode) {
		return centreServiceInterface.findByPin_code(pincode);
	}
}
