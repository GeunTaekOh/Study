package fightGameCharacter.attack;

import fightGameCharacter.character.Enemy;
import fightGameCharacter.character.GameCharacter;

public class FireBallAttack extends MultipleAttack{

	AttackHandler attackHandler;
	
	public FireBallAttack(GameCharacter gameCharacter) {
		super(50, 20, gameCharacter);
		
		attackHandler = new AttackHandler(this.attackStrength,this.attackSpeed,"Fireball Attack to ");
		
		
	}
	
	public void execute(Enemy enemy) {
		sender.send(enemy.getIP(),attackHandler);
		//sender.send(enemy.getIP(), "Fireball Attack to " + enemy.getIP(), new AttackHandler(this.attackStrength,this.attackSpeed));
	}
}
