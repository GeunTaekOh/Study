package fightGameCharacter.attack;



import fightGameCharacter.character.Enemy;
import fightGameCharacter.character.GameCharacter;
import fightGameCharacter.socket.*;

public abstract class Attack {
	
	protected int attackStrength;
	protected int attackSpeed;

	protected int characterAttackStrength;
	protected int characterAttackSpeed;
	protected Sender sender = new Sender();

	
	public Attack(int attackStrength, int attackSpeed, GameCharacter gameCharacter) {
		this.attackStrength = attackStrength;
		this.attackSpeed = attackSpeed;
		
		
		setCharacterAttackStrength(gameCharacter);
		setCharacterAttackSpeed(gameCharacter);
	}
	
	public abstract void execute(Enemy enemy);
	
	private void setCharacterAttackStrength(GameCharacter gameCharacter) {
		this.characterAttackStrength = gameCharacter.getTotalAttackStrength();
	}
	
	private void setCharacterAttackSpeed(GameCharacter gameCharacter) {
		this.characterAttackSpeed = gameCharacter.getTotalAttackSpeed();
	}

}
