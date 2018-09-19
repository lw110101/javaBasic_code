package tcp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;


public class ImageServer extends Thread{
	
	static File file=new File("C:\\Users\\hasee\\Desktop\\1.jpg");
	
	static HashSet<String> ips=new HashSet<String>();
	
	Socket socket;
	
	public ImageServer(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		
		try {
			FileInputStream fileInputStream=new FileInputStream(file);
			
			OutputStream outputStream=socket.getOutputStream();
			
			int length=0;
			
			byte[] buf=new byte[1024];
			
			while((length=fileInputStream.read(buf))!=-1) {
				
				outputStream.write(buf,0,length);
			}
			String ip=socket.getInetAddress().getHostAddress();//获取ip地址
			
			if(ips.add(ip)) {
				
				System.out.println("恭喜"+ip+"同学下载成功!当前下载人数是:"+ips.size());
			}
			
			fileInputStream.close();
			socket.close();
		
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {

		ServerSocket serverSocket=new ServerSocket(9090);
		boolean flag=true;
		while(flag) {
			
			Socket socket=serverSocket.accept();
			
			new ImageServer(socket).start();
		}
		
		serverSocket.close();

	}
}
