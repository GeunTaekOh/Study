package test;


import java.util.ArrayList;
import java.util.List;

import socket.Receiver;
import socket.Sender;

public class Character {
	
	private Glove glove;
	private Armor armor;
	private List<Weapon> knife = new ArrayList<Weapon>();
	
	protected int totalDefense;
	protected int totalAttackSpeed;
	protected int totalAttackStrength;
	
	private Receiver receiver;
	private Sender sender;
	
	private final int LEFT = 0;
	private final int RIGHT = 1;
	
	protected int health = 1000;
	
	public Character(){
		sender = new Sender();
		receiver = new Receiver();
		receiver.start();	
	}
	
	public Character(Glove glove, Armor armor, Weapon leftKnife, Weapon rightKnife) {
		this.glove = glove;
		this.armor = armor;
		this.knife.add(leftKnife);
		this.knife.add(rightKnife);
		
		sender = new Sender();
		receiver = new Receiver();
		receiver.setCharacter(this);
		
		totalDefense = armor.getDefense();
		totalAttackSpeed = knife.get(LEFT).getAttackSpeed() + knife.get(RIGHT).getAttackSpeed() + glove.getAttackSpeed();
		totalAttackStrength = knife.get(LEFT).getAttackStrength() + knife.get(RIGHT).getAttackStrength() + glove.getAttackStrength();
		
		receiver.start();
	}
	
	
	
	
	
	public Glove getGlove() { return glove; }
	public Armor getArmor() { return armor; }
	public Weapon getLeftKnife() { return knife.get(LEFT); }
	public Weapon getRightKnife() { return knife.get(RIGHT); }
	
	public int getTotalDefense() { return totalDefense; }
	public int getTotalAttackSpeed() { return totalAttackSpeed; }
	public int getTotalAttackStrength() { return totalAttackStrength; }
	
	
	public void attack(){
		sender.send("","");
	}
	private String getMessage(){
		return String.valueOf(this.getTotalAttackSpeed()) +":"+ String.valueOf(this.getTotalAttackStrength());
	}
	public void defense (String attackString){
		//System.out.println(attackString);
		String[] data = this.parse(attackString);
		int attackSpeed = Integer.valueOf(data[0]);
		int attackStrength = Integer.valueOf(data[1]);
		
		System.out.println(attackSpeed);
		System.out.println(attackStrength);
	}
	private String[] parse(String attackString){
		return attackString.split(":");
	}
	
	
}
