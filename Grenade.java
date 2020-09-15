package edu.neu.csye6200;

public class Grenade extends Explosion{
	private static String PinOut  ="A grenade";
	private static String Noise = "has exploded!";
	
	@Override
	public void explode() {
		System.out.println(PinOut + " " + Noise);
	}
	
	  public static void demo() {
		  System.out.println("\n\t demonstrating polymorphism in classes derived from Explosion");
		  Explosion gren = new Grenade();//Grenade IS-A Explosion.
		  gren.explode(); //Polymorphism; explode() in Grenade(child), overrides the explode() in Explosion(Parent)
		  
	   }


}

