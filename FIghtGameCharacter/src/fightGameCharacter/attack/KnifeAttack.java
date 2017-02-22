package fightGameCharacter.attack;

import fightGameCharacter.character.Enemy;
import fightGameCharacter.character.GameCharacter;

public class KnifeAttack extends SingleAttack {

	AttackHandler attackHandler;
	
	public KnifeAttack(GameCharacter gameCharacter) {
		super(10, 10,  gameCharacter);
		attackHandler = new AttackHandler(this.attackStrength,this.attackSpeed,"Knife Attack to ");
		
		
	}
	
	public void execute(Enemy enemy) {
		sender.send(enemy.getIP(), attackHandler);
	}
}
