package tcp;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

//模拟Tomcat服务器
public class TomCatDemo extends Thread{

	Socket socket;
	
	
	public TomCatDemo(Socket socket) {
		
		this.socket = socket;
	}
	
	public void run() {
		
		try {
			OutputStreamWriter outputStreamWriter=new OutputStreamWriter(socket.getOutputStream());
			
			outputStreamWriter.write("<html><head><title>my first</title></head><body>南昌大学人民武装学院15计本刘伟</body></html>");
		
			socket.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}	
	}
	public static void main(String[] args) throws IOException {
		
		ServerSocket serverSocket=new ServerSocket(9090);

		boolean flag = true;

		while (flag) {

			Socket socket = serverSocket.accept();

			new TomCatDemo(socket).start();
		}
		serverSocket.close();
	}
}
