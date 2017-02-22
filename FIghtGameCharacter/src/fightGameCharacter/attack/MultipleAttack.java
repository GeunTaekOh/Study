package fightGameCharacter.attack;

import fightGameCharacter.character.GameCharacter;

public abstract class MultipleAttack extends Attack{
	public MultipleAttack(int attackStrength, int attackSpeed, GameCharacter gameCharacter) {
		super(attackStrength, attackSpeed, gameCharacter);
	}
}
