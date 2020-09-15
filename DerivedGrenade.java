package edu.neu.csye6200;

public class DerivedGrenade extends DerivedExplosion{
	@Override
	public void explode() {
		System.out.println("A derived grenade has exploded!");
	}
	
	public static void demo() {
		System.out.println("\n\t Demonstrating polymorphism in classes derived from AbstractExplosion");
		AbstractExplosion agren= new DerivedGrenade(); //DerivedGrenade IS-A DerivedExplosion.
		agren.explode(); // Polymorphism; explode() in DerivedGrenade(child), overrides the explode() in DerivedExplosion(Parent)
	}
}
