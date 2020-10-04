package com.demo3.Accommodation;

public class Reservation {

	private Long reservation_id;
	private String Country;
	
	public Reservation() {
		this.Country="";
	}
	
		
	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public Long getReservation_id() {
		return reservation_id;
	}

	public void setReservation_id(Long reservation_id) {
		this.reservation_id = reservation_id;
	}

	

	
}
