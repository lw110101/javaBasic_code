package tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
//服务端
	public static void main(String[] args) throws IOException {
		//建立服务端服务
		ServerSocket serverSocket=new ServerSocket(9090);
		//接收连接
		Socket socket=serverSocket.accept();
		//获取输入流对象
		BufferedReader socketRead=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		//获取输出流对象
		OutputStreamWriter socketWrite=new OutputStreamWriter(socket.getOutputStream());
		//键盘键入数据
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		//读取数据
		String line=null;
		
		while((line=socketRead.readLine())!=null) {
			
			System.out.println("服务端接收的数据是:"+line);
			
			System.out.println("请输入回送给客户端是数据:");
			
			line=bufferedReader.readLine();
			
			socketWrite.write(line+"\r\n");
			 
			socketWrite.flush();
		}
		serverSocket.close();
	
	}
}
