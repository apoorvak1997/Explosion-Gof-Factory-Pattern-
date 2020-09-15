package edu.neu.csye6200;

public class ExplodableMissileFactory extends ExplodableAPIFactory {
	/* Get an Explosion object
	 * @return
	 */
	@Override
	public ExplodableAPI getObject() {
		// TODO Auto-generated method stub
		return new ExplodableMissile();
	}

}
