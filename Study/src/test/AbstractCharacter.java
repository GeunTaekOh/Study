package test;


public class AbstractCharacter extends CharacterFactory{

	public Glove createGlove () {
		
		return new MeshGlove();
	}

	public Armor createArmor() {
		
		return new MeshArmor();
	}

	public Weapon createLeftKnife() {
		
		return new LongKnife();
	}
	
	public Weapon createRightKnife() {
		return new LongKnife();
	}
}
