package tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

public class ChatClient {
//�ͻ���
	public static void main(String[] args) throws IOException {
		//�����ͻ��˷���
		Socket socket=new Socket(InetAddress.getLocalHost(),9090);
		//��ȡ����ַ���
		OutputStreamWriter socketOutput=new OutputStreamWriter(socket.getOutputStream());
		//��ȡ�����ַ���
		BufferedReader socketRead=new BufferedReader( new InputStreamReader(socket.getInputStream()));
		//���̼���һ������
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		
		String line=null;
		
		System.out.println("�����뷢�͸�����˵�����:");
		while((line=bufferedReader.readLine())!=null) {
			//д����
			socketOutput.write(line+"\r\n");
			//ˢ������
			socketOutput.flush();
			//������
			line=socketRead.readLine();
			
			System.out.println("����˻��͵�������:"+line);
			
			System.out.println("�����뷢�͸�����˵�����:");
		}
		socket.close();
		
	}
}
