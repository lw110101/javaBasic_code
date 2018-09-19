package main;

import java.util.Scanner;
import tool.*;

public class Demo1 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("********************************************");
		System.out.println("*                                          *");
		System.out.println("*                                          *");		
		System.out.println("*             欢迎使用图书管理系统                                       *");
		System.out.println("*                                          *");
		System.out.println("*                                          *");
		System.out.println("*                                          *");
		System.out.println("********************************************");
		
		while(true) {
		System.out.println("请选择功能:    A(注册用户)    B(用户登录)    Q(退出系统)");
		String option=sc.nextLine();
		
			if("A".equalsIgnoreCase(option)) {
				UserTools.reg();

			}else if("B".equalsIgnoreCase(option)) {
				UserTools.login();
				
			}else if("Q".equalsIgnoreCase(option)) {
				System.exit(0);
				sc.close();
			}else {
				System.out.println("无效选择，请重新选择!");
				
			}
		}
	}
}
