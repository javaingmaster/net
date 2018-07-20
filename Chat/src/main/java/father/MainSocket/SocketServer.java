package father.MainSocket;

public class SocketServer{














	/*private ServerSocket ss;

	@Override
	public void run() {


	while(true){
			System.out.println("wait connect...");
			try {
				Socket socket = ss.accept();
				System.out.println("host: "+socket.getRemoteSocketAddress()+" login");
				InputStreamReader in=new InputStreamReader(socket.getInputStream(),"UTF-8");
				char[] line=new char[100];
				while (in.read(line)!=-1){
					System.out.println("remote says: "+line);
				}
				OutputStreamWriter out=new OutputStreamWriter(socket.getOutputStream(),"UTF-8");
				out.write("i know");

				out.close();
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	public SocketServer(int port){
		try {
			this.ss=new ServerSocket(port);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
*/
}
