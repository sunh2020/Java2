package com.sunh.zookeeper2;

public class Bat extends Mammal {
	public Bat (int energyLevel) {
		super(300);
}
	public Bat fly() {
		System.out.println("I'm a bat and flying the town");
		this.energyLevel -= 50;
		return this;
	}
	public Bat eatHumans() {
		System.out.println("I'm eating Humans");
		this.energyLevel += 25;
		return this;
	}
	public Bat attackTown() {
		System.out.println("I'm attacking town");
		this.energyLevel -= 100;
		return this;
	}
}	