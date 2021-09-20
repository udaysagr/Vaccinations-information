package com.htc.userservice.reciever;

import java.time.LocalDateTime;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Centre_details {
	
	@RabbitListener(queues = "to-users")
	public void receivesFromQueue(Centre_ServiceDto centreService) {
		System.out.println("Recieved detals Of Vaccination Centre  @" + LocalDateTime.now() + " " +centreService.toString());
	}

}
