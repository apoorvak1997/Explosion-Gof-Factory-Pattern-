package edu.neu.csye6200;

public class ExplodableGunshotFactory extends ExplodableAPIFactory{
	/* Get an Explosion object
	 * @return
	 */
	@Override
	public ExplodableAPI getObject() {
		// TODO Auto-generated method stub

		return new ExplodableGunshot();
	}

}
