package edu.neu.csye6200;

public class DerivedGunshotFactory extends AbstractExplosionFactory {
	/* Get an AbstractExplosion object
	 * @return
	 */
	@Override
	public AbstractExplosion getObject(int times) {
		// TODO Auto-generated method stub
		System.out.println("Derived Gunshot exploded " +times+ " times!");
		return new DerivedGunshot();
	}

}
