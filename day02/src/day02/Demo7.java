package day02;

import java.util.Scanner;

//判断Ip是否合法
public class Demo7 {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入Ip:");
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
			System.out.println(ip+"是合法的");
		}else{
			System.out.println(ip+"是不合法的");
		}
			}catch(Exception e){
				System.out.println(ip+"是不合法的");
			}
		}
}
