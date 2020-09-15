package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

//4. ExplodableModel derived from AbstractExplodableModel
public class ExplodableModel extends AbstractExplodableModel {

	private List<ExplodableAPI> explodable = new ArrayList<>();
	
	public void add(ExplodableAPI e) {
		//Implementation for abstract add() in the AbstractExplodableModel
		this.explodable.add(e);
	}
	
	public void explodeAll() {
		for(ExplodableAPI explodable:explodable) {
			explodable.explode();
		}

	}
	
	@Override
	public void explode() {
		// TODO Auto-generated method stub
		System.out.println("This is an AbstractExplodableModel extended explosion!"); 
		
	}

	
	/* 4a. static demo() method to be called from Driver class 
	 * demonstrating its usage
      with objects implementing from ExplodableAPI.
    */
	public static void demo() {
		
		System.out.println("\n\t"+ExplodableModel.class.getName()+".demo() ...");
		
		ExplodableModel expobj=new ExplodableModel();
		//6. Demonstrating dynamic run time Polymorphism in Demo method
	    ExplodableAPI a= new Explodable(); //Explodable object implementing ExplodableAPI
		a.explode();// takes the explode() method in Explodable class implementing ExplodableAPI.
		ExplodableAPI b= new ExplodableMissile();//ExplodableMissile() IS-A Explodable which implements the ExplodableAPI.
		b.explode(); //Polymorphism: explode() of ExplodableMissile(child) overrides explode() of ExplodableAPI(parent)
		//expobj.add(a);
		//expobj.add(b);
	
		//expobj.add(new Explodable()); object of type Explodable implementing ExplodableAPI
		
		
		// 5b. obtaining an object USING GoF Factory pattern so there are ExplodableAPI objects to explode
		System.out.println("\t USING GoF Factory pattern demo()...");
		ExplodableAPIFactory facExpGunshot = new ExplodableGunshotFactory();
		expobj.add(facExpGunshot.getObject());// 
		
		ExplodableAPIFactory facExpGrenade = new ExplodableGrenadeFactory();
		expobj.add(facExpGrenade.getObject());
		
		ExplodableAPIFactory facExpMissile = new ExplodableMissileFactory();
		expobj.add(facExpMissile.getObject());
		
		expobj.explodeAll();
		System.out.println("\t USING GoF Factory pattern demo()..DONE!.");
		System.out.println("\n\t"+ExplodableModel.class.getName()+".demo() ...DONE!");
		
		
	}


}
