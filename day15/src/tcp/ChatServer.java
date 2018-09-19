package tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
//�����
	public static void main(String[] args) throws IOException {
		//��������˷���
		ServerSocket serverSocket=new ServerSocket(9090);
		//��������
		Socket socket=serverSocket.accept();
		//��ȡ����������
		BufferedReader socketRead=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		//��ȡ���������
		OutputStreamWriter socketWrite=new OutputStreamWriter(socket.getOutputStream());
		//���̼�������
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		//��ȡ����
		String line=null;
		
		while((line=socketRead.readLine())!=null) {
			
			System.out.println("����˽��յ�������:"+line);
			
			System.out.println("��������͸��ͻ���������:");
			
			line=bufferedReader.readLine();
			
			socketWrite.write(line+"\r\n");
			 
			socketWrite.flush();
		}
		serverSocket.close();
	
	}
}
