package com.ojas.transport;

public class WaterTransport extends Shipment {
	
	private String capacity;
	
	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public WaterTransport(int id, String customerName, String arrivalPort, String departurePort, float weight) {
		super(id, departurePort, departurePort, departurePort, weight);
		this.capacity=capacity;
	}


}
