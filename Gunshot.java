package edu.neu.csye6200;

public class Gunshot extends Explosion{



	private static String Bullets="A gun";
	private static String Noise="was fired!";

   @Override
	public void explode() {
		System.out.println(Bullets + " " + Noise);
	}
 
   public static void demo() {
	 
	  Explosion guns = new Gunshot(); //Gunshot IS-A Explosion.
	  guns.explode();// Polymorphism; explode() in Gunshot(child), overrides the explode() in Explosion(Parent)
	 
   }
}
