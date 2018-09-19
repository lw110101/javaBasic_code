package ip;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		//获取本机IP
		InetAddress inetAddress= InetAddress.getLocalHost();
		String ip=inetAddress.getHostAddress();
		System.out.println("本机的IP地址是:"+ip);
		String pcName=inetAddress.getHostName();
		System.out.println("本机的机名是:"+pcName);
		
		//获取别人的IP对象
		InetAddress inetAddress1= InetAddress.getByName("101.191.97.154");
		System.out.println("IP地址是:"+inetAddress1.getHostAddress());
		System.out.println("机名是:"+inetAddress1.getHostName());
		
		InetAddress[]  arr = InetAddress.getAllByName("www.baidu.com");//域名
		System.out.println(Arrays.toString(arr));
	}
}
