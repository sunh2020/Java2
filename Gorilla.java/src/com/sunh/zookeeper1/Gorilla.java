package com.sunh.zookeeper1;

public class Gorilla extends Mammal {
				
		public Gorilla(int energyLevel) {
		super(energyLevel);
		// TODO Auto-generated constructor stub
	}
		public Gorilla throwSomething() {
			System.out.println("The gorilla throwing stuff here");
			this.energyLevel -= 5;
			return this;
		}
		public Gorilla eatBananas() {
			System.out.println("The gorilla eating bananas");
			return this;
		}
		public Gorilla climb() {
			System.out.println("The gorilla climbing stuff here");
			this.energyLevel -= 10;
			return this;
		}
	}
	
