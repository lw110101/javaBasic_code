package ip;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		//��ȡ����IP
		InetAddress inetAddress= InetAddress.getLocalHost();
		String ip=inetAddress.getHostAddress();
		System.out.println("������IP��ַ��:"+ip);
		String pcName=inetAddress.getHostName();
		System.out.println("�����Ļ�����:"+pcName);
		
		//��ȡ���˵�IP����
		InetAddress inetAddress1= InetAddress.getByName("101.191.97.154");
		System.out.println("IP��ַ��:"+inetAddress1.getHostAddress());
		System.out.println("������:"+inetAddress1.getHostName());
		
		InetAddress[]  arr = InetAddress.getAllByName("www.baidu.com");//����
		System.out.println(Arrays.toString(arr));
	}
}
