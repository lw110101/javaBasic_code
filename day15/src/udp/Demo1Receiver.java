package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Demo1Receiver {
	// ���ն�

	public static void main(String[] args) throws IOException {

		// ����udp����
		DatagramSocket datagramsocket = new DatagramSocket(9999);
		// ���������ݰ���������
		byte[] buf = new byte[1024];
		DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);
		// ����udp����
		datagramsocket.receive(datagramPacket);
		System.out.println("���յ���������:" + new String(buf, 0, datagramPacket.getLength()));
		// �ر���Դ
		datagramsocket.close();
	}
}
