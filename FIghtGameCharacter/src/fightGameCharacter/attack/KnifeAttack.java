package fightGameCharacter.attack;

import fightGameCharacter.character.Enemy;
import fightGameCharacter.character.GameCharacter;

public class KnifeAttack extends SingleAttack {


	
	public KnifeAttack(GameCharacter gameCharacter) {
		super(10, gameCharacter);
		//AttackData attackData = new AttackData();
		
	}
	
	public void execute(Enemy enemy) {
		sender.send(enemy.getIP(), "Knife Attack to " + enemy.getIP());
	}
}
