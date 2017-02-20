package test;

public class Weapon {

	protected int attackStrength;
	protected int attackSpeed;
	
	
	public Weapon(int atk, int spd){
		this.attackStrength = atk;
		this.attackSpeed = spd;
		
	}
	
	public int getAttackSpeed() { return attackSpeed; }
	public int getAttackStrength() {return attackStrength; }
	
	
}
