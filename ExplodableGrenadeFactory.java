package edu.neu.csye6200;

public class ExplodableGrenadeFactory extends ExplodableAPIFactory {
	/* Get an Explosion object
	 * @return
	 */
	@Override
	public ExplodableAPI getObject() {
		// TODO Auto-generated method stub

		return new ExplodableGrenade();
		
	}

}
