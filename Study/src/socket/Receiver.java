package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Receiver extends Thread{

	private static final int port = 5555;

	private InputStream is;
	private ObjectInputStream ois;
	private test.Character character;
	
	public void setCharacter(test.Character character){
		this.character = character;
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
				System.out.println(""+receiveData);
				character.defense(receiveData);
				
			} catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
			}
        }
	}
	
}
