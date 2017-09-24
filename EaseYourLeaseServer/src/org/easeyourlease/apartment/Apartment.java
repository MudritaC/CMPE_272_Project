package org.easeyourlease.apartment;

public class Apartment {
	

	private String apartmentID;
	private String apartmentName;
	private String apartmentDiscription;
	
	public String getApartmentID() {
		return apartmentID;
	}
	public void setApartmentID(String apartmentID) {
		this.apartmentID = apartmentID;
	}
	public String getApartmentName() {
		return apartmentName;
	}
	public void setApartmentName(String apartmentName) {
		this.apartmentName = apartmentName;
	}
	public String getApartmentDiscription() {
		return apartmentDiscription;
	}
	public void setApartmentDiscription(String apartmentDiscription) {
		this.apartmentDiscription = apartmentDiscription;
	}
	
	public void setApartmentDetails(String apartmentID, String apartmentName, String apartmentDiscription ) {
		setApartmentID(apartmentID);
		setApartmentName(apartmentName);
		setApartmentDiscription(apartmentDiscription);
	}

}
