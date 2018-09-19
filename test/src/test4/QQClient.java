package test4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

//1.使用TCP，模拟一下QQ的信息交流功能，客户端，服务端
public class QQClient {

	public static void main(String[] args) throws IOException {

		Socket socket = new Socket(InetAddress.getLocalHost(), 9090);

		OutputStreamWriter socketOutput = new OutputStreamWriter(socket.getOutputStream());

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedReader socketRead = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		String line = null;
		
		System.out.println("请输入发送给服务端的消息:");
		
		while ((line = bufferedReader.readLine()) != null) {			
			System.out.println("请输入发送给服务端的消息:");
			socketOutput.write(line + "\r\n");

			socketOutput.flush();

			line = socketRead.readLine();

			System.out.println("客户端接收的消息是:" + line);

		}
		socket.close();
	}
}
