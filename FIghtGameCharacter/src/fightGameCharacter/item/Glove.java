package fightGameCharacter.item;

public class Glove {

	protected int attackSpeed;
	protected int attackStrength;
	
	public Glove(int attackSpeed, int attackStrength) {	
		this.attackSpeed = attackSpeed;
		this.attackStrength = attackStrength;
	}
	
	public int getAttackSpeed() { return attackSpeed; }
	public int getAttackStrength() {return attackStrength; }
}
