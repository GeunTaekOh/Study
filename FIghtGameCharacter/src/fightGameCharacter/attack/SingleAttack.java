package fightGameCharacter.attack;

import fightGameCharacter.character.GameCharacter;

public abstract class SingleAttack extends Attack{
	public SingleAttack(int attackStrength, GameCharacter gameCharacter) {
		super(attackStrength, gameCharacter);
	}
}
