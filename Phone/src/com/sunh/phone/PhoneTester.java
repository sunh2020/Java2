package com.sunh.phone;

public class PhoneTester {
	public static void main(String[] args) {
		Galaxy s10 = new Galaxy("S10", 99, "Verizon", "Ring Ring Ring!");
		IPhone iphoneTen = new IPhone("XX", 100, "AT&T", "Zing");
		
		s10.displayInfo();
		System.out.println(s10.ring());
		System.out.println(s10.unlock());
		
		iphoneTen.displayInfo();
		System.out.println(iphoneTen.ring());
		System.out.println(iphoneTen.unlock());
	}
		
}
