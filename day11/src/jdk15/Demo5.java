package jdk15;

import java.util.ArrayList;

public class Demo5 {

	public static void main(String[] args)  {
		//�������ݻ����ַ���
		String str="11";
		int i=Integer.parseInt(str);
		System.out.println(i);
		//�ַ���������������
		int a=128;
		String str1=Integer.toString(a);
		System.out.println(str1);
		//����ת��
		System.out.println("a�Ķ�������:"+Integer.toBinaryString(a));
		System.out.println("a�İ˽�����:"+Integer.toOctalString(a));
		System.out.println("a��ʮ��������:"+Integer.toHexString(a));
		//���ַ������ɶ�Ӧ�Ľ��ư�æ����
		int b1=Integer.parseInt(str, 2);
		System.out.println("�����Ƶ�str������:"+b1);
		int b2=Integer.parseInt(str, 3);
		System.out.println("�����Ƶ�str������:"+b2);
		int b3=Integer.parseInt(str, 16);
		System.out.println("16���Ƶ�str������:"+b3);
		//����:�����Ǵ洢�������ݵļ�������
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);//--------�Զ�װ��
		
		Integer c=100;
		int c1=c;
		System.out.println(c1);//-------�Զ�����
		//������������
		Integer m=10;
		Integer n=10;
		System.out.println("ͬһ������"+(m==n));//-----128~127
		
	}
}
