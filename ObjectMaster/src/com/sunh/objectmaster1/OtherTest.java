package com.sunh.objectmaster1;

public class OtherTest {
	public static void main(String[] args) {
		Wizard w = new Wizard();
		Wizard w2 = new Wizard();
		Ninja n = new Ninja();
		Ninja n2 = new Ninja();
		Samurai s = new Samurai();
		Samurai s2 = new Samurai();
		Samurai s3 = new Samurai();
		
//		w.heal(w2);
//		w2.attack(w);
//		w.displayHealth();
//		w2.displayHealth();
		
//		n.steal(n2);
//		n2.runAway();
//		n.displayHealth();
//		n2.displayHealth();
		
		s.deathBlow(s2);
		s.meditate();
		s.howMany();
		s.displayHealth();
		
	}
}
