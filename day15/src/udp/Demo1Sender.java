package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Demo1Sender {
	//���Ͷ�
	
	public static void main(String[] args) throws IOException {

		String str = "�ϲ���ѧ������װѧԺ";
		// ����udp����
		DatagramSocket datagramSocket = new DatagramSocket();
		// ׼�����ݣ��������ݰ�����װ�����ݰ���
		byte[] buf = str.getBytes();
		DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length, InetAddress.getLocalHost(),
				9999);
		// ��������
		datagramSocket.send(datagramPacket);
		// �ر���Դ
		datagramSocket.close();
	}
}
