package fightGameCharacter.attack;

import java.io.Serializable;
import java.util.Date;
import java.util.Hashtable;

import fightGameCharacter.util.KeyListener;
import fightGameCharacter.util.Observer;

public class AttackHandler extends Thread implements Serializable, Observer{
	
	public int attackPower;
	public int attackSpeed;
	public long currentTime;
	public Boolean attack_result=false; 
	private int defenseCode;
	private volatile static AttackHandler attackHandler=null;
	
	public String attackMsg;

	public AttackHandler(int power, int speed, String msg){
		this.attackPower = power;
		this.attackSpeed = speed;
		this.attackMsg=msg;
	
		defenseCode = 56;			//숫자키8
		
		this.start();
	}
	
	public synchronized void run(){
		setCurrentTime();
		
		while(!Thread.currentThread().isInterrupted()){
			try {
				Thread.sleep(1000);
				if(System.currentTimeMillis() - this.currentTime >= this.attackSpeed*20){
					attack_result = true;
					this.interrupt();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				return;
			}		
		}
	}
	
	private void setCurrentTime(){
		this.currentTime = System.currentTimeMillis();
	}
	
	public Boolean getIsAttackResult(){
		return attack_result;
	}
	public int getPower(){
		return this.attackPower;
	}
	public int getSpeed(){
		return this.attackSpeed;
	}
	public long getCurrentTime(){
		return this.currentTime;
	}

	public boolean isAttacked(){
		return this.attack_result;
	}
	
	@Override
	public void setActionType(int type) {
		if(type==defenseCode){
			attack_result = false;
			this.interrupt();
		}else{
			System.out.println("defense fail");
		}	
	}
}
