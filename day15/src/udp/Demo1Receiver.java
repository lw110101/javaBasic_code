package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Demo1Receiver {
	// 接收端

	public static void main(String[] args) throws IOException {

		// 建立udp服务
		DatagramSocket datagramsocket = new DatagramSocket(9999);
		// 建立空数据包接收数据
		byte[] buf = new byte[1024];
		DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);
		// 调用udp服务
		datagramsocket.receive(datagramPacket);
		System.out.println("接收到的数据是:" + new String(buf, 0, datagramPacket.getLength()));
		// 关闭资源
		datagramsocket.close();
	}
}
