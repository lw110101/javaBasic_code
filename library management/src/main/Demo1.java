package main;

import java.util.Scanner;
import tool.*;

public class Demo1 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("********************************************");
		System.out.println("*                                          *");
		System.out.println("*                                          *");		
		System.out.println("*             ��ӭʹ��ͼ�����ϵͳ                                       *");
		System.out.println("*                                          *");
		System.out.println("*                                          *");
		System.out.println("*                                          *");
		System.out.println("********************************************");
		
		while(true) {
		System.out.println("��ѡ����:    A(ע���û�)    B(�û���¼)    Q(�˳�ϵͳ)");
		String option=sc.nextLine();
		
			if("A".equalsIgnoreCase(option)) {
				UserTools.reg();

			}else if("B".equalsIgnoreCase(option)) {
				UserTools.login();
				
			}else if("Q".equalsIgnoreCase(option)) {
				System.exit(0);
				sc.close();
			}else {
				System.out.println("��Чѡ��������ѡ��!");
				
			}
		}
	}
}