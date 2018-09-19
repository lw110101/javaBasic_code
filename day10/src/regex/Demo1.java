package regex;

import java.util.Scanner;

/*
需求：验证一个QQ是否合法
	1.首位不能为0
	2.不能有字母
	3.位数为5-12;
*/
public class Demo1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个QQ号:");
		String qq=sc.next();
		sc.close();
		if(!qq.startsWith("0")) {
			if(qq.length()>=5&&qq.length()<=12) {
				try {
					Long.parseLong(qq);
					System.out.println("QQ有效!");
				}catch(Exception e) {
					System.out.println("非法QQ,QQ不能有字母!");
				}
				
			}else {
				System.out.println("非法QQ,QQ位数为5~12!");
			}
		}else {
			System.out.println("非法QQ,QQ不能以0开头！");
		}
		
		/*//引人正则表达式：
		System.out.println(qq.matches("[1-9]\\d{4,10}")?"合法QQ":"非法QQ");
		*/
	}
}
