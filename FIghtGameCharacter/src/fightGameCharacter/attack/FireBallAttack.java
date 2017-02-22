package fightGameCharacter.attack;

import fightGameCharacter.character.Enemy;
import fightGameCharacter.character.GameCharacter;

public class FireBallAttack extends MultipleAttack{

	public FireBallAttack(GameCharacter gameCharacter) {
		super(50, gameCharacter);
	}
	
	public void execute(Enemy enemy) {
		sender.send(enemy.getIP(), "Fireball Attack to " + enemy.getIP());
	}
}
