package com.ojas.transport;

public class ContainerShip extends WaterTransport {
	
	private String companyName;
	private WaterTransport water;

	public ContainerShip(int id, String customerName, String arrivalPort, String departurePort, float weight,String companyName) {
		super(id, customerName, arrivalPort, departurePort, weight);
		this.companyName=companyName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public WaterTransport getWater() {
		return water;
	}

	public void setWater(WaterTransport water) {
		this.water = water;
	}
 public void displaydDetails(){
	 System.out.println("ContainerShip details::"+water+","+companyName);
 }
}
