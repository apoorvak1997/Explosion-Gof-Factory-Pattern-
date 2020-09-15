package edu.neu.csye6200;

public class ExplodableGrenade extends Explodable {
	@Override
	public void explode() {
		System.out.println("A grenade might Explode!");
	}
	
	public static void demo() {
		System.out.println("\n\t Demonstrating polymorphism in classes derived from Explodable which implements ExplodableAPI");
		Explodable egren= new ExplodableGrenade(); //ExplodableGrenade IS-A Explodable
		egren.explode(); // Polymorphism; explode() in ExplodableGrenade(child), overrides the explode() in Explodable(Parent)
	}
}
