package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Demo1Client {
//�ͻ���
	public static void main(String[] args) throws IOException {
		//�����ͻ��˷���
		Socket socket=new Socket(InetAddress.getLocalHost(),9090);
		//��ȡ��Ӧ������д����
		//д����
		OutputStream outputStream=socket.getOutputStream();
		
		outputStream.write("����ˣ����!".getBytes());
		//������
		InputStream inputStream=socket.getInputStream();
		
		byte[] buf=new byte[1024];
		int length=inputStream.read(buf);
		
		System.out.println("�ͻ��˽��յ�������:"+new String(buf,0,length));
		//�ر���Դ
		socket.close();
	}
}
