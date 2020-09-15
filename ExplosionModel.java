package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

/* 2. Explosion Model derived from AbstractExplosionModel */
public class ExplosionModel extends AbstractExplosionModel { 
	private List<Explosion> explosionObjects = new ArrayList<>();

	
	public void add(Explosion e) {
	//implementation for abstract add() in AbstractExplosionModel
		this.explosionObjects.add(e);
	}
	
	public void explode() { 
		System.out.println("This is an AbstractExplosionModel extended explosion!");
	}
	

	
	public void explodeAll() {
		for(Explosion exp: explosionObjects) {
			exp.explode();
		}
	}
	

	public static void demo() {
		System.out.println("\n\t" +ExplosionModel.class.getName() +".demo() ");
		/* 2a. static demo() method to be called from Driver class
		 *  demonstrating usage with objects derived from Explosion */
		
		ExplosionModel expm=new ExplosionModel();
		Explosion e= new Explosion(); // object e is of type Explosion
		e.explode();//explode() implementation in concrete Parent Explosion class.
		// 6. Demonstrating Dynamic run time polymorphism in demo method.
		Explosion f= new Gunshot();
		f.explode();//Polymorphism: f(Gunshot) IS-A Explosion, and overrides explode() of Explosion(parent)
		expm.explode();//explode() of ExplosionModel. 
	
		
		// 5b. obtaining an object USING GoF Factory pattern so there  are Explosion objects to explode
		System.out.println("\t USING GoF Factory pattern demo()...");
		
		ExplosionFactory gunshotFac = new GunshotFactory();
		expm.add(gunshotFac.getObject()); 
		
		ExplosionFactory facGrenade = new GrenadeFactory();
		expm.add(facGrenade.getObject());  
		
		ExplosionFactory facMissile = new MissileFactory();
		expm.add(facMissile.getObject()); 
		
		expm.explodeAll();
		System.out.println("\t USING GoF Factory pattern demo() ...DONE!");
		
		System.out.println("\n\t" +ExplosionModel.class.getName() + ".demo() ...DONE!");
		
	}
	
}
