package edu.neu.csye6200;

public class Driver {
	public static void main(String args[]) {
		
		
		ExplosionModel.demo();
		ExplosionModelA.demo();
		ExplodableModel.demo();
		
		Grenade.demo();
		Gunshot.demo();
		Missile.demo();
		
		DerivedGrenade.demo();
		DerivedGunshot.demo();
		DerivedMissile.demo();
		
		ExplodableGrenade.demo();
		ExplodableGunshot.demo();
		ExplodableMissile.demo();
		

		
	}
}

/* OUTPUT

		edu.neu.csye6200.ExplosionModel.demo() 
Explosion[**EXPLODE**]]
A gun was fired!
This is an AbstractExplosionModel extended explosion!
	 USING GoF Factory pattern demo()...
A gun was fired!
A grenade has exploded!
A nuclear Missile has been launched!
	 USING GoF Factory pattern demo() ...DONE!

	edu.neu.csye6200.ExplosionModel.demo() ...DONE!

	edu.neu.csye6200.ExplosionModelA.demo() ...
An explosion has taken place
A derived grenade has exploded!
This is AbstractExplosionModelA extended explosion 
	 USING GoF Factory pattern demo()...
Derived Gunshot exploded 25 times!
Derived Grenade exploded 10 times!
Derived Missile exploded 2 times!
A derived Gunshot has exploded!
A derived grenade has exploded!
A derived Missile has been launched!
	 USING GoF Factory pattern demo()...

	edu.neu.csye6200.ExplosionModelA.demo() ...DONE!

	edu.neu.csye6200.ExplodableModel.demo() ...
An explosion might happen!
A missile might explode!
	 USING GoF Factory pattern demo()...
A gunshot might explode!
A grenade might Explode!
A missile might explode!
	 USING GoF Factory pattern demo()..DONE!.

	edu.neu.csye6200.ExplodableModel.demo() ...DONE!

	 demonstrating polymorphism in classes derived from Explosion
A grenade has exploded!
A gun was fired!
A nuclear Missile has been launched!

	 demonstrating polymorphism in classes derived from Explosion...DONE!

	 Demonstrating polymorphism in classes derived from AbstractExplosion
A derived grenade has exploded!
A derived Gunshot has exploded!
A derived Missile has been launched!

	 Demonstrating polymorphism in classes derived from AbstractExplosion...DONE!

	 Demonstrating polymorphism in classes derived from Explodable which implements ExplodableAPI
A grenade might Explode!
A gunshot might explode!
A missile might explode!

	 Demonstrating polymorphism in classes derived from Explodable which implements ExplodableAPI...DONE!
	 
*/
