package it.master.travelagency.customer;

import it.master.travelagency.travel.Travel;

public class Traveler extends CustomerType {
	
	private Travel travel;
	
	public Traveler(CustomerInterface customerInterface, Travel travel) {
		super(customerInterface);
		this.travel = travel;
	}
	
	public Travel getTravel() {
		return travel;
	}
	
	public void setTravel(Travel travel) {
		this.travel = travel;
	}

}
