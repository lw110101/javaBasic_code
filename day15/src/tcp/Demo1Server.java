package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo1Server {
//�����
	public static void main(String[] args) throws IOException {
		//��������˷���
		ServerSocket server=new ServerSocket(9090);
		//ʹ��accept�������տͻ��˵����Ӳ���һ��Socket
		Socket socket=server.accept();
		//��ȡ��Ӧ����д����
		InputStream inputStream=socket.getInputStream();
		//������
		byte[] buf=new byte[1024];
		int length=inputStream.read(buf);
		
		System.out.println("����˽��յ�������:"+new String(buf,0,length));
		//д����
		OutputStream outputStream=socket.getOutputStream();
		outputStream.write("�ͻ��ˣ����!".getBytes());
		//�ر���Դ
		server.close();
		
	}
}
