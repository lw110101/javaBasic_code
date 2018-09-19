package day01;
//字符串常量池

public class Demo3 {

	public static void main(String[] args) {
		
		String str1="南昌大学人民武装学院";
		
		String str2="南昌大学人民武装学院";
		
		String str3=new String("南昌大学人民武装学院");
		
		String str4=new String("南昌大学人民武装学院");
		
		System.out.println("str1=str2?"+(str1==str2));
		
		System.out.println("str2=str3?"+(str2==str3));
		
		System.out.println("str3=str4?"+(str3==str4));
		
		System.out.println("str3.equals(str4)?"+(str3.equals(str4)));
	//String类对obj的equals()方法<默认比较两个对象的地址>进行重写。这里比较是是内容。
}
}
