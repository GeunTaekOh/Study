package fightGameCharacter.character;

import fightGameCharacter.item.Armor;
import fightGameCharacter.item.Glove;
import fightGameCharacter.item.Weapon;
import fightGameCharacter.item.MeshArmor;
import fightGameCharacter.item.MeshGlove;
import fightGameCharacter.item.ShortKnife;
import fightGameCharacter.item.IronLance;

public class CharacterFactory extends AbstractCharacterFactory{
	public Glove createGlove () { return new MeshGlove(); }
	public Armor createArmor() { return new MeshArmor(); }
	public Weapon createLeftWeapon() { return new IronLance(); }
	public Weapon createRightWeapon() { return new IronLance();}
}