package udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SafeSender {

	public static void main(String[] args) throws IOException {
		
		DatagramSocket socket = new DatagramSocket();

		BufferedReader keyReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("ÇëÊäÈëÄÚÈİ:");
		
		String readLine=keyReader.readLine();
		for (int i = 0; i < 10; i++) {
			
			String line=i+readLine;
			DatagramPacket packet = new DatagramPacket(line.getBytes(), line.getBytes().length,
					InetAddress.getLocalHost(), 9090);

			socket.send(packet);
		}
		socket.close();
	}
}
