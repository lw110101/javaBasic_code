package test2;

import java.util.Scanner;

//7.	��дһ�����ܺ�����ʵ��0��ָ������֮�������ĸ���ͳ��
public class Demo1 {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("������ָ������:");
		
		int num=sc.nextInt();
		
		int count=count(num);
		
		System.out.println("�����ĸ�����:"+count);
	}
	
	public static int count(int num) {
		
		int count=0;
		for(int i=0;i<num;i++) {
			if(i%2!=0) {
				count++;
			}
		}
		return count;
	}
}
