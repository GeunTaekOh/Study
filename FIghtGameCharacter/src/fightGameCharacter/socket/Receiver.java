package fightGameCharacter.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import fightGameCharacter.character.GameCharacter;

public class Receiver extends Thread{

	private static final int port = 5555;

	private InputStream is;
	private ObjectInputStream ois;
	private GameCharacter realCharacter;
	
	public void setCharacter(GameCharacter realCharacter){
		this.realCharacter = realCharacter;
	}
	
	public void run(){
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(port);
	        InetAddress iAddress = InetAddress.getLocalHost();
	        String server_IP = iAddress.getHostAddress();
	        System.out.println("Server IP address : " +server_IP);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

        while (true) {
            Socket socket;
            String receiveData = "";
			try {
				socket = serverSocket.accept();

	            OutputStream os = socket.getOutputStream();
	            InputStreamReader isr = new InputStreamReader(socket.getInputStream());

				is = socket.getInputStream();
				ois = new ObjectInputStream(is);
				receiveData = (String)ois.readObject();
				realCharacter.defense(receiveData);
				
			} catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
			}
        }
	}
	
	
}
