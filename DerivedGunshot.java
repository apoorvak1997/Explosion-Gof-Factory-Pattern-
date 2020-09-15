package edu.neu.csye6200;

public class DerivedGunshot extends DerivedExplosion {
	@Override
	public void explode() {
		System.out.println("A derived Gunshot has exploded!");
	}
	
	public static void demo() {
		AbstractExplosion agun= new DerivedGunshot(); //DerivedGunshot IS-A DerivedExplosion.
		agun.explode(); // Polymorphism; explode() in DerivedGunshot(child), overrides the explode() in DerivedExplosion(Parent)
	}
}
