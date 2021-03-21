package com.sunh.phone;

public class IPhone extends Phone {

	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String ring() {
	       return "IPhone " + getVersionNumber() + "yea " + getRingTone();
	}
	@Override
	public String unlock() {
	       return "Unlocking via facial recognition";
 	}
	@Override
	public void displayInfo() {
	     System.out.println("IPhone " + getVersionNumber() + "from " + getCarrier());          
	}

}
