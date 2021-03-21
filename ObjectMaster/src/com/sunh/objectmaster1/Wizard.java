package com.sunh.objectmaster1;

public class Wizard extends Human {
	public Wizard() {
		this.health = 50;
		this.intelligence = 8;
	}
	public Wizard heal (Human target) {
		target.health += this.intelligence;
		return this;
	}
	public Wizard fireBall (Human attack) {
		attack.health -= this.intelligence * 3;
		return this;
	}
}
