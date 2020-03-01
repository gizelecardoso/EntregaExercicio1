
public abstract class Character {
	
	private WeaponBehavior weapon;
	
	public abstract void figth();
	

	public void setWeapon(WeaponBehavior weapon) {
		weapon.useWeapon();
	}
	

}
