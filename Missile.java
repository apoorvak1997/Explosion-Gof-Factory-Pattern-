package edu.neu.csye6200;

public class Missile extends Explosion{


	public static String missile="A nuclear";
	
	@Override
	public void explode() {
		System.out.println(missile + " Missile has been launched!");
	}
	
	 public static void demo() {
		
		 Explosion nuclear = new Missile(); // Missile IS-A Explosion
		 nuclear.explode(); // Polymorphism: explode() of Missile overriding explode() of Explosion
		 System.out.println("\n\t demonstrating polymorphism in classes derived from Explosion...DONE!");
	  }
}
