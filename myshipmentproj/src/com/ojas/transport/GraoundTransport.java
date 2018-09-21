package com.ojas.transport;

public class GraoundTransport extends Shipment {
	
	private String capacity;

	public GraoundTransport(int id, String customerName, String arrivalPort, String departurePort, float weight,String capacity) {
		super(id, customerName, arrivalPort, departurePort, weight);
		
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

}
