package edu.neu.csye6200;

public class GunshotFactory extends ExplosionFactory{

	/* Get an Explosion object
	 * @return
	 */

	@Override
	public Explosion getObject() {

		// TODO Auto-generated method stub
		
		return new Gunshot();
	}


}
