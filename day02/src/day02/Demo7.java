package day02;

import java.util.Scanner;

//�ж�Ip�Ƿ�Ϸ�
public class Demo7 {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("������Ip:");
			String ip=sc.next();
			sc.close();
			String[] parts=ip.split("\\.");
			boolean flag=true;
			try{
		for(String part:parts){
			int i=Integer.parseInt(part);
			if(i<0||i>255){
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.println(ip+"�ǺϷ���");
		}else{
			System.out.println(ip+"�ǲ��Ϸ���");
		}
			}catch(Exception e){
				System.out.println(ip+"�ǲ��Ϸ���");
			}
		}
}
