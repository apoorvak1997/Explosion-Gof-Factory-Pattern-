package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

//3. ExplosionModelA derived from AbstractExplosionModelA
public class ExplosionModelA extends AbstractExplosionModelA{ 
	List <AbstractExplosion> explosionModelA = new ArrayList<>();
	


	public void add(AbstractExplosion e) { 
		//implementation for abstract add() in AbstractExplosionModelA
		this.explosionModelA.add(e);
	};
	
	public void explode() {
		System.out.println("This is AbstractExplosionModelA extended explosion ");
	}
	
	public void explodeAll() {
		for(AbstractExplosion explosionab: explosionModelA) {
			explosionab.explode();
		}
	}
	
	/*  3a.  static demo() method to be called from Driver class
	 * demonstrating its usage with objects derived from AbstractExplosionAPI class.*/
	
	public static void demo() {
		
		System.out.println("\n\t"+ExplosionModelA.class.getName()+ ".demo() ...");
		
			ExplosionModelA expma=new ExplosionModelA();
			//6. Demonstrating dynamic run time polymorphism in demo method.
			AbstractExplosion e= new DerivedExplosion(); // object of type DerivedExplosion IS-A AbstractExplosion
			e.explode(); // implementation for explode() in DerivedExplosion
			AbstractExplosion f= new DerivedGrenade();// DerivedGrenade IS-A DerivedExplosion(derived from AbstractExplosion)
			f.explode();//Polymorphism: explode() of DerivedGrenade(child) overrides explode() of DerivedExplosion(parent)
			//expma.add(e); 
			//expma.add(f);
			expma.explode();//explode() of ExplosionModelA
			
			//expma.add(new DerivedExplosion());//object of type DerivedExplosion which IS-A AbstractExplosion
		
		
			// 5b. obtaining an object USING GoF Factory pattern so there is are AbstractExplosion objects to explode
			System.out.println("\t USING GoF Factory pattern demo()...");
		AbstractExplosionFactory facDerivedGunshot = new DerivedGunshotFactory();
		expma.add(facDerivedGunshot.getObject(25));
		
		AbstractExplosionFactory facDerivedGrenade = new DerivedGrenadeFactory();
		expma.add(facDerivedGrenade.getObject(10));
		
		AbstractExplosionFactory facDerivedMissile = new DerivedMissileFactory();
		expma.add(facDerivedMissile.getObject(2));
		
		expma.explodeAll();
		System.out.println("\t USING GoF Factory pattern demo()...");
		System.out.println("\n\t"+ExplosionModelA.class.getName()+ ".demo() ...DONE!");
		
	}
}