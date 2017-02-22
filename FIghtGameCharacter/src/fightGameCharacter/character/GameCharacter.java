package fightGameCharacter.character;

import java.util.ArrayList;
import java.util.List;

import fightGameCharacter.attack.AttackRegistry;
import fightGameCharacter.item.Armor;
import fightGameCharacter.item.Glove;
import fightGameCharacter.item.Weapon;
import fightGameCharacter.socket.Receiver;
import fightGameCharacter.socket.Sender;
import fightGameCharacter.util.KeyListener;
import fightGameCharacter.util.Observer;



public class GameCharacter implements Observer{
	
	private volatile static GameCharacter character = null;
	
	private Enemy enemy;
	
	private Glove glove;
	private Armor armor;
	private List<Weapon> weapon = new ArrayList<Weapon>();
	
	protected int totalDefense;
	protected int totalAttackSpeed;
	protected int totalAttackStrength;
	
	private final int LEFT = 0;
	private final int RIGHT = 1;
	
	private Receiver receiver;
	private Sender sender;
	private KeyListener listener = new KeyListener();
	protected int health = 1000;
	
	public static synchronized GameCharacter createGameCharacter(Glove glove, Armor armor, Weapon leftWeapon, Weapon rightWeapon) {
		if(character==null){
			setItems(glove, armor, leftWeapon, rightWeapon);
			calculateStat(glove, armor);
			runReceiver();
			character.listener.registerObserver(character);
			character.listener.start();
		}
		return character;
		
	}

	public void setEnemy(Enemy enemy){
		this.enemy = enemy;
	}
	private static void runReceiver() {
		character.receiver = new Receiver();		
		character.receiver.setCharacter(character);
		character.receiver.start();
	}

	private static void calculateStat(Glove glove, Armor armor) {
		character.totalDefense = armor.getDefense();
		character.totalAttackSpeed = character.weapon.get(character.LEFT).getAttackSpeed() + character.weapon.get(character.RIGHT).getAttackSpeed() + glove.getAttackSpeed();
		character.totalAttackStrength = character.weapon.get(character.LEFT).getAttackStrength() + character.weapon.get(character.RIGHT).getAttackStrength() + glove.getAttackStrength();
	}

	private static void setItems(Glove glove, Armor armor, Weapon leftWeapon,
			Weapon rightWeapon) {
		character = new GameCharacter();
		character.glove = glove;
		character.armor = armor;
		character.weapon.add(leftWeapon);
		character.weapon.add(rightWeapon);
	}
	
	public int getTotalDefense() { return totalDefense; }
	public int getTotalAttackSpeed() { return totalAttackSpeed; }
	public int getTotalAttackStrength() { return totalAttackStrength; }
	
	public Enemy getEnemy() { return enemy; }
	
	
	public void attack(int type) {
		this.weapon.get(0).attack(this.enemy, AttackRegistry.getAttack(type));
	}
	
	public void defense(String attackString) {
		
		System.out.println(attackString);

	}
	
	private String getMessage() {
		return String.valueOf(this.getTotalAttackSpeed()) + ":" + String.valueOf(this.getTotalAttackStrength());
	}
	
	private String[] parse(String attackString) {
		return attackString.split(":");
	}

	@Override
	public void setActionType(int type) {
		this.attack(type);
	}
}