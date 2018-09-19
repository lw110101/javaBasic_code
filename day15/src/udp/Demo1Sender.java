package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Demo1Sender {
	//发送端
	
	public static void main(String[] args) throws IOException {

		String str = "南昌大学人民武装学院";
		// 建立udp服务
		DatagramSocket datagramSocket = new DatagramSocket();
		// 准备数据，创建数据包，封装到数据包中
		byte[] buf = str.getBytes();
		DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length, InetAddress.getLocalHost(),
				9999);
		// 发送数据
		datagramSocket.send(datagramPacket);
		// 关闭资源
		datagramSocket.close();
	}
}
