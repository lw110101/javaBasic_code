package test4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class QQServer extends Thread{
	
	Socket socket;
	
	public QQServer(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		
		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			
			BufferedReader severRead = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			OutputStreamWriter serverWriter = new OutputStreamWriter(socket.getOutputStream());
			
			String line = null;
			
			while ((line = severRead.readLine()) != null) {
			
				System.out.println("请输入发送给客户端的消息:");
				
				line = bufferedReader.readLine();

				serverWriter.write(line+"\r\n");
				
				serverWriter.flush();
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		
		ServerSocket serverSocket = new ServerSocket(9090);

		boolean flag=true;
		while(flag) {
			
			Socket socket = serverSocket.accept();
			
			new QQServer(socket).start();
		}
		
		serverSocket.close();
	}
}
