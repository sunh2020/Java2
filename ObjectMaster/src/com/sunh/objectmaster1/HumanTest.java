package com.sunh.objectmaster1;

public class HumanTest {
	public static void main(String[] args) {
		Human h = new Human();
		Human s = new Human();
		
		h.attack(s);
		h.displayHealth();
		s.displayHealth();
		
}
}