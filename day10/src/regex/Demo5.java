package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//��������
public class Demo5 {

	public static void main(String[] args) {
		
		String str="����Ҫ������ϵ:1570858687@qq.com;����Ҫ������ϵ:1570858687@163.cn;����Ҫ������ϵ:1570858687@sina.com.cn;����Ҫ������ϵ:1570858687@sohu.net;"
				+ "����Ҫ������ϵ:1373832455@qq.com;����Ҫ������ϵ:553699877@qq.cn;����Ҫ������ϵ:17605917572@163.com,cn;����Ҫ������ϵ:553699877@sina.net;";
		String reg="[1-9]\\w{3,31}@[a-zA-Z0-9]{2,}(\\.(com|cn|net)){1,2}";
		Pattern p=Pattern.compile(reg);
		Matcher m=p.matcher(str);
		System.out.println("��ȡ����Ϣ:");
		while(m.find()) {
			System.out.println(m.group());
		}
		
		/*String ip="192.168.1.2";
		String reg="((25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)";
		Pattern p=Pattern.compile(reg);
		Matcher m=p.matcher(ip);
		boolean b=m.matches();
		System.out.println(b);*/
	}
}
