package udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ChatSender extends Thread{

	public void run() {
	//建立udp
		try {
			DatagramSocket datagramSocket=new DatagramSocket();
			//准备数据
			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

			String line=null;
			// 创建数据包
			DatagramPacket packet = null;
			while ((line = bufferedReader.readLine()) != null) {
				packet = new DatagramPacket(line.getBytes(), line.getBytes().length,
						InetAddress.getByName("100.71.29.190"), 9999);
				datagramSocket.send(packet);
			}
			datagramSocket.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
