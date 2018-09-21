package com.ojas.transport;

public class Rail extends GraoundTransport {
	
	private int noOfContainer;
	private GraoundTransport ground;

	public Rail(int id, String customerName, String arrivalPort, String departurePort, float weight, String capacity,int numberOfContainer) {
		super(id, customerName, arrivalPort, departurePort, weight, capacity);
		
	}

	public int getNoOfContainer() {
		return noOfContainer;
	}

	public void setNoOfContainer(int noOfContainer) {
		this.noOfContainer = noOfContainer;
	}

	public GraoundTransport getGround() {
		return ground;
	}

	public void setGround(GraoundTransport ground) {
		this.ground = ground;
	}
public void displayDetails(){
	System.out.println("rail details::"+ground+","+noOfContainer);
}
	
}
