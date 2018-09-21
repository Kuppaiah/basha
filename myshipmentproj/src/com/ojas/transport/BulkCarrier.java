package com.ojas.transport;

public class BulkCarrier extends WaterTransport {
	
	private String companyName;
	private WaterTransport water;

	public BulkCarrier(int id, String customerName, String arrivalPort, String departurePort, float weight,String companyName) {
		super(id, customerName, arrivalPort, departurePort, weight);
		
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
	public void displayDetails(){
		System.out.println("the bulkCarrier:"+water+","+companyName);
	}

}
