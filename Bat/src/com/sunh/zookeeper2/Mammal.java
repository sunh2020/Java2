package com.sunh.zookeeper2;

public class Mammal {
	protected int energyLevel;
	
	public int displayEnergy() {
		System.out.println("Energy Level: " + energyLevel);
		return energyLevel;
	}
	public Mammal(int energyLevel) {
		this.energyLevel = 300;
	}
}
