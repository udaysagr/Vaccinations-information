package com.htc.userservice.reciever;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class Centre_ServiceDto {


	private long centre_id;
	private String centre_address;
	private long pin_code;
	private LocalDateTime scheduled_date_time;
	
	
	public Centre_ServiceDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Centre_ServiceDto(long centre_id, String centre_address, long pin_code, LocalDateTime scheduled_date_time) {
		super();
		this.centre_id = centre_id;
		this.centre_address = centre_address;
		this.pin_code = pin_code;
		this.scheduled_date_time = scheduled_date_time;
	}


	public long getCentre_id() {
		return centre_id;
	}


	public void setCentre_id(long centre_id) {
		this.centre_id = centre_id;
	}


	public String getCentre_address() {
		return centre_address;
	}


	public void setCentre_address(String centre_address) {
		this.centre_address = centre_address;
	}


	public long getPin_code() {
		return pin_code;
	}


	public void setPin_code(long pin_code) {
		this.pin_code = pin_code;
	}


	public LocalDateTime getScheduled_date_time() {
		return scheduled_date_time;
	}


	public void setScheduled_date_time(LocalDateTime scheduled_date_time) {
		this.scheduled_date_time = scheduled_date_time;
	}


	@Override
	public String toString() {
		return "Centre_Service [centre_id=" + centre_id + ", centre_address=" + centre_address + ", pin_code="
				+ pin_code + ", scheduled_date_time=" + scheduled_date_time + "]";
	}
	
	
	
	
}
