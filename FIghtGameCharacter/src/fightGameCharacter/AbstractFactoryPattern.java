package fightGameCharacter;

import fightGameCharacter.attack.AttackRegistry;

import fightGameCharacter.attack.FireBallAttack;
import fightGameCharacter.attack.KnifeAttack;
import fightGameCharacter.character.AbstractCharacterFactory;
import fightGameCharacter.character.CharacterFactory;
import fightGameCharacter.character.Enemy;
import fightGameCharacter.character.GameCharacter;

public class AbstractFactoryPattern {

	public static void main(String[] args) {

		AbstractCharacterFactory characterFactory = new CharacterFactory();
		GameCharacter sanguk = characterFactory.createCharacter();
		sanguk.setEnemy(new Enemy("Geuntaek", "localhost"));

		AttackRegistry.registerAttack(49, new KnifeAttack(sanguk));
		AttackRegistry.registerAttack(50, new FireBallAttack(sanguk));
	}
}