package tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

/*ʵ�ֵ�½��ע�� ���ܡ�  
	�ͻ������������ӵ�ʱ�򣬾�Ҫ��ʾ�ͻ�����ѡ���ܡ�
	
	�ͻ���ע���ʱ���û��������붼�Ƿ��͸������ �ģ��������Ҫ�����ݱ��浽����˵��ļ��ϡ�
	
	��½�� ��½��ʱ��ͻ��������û��������뷢�͸�����ˣ��������ҪУ�飬���ؽ�����ͻ��ˡ�
*/

public class LoginClient {
	static Socket socket;
	
	static BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		
		socket=new Socket(InetAddress.getLocalHost(), 9090);
		
		BufferedReader socketRead=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		OutputStreamWriter socketWrite=new OutputStreamWriter(socket.getOutputStream());
		
		while (true) {
			System.out.println("��ѡ���ܣ�   (A)ע��        (B)��¼          (Q)ע��      ");
		
			String option = bufferedReader.readLine();
			socketWrite.write(option+"\r\n");
			socketWrite.flush();
			if ("a".equalsIgnoreCase(option)) {
			
				getInfo(option,socketWrite);
				
				String reply= socketRead.readLine();
				
				System.out.println(reply);
			} else if ("b".equalsIgnoreCase(option)) {
				
					getInfo(option, socketWrite);

					String reply = socketRead.readLine();

					System.out.println(reply);
					
			} else if ("q".equalsIgnoreCase(option)) {
				System.exit(0);
			
			} else {
				System.out.println(socketRead.readLine());
			}
		}
		
	}

	public static void getInfo(String option,OutputStreamWriter socketWrite) throws IOException {

		System.out.println("�������ʺ�:");
		
		String acounts = bufferedReader.readLine();
		
		System.out.println("����������:");
		
		String password = bufferedReader.readLine();
		
		String user=option+" "+acounts+" "+password;
		
		socketWrite.write(user+"\r\n");
		
		socketWrite.flush();
	}
}
