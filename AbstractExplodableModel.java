package edu.neu.csye6200;
//API for an Explosion Model which loads and explodes ExplodableAPI objects.
public abstract class AbstractExplodableModel {

	/** 
	 *  Add one ExplodableAPI object to model * 
	 *   @param e       
	 *  ExplodableAPI object */
	public abstract void add(ExplodableAPI e);
	/** * Explode all  */
	public abstract void explode();
	

}

