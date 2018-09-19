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

/*实现登陆与注册 功能。  
	客户端与服务端连接的时候，就要提示客户端请选择功能。
	
	客户端注册的时候，用户名与密码都是发送给服务端 的，服务端需要把数据保存到服务端的文件上。
	
	登陆： 登陆的时候客户端输入用户名与密码发送给服务端，服务端需要校验，返回结果给客户端。
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
						socketWrite.write("注册成功\r\n");
					} else {
						socketWrite.write("该用户已存在，注册失败!\r\n");
					}
					socketWrite.flush();
				} else if ("b".equals(option)) {
					Properties properties = new Properties();
						properties.load(new FileReader(file));
					
						if (properties.containsKey(acounts)) {
							if (properties.getProperty(acounts).equals(password)) {
								socketWrite.write("欢迎" + acounts + "登录成功!\r\n");
							} else {
								socketWrite.write("密码错误!请重新输入!\r\n");
							}
						} else {
							socketWrite.write("该用户不存在，请重新输入!\r\n");
						}
					socketWrite.flush();
				} else if ("q".equals(option)) {
					System.exit(0);
				} else {
					socketWrite.write("选择有误，请重新选择!\r\n");
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
