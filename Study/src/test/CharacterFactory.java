package test;


public abstract class CharacterFactory {
	
	public Character createCharacter() {
		
		Glove glove = this.createGlove();
		Armor armor = this.createArmor();
		Weapon leftKnife = this.createLeftKnife();
		Weapon rightKnife = this.createRightKnife();
		
		Character realCharacter= new Character(glove, armor, leftKnife, rightKnife);
		
		return realCharacter ;
	}
	
	public abstract Glove createGlove();
	public abstract Armor createArmor();
	public abstract Weapon createLeftKnife();
	public abstract Weapon createRightKnife();
	
}