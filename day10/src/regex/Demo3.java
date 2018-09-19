package regex;

import java.util.Arrays;
import java.util.Scanner;

/*
正则表达式的应用场景：
	匹配matches():
	切割split():
	替换replaceAll():
	查找:
	*/
public class Demo3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入:");
		String str=sc.next();
		sc.close();
		//matchesPhone(str);
		//matchesTel(str);
		//matchesIp(str);
		//splitBlank(str);
		//splitPlex(str);
		matchesEmail(str);
		replaceTest1();
		replaceTest2();
			
	}
	
	//需求:编写一个正则表达式匹配一个手机号。 规则：首位为1，第二位是3，4，5，7，8  长度：11
	public static void matchesPhone(String phone) {
		System.out.println((phone.matches("1[34578]\\d{9}"))?"手机号合法":"手机号非法");
	}
	
	//需求:匹配固定电话    规则:区号-主号   区号：0开头，3-4位   主号：首不为0，7-8位
	public static void matchesTel(String tel) {
		System.out.println((tel.matches("0\\d{2,3}-[1-9]\\d{6,7}"))?"固话合法":"固话非法");
	}
	
	//需求:匹配一个IP地址   规则：0.0.0.0-255.255.255.255   --->0-199,200-249,250-255
	public static void matchesIp(String ip) {
		String regex="((25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))\\.){3}(25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))";
		System.out.println((ip.matches(regex))?"IP合法":"IP非法");
	}
	
	//需求:按照空格切割         南昌                    大      学           人民         武装学                院
	public static void splitBlank(String str) {
		String[] arr=str.split(" +");
		System.out.println("切割空格的数组元素是:"+Arrays.toString(arr));
	}
	
	//需求:按照重叠词切割              曲木木木木悠扬哟哟哟，喂喂词难好好好好好忘
	public static void splitPlex(String str) {
		String[] arr1=str.split("(.)\\1+");
		System.out.println("切割重叠词的数组元素是:"+Arrays.toString(arr1));
	}
	
	//需求:匹配一个邮箱    首位不能为0，结尾以.com  .cn  .com.cn  .net    @  4-32个字符
	public static void matchesEmail(String email) {
		System.out.println((email.matches("[a-zA-Z1-9]\\w{3,31}@[a-zA-Z0-9]{2,}(\\.(com|cn|net)){1,2}"))?"合法邮箱":"非法邮箱");
	}
	
	//需求：将联系方式替换成*
	public static void replaceTest1() {
		String str="有需要请联系我：15770858687或1373832455。有需要请联系我：15770858687或1373832455有需要请联系我：15770858687或1373832455"
				+ "有需要请联系我：15770858687或1373832455有需要请联系我：15770858687或1373832455有需要请联系我：15770858687或1373832455";
		String regex="1[34578]\\d{9}|[1-9]\\d{4,11}";
		str=str.replaceAll(regex, "****");
		System.out.println("替换后的字符串是:"+str);
	}
	
	//需求:将重叠部分替换成单个字符。----》我我我我我爱爱爱玩玩玩玩点点点点点阵阵阵阵。
	public static void replaceTest2() {
		String str="我我我我我爱爱爱玩玩玩玩点点点点点阵阵阵阵。";
		String regex="(.)\\1+";
		str=str.replaceAll(regex, "$1");
		System.out.println("完整信息是:"+str);
	}
	
}
