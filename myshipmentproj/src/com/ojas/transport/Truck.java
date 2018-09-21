package com.ojas.transport;

public class Truck extends GraoundTransport {
	
	private GraoundTransport graound;
	private int sizeOfContainer;
	
	public Truck(int id, String customerName, String arrivalPort, String departurePort, float weight, String capacity,int sizeOfContainer) {
		super(id, customerName, arrivalPort, departurePort, weight, capacity);
		
	}
	public int getSizeOfContainer() {
		return sizeOfContainer;
	}
	public void setSizeOfContainer(int sizeOfContainer) {
		this.sizeOfContainer = sizeOfContainer;
	}
	public GraoundTransport getGraound() {
		return graound;
	}
	public void setGraound(GraoundTransport graound) {
		this.graound = graound;
	}
	public void dispalydetails(){
		System.out.println("the deatils for truck:"+graound+","+sizeOfContainer);
	}

}
