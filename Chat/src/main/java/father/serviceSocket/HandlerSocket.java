package father.serviceSocket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class HandlerSocket extends Thread{

	private Socket s;

	public HandlerSocket(Socket s){
		this.s=s;
	}

	@Override
	public void run() {
		try {
			System.out.println("hello! "+s.getRemoteSocketAddress());

			InputStream input=s.getInputStream();
			OutputStream output=s.getOutputStream();

			InputStreamReader in=new InputStreamReader(input);
			OutputStreamWriter out=new OutputStreamWriter(output);

			out.write("hello! i am server");


			char[] receivemessage=new char[100];
			while(in.read(receivemessage)!=-1){
				out.write("server: ");
				out.write(receivemessage);
			}

			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
