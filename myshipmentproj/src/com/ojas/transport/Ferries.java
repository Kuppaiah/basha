package com.ojas.transport;

public class Ferries extends WaterTransport {

	private String agentName;
	private WaterTransport water;
	
	public Ferries(int id, String customerName, String arrivalPort, String departurePort, float weight,String agentName ) {
		super(id, customerName, arrivalPort, departurePort, weight);
		// TODO Auto-generated constructor stub
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public WaterTransport getWater() {
		return water;
	}

	public void setWater(WaterTransport water) {
		this.water = water;
	}

	public void dispayDetails(){
		System.out.println("Ferries details::"+water+","+agentName);
	}
}
