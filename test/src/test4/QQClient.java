package test4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

//1.ʹ��TCP��ģ��һ��QQ����Ϣ�������ܣ��ͻ��ˣ������
public class QQClient {

	public static void main(String[] args) throws IOException {

		Socket socket = new Socket(InetAddress.getLocalHost(), 9090);

		OutputStreamWriter socketOutput = new OutputStreamWriter(socket.getOutputStream());

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedReader socketRead = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		String line = null;
		
		System.out.println("�����뷢�͸�����˵���Ϣ:");
		
		while ((line = bufferedReader.readLine()) != null) {			
			System.out.println("�����뷢�͸�����˵���Ϣ:");
			socketOutput.write(line + "\r\n");

			socketOutput.flush();

			line = socketRead.readLine();

			System.out.println("�ͻ��˽��յ���Ϣ��:" + line);

		}
		socket.close();
	}
}
