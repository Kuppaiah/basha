package com.ojas.transport;

public class Shipment {
	
	private int id;
	private String customerName;
	private String arrivalPort;
	private String departurePort;
	private float weight;
	
	//create 5 argument constructor
	public Shipment(int id, String customerName, String arrivalPort, String departurePort, float weight) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.arrivalPort = arrivalPort;
		this.departurePort = departurePort;
		this.weight = weight;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getArrivalPort() {
		return arrivalPort;
	}

	public void setArrivalPort(String arrivalPort) {
		this.arrivalPort = arrivalPort;
	}

	public String getDeparturePort() {
		return departurePort;
	}

	public void setDeparturePort(String departurePort) {
		this.departurePort = departurePort;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	//create the dispay details method
		public void displayDetails(){
			System.out.println("the details  of the shipment:shipment"+id+","+customerName+","+"arrivalPort"+","+departurePort+","+weight);
		}
	
	

}
