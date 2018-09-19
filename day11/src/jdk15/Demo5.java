package jdk15;

import java.util.ArrayList;

public class Demo5 {

	public static void main(String[] args)  {
		//整形数据换成字符串
		String str="11";
		int i=Integer.parseInt(str);
		System.out.println(i);
		//字符串换成整形数据
		int a=128;
		String str1=Integer.toString(a);
		System.out.println(str1);
		//进制转换
		System.out.println("a的二进制是:"+Integer.toBinaryString(a));
		System.out.println("a的八进制是:"+Integer.toOctalString(a));
		System.out.println("a的十六进制是:"+Integer.toHexString(a));
		//将字符串当成对应的进制帮忙换算
		int b1=Integer.parseInt(str, 2);
		System.out.println("二进制的str数据是:"+b1);
		int b2=Integer.parseInt(str, 3);
		System.out.println("三进制的str数据是:"+b2);
		int b3=Integer.parseInt(str, 16);
		System.out.println("16进制的str数据是:"+b3);
		//集合:集合是存储对象数据的集合容器
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);//--------自动装箱
		
		Integer c=100;
		int c1=c;
		System.out.println(c1);//-------自动拆箱
		//引用数据类型
		Integer m=10;
		Integer n=10;
		System.out.println("同一个对象？"+(m==n));//-----128~127
		
	}
}
