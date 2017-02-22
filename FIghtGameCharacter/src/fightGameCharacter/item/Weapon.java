package fightGameCharacter.item;

import fightGameCharacter.attack.Attack;
import fightGameCharacter.character.Enemy;

public class Weapon {
	
	protected int attackSpeed;
	protected int attackStrength;
	
	public Weapon(int attackSpeed, int attackStrength) {
		this.attackSpeed = attackSpeed;
		this.attackStrength = attackStrength;
	}
	
	public int getAttackSpeed() { return attackSpeed; }
	public int getAttackStrength() { return attackStrength; }
	
	public void attack(Enemy enemy, Attack attack){
		if(attack!=null)
		attack.execute(enemy);
	}
	
}
