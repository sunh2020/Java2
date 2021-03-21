package com.sunh.zookeeper2;

public class BatTest {
	public static void main(String[] args) {
		Bat b = new Bat(0);
		b.fly().fly().fly();
		b.eatHumans().eatHumans();
		b.attackTown();
		b.displayEnergy();
}
}