package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo1Server {
//服务端
	public static void main(String[] args) throws IOException {
		//建立服务端服务
		ServerSocket server=new ServerSocket(9090);
		//使用accept方法接收客户端的连接产生一个Socket
		Socket socket=server.accept();
		//获取对应流读写数据
		InputStream inputStream=socket.getInputStream();
		//读数据
		byte[] buf=new byte[1024];
		int length=inputStream.read(buf);
		
		System.out.println("服务端接收的数据是:"+new String(buf,0,length));
		//写数据
		OutputStream outputStream=socket.getOutputStream();
		outputStream.write("客户端，你好!".getBytes());
		//关闭资源
		server.close();
		
	}
}
