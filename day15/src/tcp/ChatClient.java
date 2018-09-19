package tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

public class ChatClient {
//客户端
	public static void main(String[] args) throws IOException {
		//建立客户端服务
		Socket socket=new Socket(InetAddress.getLocalHost(),9090);
		//获取输出字符流
		OutputStreamWriter socketOutput=new OutputStreamWriter(socket.getOutputStream());
		//获取输入字符流
		BufferedReader socketRead=new BufferedReader( new InputStreamReader(socket.getInputStream()));
		//键盘键入一行数据
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		
		String line=null;
		
		System.out.println("请输入发送给服务端的数据:");
		while((line=bufferedReader.readLine())!=null) {
			//写数据
			socketOutput.write(line+"\r\n");
			//刷新数据
			socketOutput.flush();
			//读数据
			line=socketRead.readLine();
			
			System.out.println("服务端回送的数据是:"+line);
			
			System.out.println("请输入发送给服务端的数据:");
		}
		socket.close();
		
	}
}
