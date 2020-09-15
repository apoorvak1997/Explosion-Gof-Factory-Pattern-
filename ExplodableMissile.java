package edu.neu.csye6200;

public class ExplodableMissile extends Explodable {
	@Override
	public void explode() {
		System.out.println("A missile might explode!");
	}
	public static void demo() {
		Explodable emiss= new ExplodableMissile(); //ExplodableMissile IS-A Explodable
		emiss.explode(); // Polymorphism; explode() in ExplodableMissile(child), overrides the explode() in Explodable(Parent).
		
		System.out.println("\n\t Demonstrating polymorphism in classes derived from Explodable which implements ExplodableAPI...DONE!");
	}
}
