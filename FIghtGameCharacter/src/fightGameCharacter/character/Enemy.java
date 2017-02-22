package fightGameCharacter.character;

public class Enemy {

	private String ip ;
	private String name;
	
	public Enemy(String name, String ip) {
		this.name = name;
		this.ip = ip;
	}
	
	
	public String getIP() { return ip; }
}
