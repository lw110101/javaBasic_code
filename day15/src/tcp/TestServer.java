package tcp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer extends Thread{
	Socket socket;

	public TestServer(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		try {
			ObjectInputStream socketnput = new ObjectInputStream(socket.getInputStream());
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(
					new FileOutputStream("C:Users\\hasee\\Desktop\\b.txt",true));
			User user = (User) socketnput.readObject();
			objectOutputStream.writeObject(user+"\r\n");
			String ip=socket.getInetAddress().getHostAddress();
			System.out.println("ip:"+ip);	
			objectOutputStream.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		ServerSocket serverSocket=new ServerSocket(60000);
		boolean flag=true;
		int count=0;
		while(flag) {
			Socket socket=serverSocket.accept();
			new TestServer(socket).start();
			
			Thread thread=new Thread(new TestServer(socket),(count+1)+"");
			String name=Thread.currentThread().getName();
			String id=thread.getName();
			System.out.println("线程名字是:"+name);
			System.out.println("id="+id);
		}
		serverSocket.close();
	}
}
