package father.MainSocket;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ClientSocket {
















/*	private String serverName;
	private int port;
	private Socket client;

	public ClientSocket(String name,int port){
		this.serverName=name;
		this.port=port;
		try {
			this.client=new Socket(this.serverName,this.port);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void send(String message){
		try {
			client.getOutputStream().write(message.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void receive(){
		try {
			byte[] input=new byte[1024];
			InputStream in=client.getInputStream();
			while(in.read(input)!=-1){
				System.out.println("receive: "+input.toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}*/
}
