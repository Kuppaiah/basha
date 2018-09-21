package com.ojas.transport;

public class AirTransport extends Shipment {
	
	private  String airwaysName;

	//create 6-argument contructor of Airport
	public AirTransport(int id, String customerName, String arrivalPort, String departurePort, float weight,String airwaysName) {
		super(id, customerName, arrivalPort, departurePort, weight);
		// TODO Auto-generated constructor stub
	}

	//get Method to get the data
	public String getAirwaysName() {
		return airwaysName;
	}
	//setter method to set the data
	public void setAirwaysName(String airwaysName) {
		this.airwaysName = airwaysName;
	}


//create the dispay details method
	public void displayDetails(){
		System.out.println("the details  of the shipment:AirTransport"+airwaysName);
	}
}
