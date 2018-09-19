package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//网络爬虫
public class Demo5 {

	public static void main(String[] args) {
		
		String str="有需要的请联系:1570858687@qq.com;有需要的请联系:1570858687@163.cn;有需要的请联系:1570858687@sina.com.cn;有需要的请联系:1570858687@sohu.net;"
				+ "有需要的请联系:1373832455@qq.com;有需要的请联系:553699877@qq.cn;有需要的请联系:17605917572@163.com,cn;有需要的请联系:553699877@sina.net;";
		String reg="[1-9]\\w{3,31}@[a-zA-Z0-9]{2,}(\\.(com|cn|net)){1,2}";
		Pattern p=Pattern.compile(reg);
		Matcher m=p.matcher(str);
		System.out.println("获取的信息:");
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
