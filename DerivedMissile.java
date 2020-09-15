package edu.neu.csye6200;

public class DerivedMissile extends DerivedExplosion {
	@Override
	public void explode() {
		System.out.println("A derived Missile has been launched!");
	}
	
	public static void demo() {
		AbstractExplosion amiss= new DerivedMissile(); //DerivedMissile IS-A DerivedExplosion
		amiss.explode(); // Polymorphism; explode() in DerivedMissile(child), overrides the explode() in DerivedExplosion(Parent)
		System.out.println("\n\t Demonstrating polymorphism in classes derived from AbstractExplosion...DONE!");
	}
}
