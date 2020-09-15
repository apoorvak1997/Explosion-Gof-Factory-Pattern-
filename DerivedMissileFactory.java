package edu.neu.csye6200;

public class DerivedMissileFactory extends AbstractExplosionFactory{
	/* Get an AbstractExplosion object
	 * @return
	 */
	@Override
	public AbstractExplosion getObject(int times) {
		// TODO Auto-generated method stub
		System.out.println("Derived Missile exploded " +times+ " times!");
		return new DerivedMissile();
	}

}
