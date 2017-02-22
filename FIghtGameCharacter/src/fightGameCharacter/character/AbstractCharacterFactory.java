package fightGameCharacter.character;

import fightGameCharacter.item.Armor;
import fightGameCharacter.item.Glove;
import fightGameCharacter.item.Weapon;

public abstract class AbstractCharacterFactory {

	public GameCharacter createCharacter() {
		
		Glove glove = this.createGlove();
		Armor armor = this.createArmor();
		Weapon leftKnife = this.createLeftWeapon();
		Weapon rightKnife = this.createRightWeapon();
		
		return GameCharacter.createGameCharacter(glove, armor, leftKnife, rightKnife);
	}
	
	public abstract Glove createGlove();
	public abstract Armor createArmor();
	public abstract Weapon createLeftWeapon();
	public abstract Weapon createRightWeapon();
}