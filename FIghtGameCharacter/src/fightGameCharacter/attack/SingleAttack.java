package fightGameCharacter.attack;

import fightGameCharacter.character.GameCharacter;

public abstract class SingleAttack extends Attack{
	public SingleAttack(int attackStrength, int attackSpeed, GameCharacter gameCharacter) {
		super(attackStrength, attackSpeed, gameCharacter);
	}
}
