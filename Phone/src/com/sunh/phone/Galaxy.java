package com.sunh.phone;

public class Galaxy extends Phone{

	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String ring() {
	       return "Galaxy " + getVersionNumber() + " hi " + getRingTone();
	}
	@Override
	public String unlock() {
	       return "Unlocking the Galaxy";
	}
	@Override
	public void displayInfo() {
	      System.out.println("Galaxy " + getVersionNumber() + " from " + getCarrier());            
	      
	}
}
