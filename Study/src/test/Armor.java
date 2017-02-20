package test;


public abstract class Armor {
	
	protected int defense;
	
	public Armor(int defense) {
		this.defense = defense ;
	}
	
	public int getDefense() { return defense; }
}