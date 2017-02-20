package test;

public class Enemy extends CharacterFactory{

	@Override
	public Glove createGlove() {
		// TODO Auto-generated method stub
		return new IronGlove();
	}

	@Override
	public Armor createArmor() {
		// TODO Auto-generated method stub
		return new IronArmor();
	}

	@Override
	public Weapon createLeftKnife() {
		// TODO Auto-generated method stub
		return new BigAxe();
	}

	@Override
	public Weapon createRightKnife() {
		// TODO Auto-generated method stub
		return new BigAxe();
	}

}
