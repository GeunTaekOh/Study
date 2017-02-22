package fightGameCharacter.attack;

import java.util.Hashtable;

public class AttackRegistry {
	private static Hashtable<Integer, Attack> registry = new Hashtable<Integer, Attack>();
	
	public static void registerAttack(int type, Attack attack){
		registry.put(type, attack);
	}
	
	public static Attack getAttack(int type){
		return registry.get(type);
	}
}
