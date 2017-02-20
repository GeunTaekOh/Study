package test;

public abstract class Knife extends Weapon{
	
	protected int attackSpeed;
	protected int attackStrength;

	public Knife(int attackStrength, int attackSpeed) {
		super(attackStrength, attackSpeed);
	}
	
	public int getAttackSpeed() { return attackSpeed; }
	public int getAttackStrength() {return attackStrength; }
}
