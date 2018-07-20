package father;


import father.MainSocket.ClientSocket;
import father.MainSocket.SocketServer;
import father.serviceSocket.HandlerSocket;

import javax.xml.bind.SchemaOutputResolver;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MainChat {
	public static void main(String[] args) {

		System.out.println("Mainchat!");


	/*	SocketServer socketServer = new SocketServer(1234);
		Thread server=new Thread(socketServer);
		server.start();

		ClientSocket client=new ClientSocket("127.0.0.1",1234);
		client.send("hi server!");
		client.receive();*/

		//try {
//			//serverSocket.setSoTimeout(10000000);

			//while (true){
			//	Socket socket = serverSocket.accept();
			//	Thread t =new HandlerSocket(socket);

		//	}

		/*} catch (IOException e) {
			e.printStackTrace();
		}*/


	}
}
