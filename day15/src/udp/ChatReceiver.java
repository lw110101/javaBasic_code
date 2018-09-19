 package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ChatReceiver extends Thread{

	@Override
	public void run() {
		try {
			//建立udp
			DatagramSocket socket=new DatagramSocket(9999);
			//创建空数据包
			byte[] buf=new byte[1024];
			DatagramPacket packet=new DatagramPacket(buf, buf.length);
			boolean flag=true;
			while(flag) {
				socket.receive(packet);
				System.out.println(packet.getAddress().getHostAddress()+"说:"+new String(buf,0,packet.getLength()));
			}
			socket.close();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
}
