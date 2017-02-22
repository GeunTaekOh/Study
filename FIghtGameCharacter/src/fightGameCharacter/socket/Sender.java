package fightGameCharacter.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Sender {

	private ServerSocket server = null;
	private Socket client = null;
	private static final int port = 5555;
	
	private InputStream is;
	private ObjectInputStream ois;
	
	private OutputStream os;
	private ObjectOutputStream oos;
	
	private Socket socket = null;
	   
	public void send(String ipAddress, String data){
		try {
			socket = new Socket(ipAddress, port);
			os = socket.getOutputStream();
			oos = new ObjectOutputStream(os);
			oos.writeObject(data);
            oos.flush();
            
            os.close();
            oos.close();
            socket.close();
            
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}