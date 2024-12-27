package com.springcore.main;

import org.springframework.stereotype.Component;

import com.springcore.services.DeliveryService;

public class Amazon {
	private DeliveryService service;

	static {
		System.out.println("Class A Amazon is loaded");
	}

	public Amazon(DeliveryService service) 
	{
		System.out.println("Injecing through construtor");
		this.service = service;
	}

	public Amazon() {
		System.out.println("Amazon bean is created!");
	}

	public void setService(DeliveryService service) {
		System.out.println("Injecing through Setter");
		this.service = service;
	}

	public boolean deliverTheProduct(Double amount) {
		return service.productDelivery(amount);
	}
}
