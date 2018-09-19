package tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

/*实现登陆与注册 功能。  
	客户端与服务端连接的时候，就要提示客户端请选择功能。
	
	客户端注册的时候，用户名与密码都是发送给服务端 的，服务端需要把数据保存到服务端的文件上。
	
	登陆： 登陆的时候客户端输入用户名与密码发送给服务端，服务端需要校验，返回结果给客户端。
*/

public class LoginClient {
	static Socket socket;
	
	static BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		
		socket=new Socket(InetAddress.getLocalHost(), 9090);
		
		BufferedReader socketRead=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		OutputStreamWriter socketWrite=new OutputStreamWriter(socket.getOutputStream());
		
		while (true) {
			System.out.println("请选择功能：   (A)注册        (B)登录          (Q)注销      ");
		
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

		System.out.println("请输入帐号:");
		
		String acounts = bufferedReader.readLine();
		
		System.out.println("请输入密码:");
		
		String password = bufferedReader.readLine();
		
		String user=option+" "+acounts+" "+password;
		
		socketWrite.write(user+"\r\n");
		
		socketWrite.flush();
	}
}
