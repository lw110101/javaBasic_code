package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class SafeReceiver {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		DatagramSocket socket=new DatagramSocket(9090);
		
		byte[] buf=new byte[1024];
		DatagramPacket packet=new DatagramPacket(buf, buf.length);
		boolean flag=true;
		while(flag) {
			socket.receive(packet);
			System.out.println(new String(buf,0,packet.getLength()));
			Thread.sleep(10);
		}
		socket.close();
	}
}
