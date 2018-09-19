package tcp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

//客户端---多线程--接收照片
public class ImageClient {

	public static void main(String[] args) throws IOException {
		
		Socket socket=new Socket(InetAddress.getLocalHost(), 9090);
		
		File file=new File("C:\\Users\\hasee\\Desktop\\2.jpg");
		
		InputStream inputStream=socket.getInputStream();
		
		FileOutputStream fileOutputStream=new FileOutputStream(file);
		
		int length=0;
		
		byte[] buf=new byte[1024];
		
		while((length=inputStream.read(buf))!=-1) {
			
			fileOutputStream.write(buf,0,length);
		}
		fileOutputStream.close();
		socket.close();
	}
}
