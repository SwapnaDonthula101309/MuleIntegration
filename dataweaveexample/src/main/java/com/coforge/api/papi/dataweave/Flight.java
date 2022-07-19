package com.coforge.api.papi.dataweave;

import java.io.Serializable;

public class Flight implements Serializable, Comparable<Flight> {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8529139837857257139L;
	
	private String flightCode;
	private String origination;
	private int availableSeats;
	private String departureDate;
	private String airlineName;
	private String destination;
	private double price;
	private String planeType;
	

	public String getFlightCode() {
		return flightCode;
	}



	public void setFlightCode(String flightCode) {
		this.flightCode = flightCode;
	}



	public String getOrigination() {
		return origination;
	}



	public void setOrigination(String origination) {
		this.origination = origination;
	}



	public int getAvailableSeats() {
		return availableSeats;
	}



	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}



	public String getDepartureDate() {
		return departureDate;
	}



	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}



	public String getAirlineName() {
		return airlineName;
	}



	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}



	public String getDestination() {
		return destination;
	}



	public void setDestination(String destination) {
		this.destination = destination;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public String getPlaneType() {
		return planeType;
	}



	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public Flight(String flightCode, String origination, int availableSeats, String departureDate, String airlineName,
			String destination, double price, String planeType) {
		super();
		this.flightCode = flightCode;
		this.origination = origination;
		this.availableSeats = availableSeats;
		this.departureDate = departureDate;
		this.airlineName = airlineName;
		this.destination = destination;
		this.price = price;
		this.planeType = planeType;
	}



	@Override
	public int compareTo(Flight o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
