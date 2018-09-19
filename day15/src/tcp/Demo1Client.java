package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Demo1Client {
//客户端
	public static void main(String[] args) throws IOException {
		//建立客户端服务
		Socket socket=new Socket(InetAddress.getLocalHost(),9090);
		//获取对应流，读写数据
		//写数据
		OutputStream outputStream=socket.getOutputStream();
		
		outputStream.write("服务端，你好!".getBytes());
		//读数据
		InputStream inputStream=socket.getInputStream();
		
		byte[] buf=new byte[1024];
		int length=inputStream.read(buf);
		
		System.out.println("客户端接收的数据是:"+new String(buf,0,length));
		//关闭资源
		socket.close();
	}
}
