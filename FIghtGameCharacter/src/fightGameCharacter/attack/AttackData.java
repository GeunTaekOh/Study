package fightGameCharacter.attack;

import java.io.Serializable;
import java.util.Date;

public class AttackData implements Serializable{
	
	public int attackPower;
	public int attackSpeed;
	public long currentTime;
	
	
	public AttackData(int power, int speed){
		this.attackPower = power;
		this.attackSpeed = speed;
		
		getCurrentTime();
		
		
		
	}
	
	private void getCurrentTime(){
		new Date();
		this.currentTime = System.currentTimeMillis();
	}
	
	

}
