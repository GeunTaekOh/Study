package test;


public abstract class Glove {

	protected int attackSpeed;
	protected int attackStrength;

	public Glove(int attackStrength, int attackSpeed) {
		
		this.attackSpeed = attackSpeed;
		this.attackStrength = attackStrength;
	}
	
	public int getAttackSpeed() { return attackSpeed; }
	public int getAttackStrength() {return attackStrength; }
}
