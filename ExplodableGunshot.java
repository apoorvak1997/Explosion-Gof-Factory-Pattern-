package edu.neu.csye6200;

public class ExplodableGunshot extends Explodable {
	@Override
	public void explode() {
		System.out.println("A gunshot might explode!");
	}
	
	public static void demo() {
		Explodable egun= new ExplodableGunshot(); //ExplodableGunshot IS-A Explodable
		egun.explode(); // Polymorphism; explode() in ExplodableGunshot(child), overrides the explode() in Explodable(Parent)
	}
}
