package regex;

import java.util.Scanner;

/*
������֤һ��QQ�Ƿ�Ϸ�
	1.��λ����Ϊ0
	2.��������ĸ
	3.λ��Ϊ5-12;
*/
public class Demo1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ��QQ��:");
		String qq=sc.next();
		sc.close();
		if(!qq.startsWith("0")) {
			if(qq.length()>=5&&qq.length()<=12) {
				try {
					Long.parseLong(qq);
					System.out.println("QQ��Ч!");
				}catch(Exception e) {
					System.out.println("�Ƿ�QQ,QQ��������ĸ!");
				}
				
			}else {
				System.out.println("�Ƿ�QQ,QQλ��Ϊ5~12!");
			}
		}else {
			System.out.println("�Ƿ�QQ,QQ������0��ͷ��");
		}
		
		/*//����������ʽ��
		System.out.println(qq.matches("[1-9]\\d{4,10}")?"�Ϸ�QQ":"�Ƿ�QQ");
		*/
	}
}
