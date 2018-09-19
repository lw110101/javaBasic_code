package tcp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;

/*ʵ�ֵ�½��ע�� ���ܡ�  
	�ͻ������������ӵ�ʱ�򣬾�Ҫ��ʾ�ͻ�����ѡ���ܡ�
	
	�ͻ���ע���ʱ���û��������붼�Ƿ��͸������ �ģ��������Ҫ�����ݱ��浽����˵��ļ��ϡ�
	
	��½�� ��½��ʱ��ͻ��������û��������뷢�͸�����ˣ��������ҪУ�飬���ؽ�����ͻ��ˡ�
*/

public class LoginServer extends Thread{
	Socket socket;
	
	static File file=new File("C:\\Users\\hasee\\Desktop\\server.properties");
	
	public LoginServer(Socket socket) {
		this.socket = socket;
	}

	static {
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void run() {
		while (true) {
			try {

				OutputStreamWriter socketWrite = new OutputStreamWriter(socket.getOutputStream());

				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				String[] user = bufferedReader.readLine().split(" ");
				String option=user[0];
				String acounts = user[1];
				String password = user[2];
				
				if ("a".equals(option)) {
					Properties properties = new Properties();
					properties.load(new FileReader(file));
					if (!properties.containsKey(acounts)) {
						properties.setProperty(acounts, password);
						properties.store(new FileWriter(file), "user");
						socketWrite.write("ע��ɹ�\r\n");
					} else {
						socketWrite.write("���û��Ѵ��ڣ�ע��ʧ��!\r\n");
					}
					socketWrite.flush();
				} else if ("b".equals(option)) {
					Properties properties = new Properties();
						properties.load(new FileReader(file));
					
						if (properties.containsKey(acounts)) {
							if (properties.getProperty(acounts).equals(password)) {
								socketWrite.write("��ӭ" + acounts + "��¼�ɹ�!\r\n");
							} else {
								socketWrite.write("�������!����������!\r\n");
							}
						} else {
							socketWrite.write("���û������ڣ�����������!\r\n");
						}
					socketWrite.flush();
				} else if ("q".equals(option)) {
					System.exit(0);
				} else {
					socketWrite.write("ѡ������������ѡ��!\r\n");
					socketWrite.flush();
				}
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ServerSocket serverSocket = new ServerSocket(9090);
		boolean flag=true;
		
		while(flag) {
			Socket socket = serverSocket.accept();
			new LoginServer(socket).start();
		}
		serverSocket.close();
		
	}
}
