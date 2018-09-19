package test2;

import java.util.Scanner;

//7.	编写一个功能函数，实现0到指定整数之间奇数的个数统计
public class Demo1 {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("请输入指定整数:");
		
		int num=sc.nextInt();
		
		int count=count(num);
		
		System.out.println("奇数的个数是:"+count);
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
