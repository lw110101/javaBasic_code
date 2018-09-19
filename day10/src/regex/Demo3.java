package regex;

import java.util.Arrays;
import java.util.Scanner;

/*
������ʽ��Ӧ�ó�����
	ƥ��matches():
	�и�split():
	�滻replaceAll():
	����:
	*/
public class Demo3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("������:");
		String str=sc.next();
		sc.close();
		//matchesPhone(str);
		//matchesTel(str);
		//matchesIp(str);
		//splitBlank(str);
		//splitPlex(str);
		matchesEmail(str);
		replaceTest1();
		replaceTest2();
			
	}
	
	//����:��дһ��������ʽƥ��һ���ֻ��š� ������λΪ1���ڶ�λ��3��4��5��7��8  ���ȣ�11
	public static void matchesPhone(String phone) {
		System.out.println((phone.matches("1[34578]\\d{9}"))?"�ֻ��źϷ�":"�ֻ��ŷǷ�");
	}
	
	//����:ƥ��̶��绰    ����:����-����   ���ţ�0��ͷ��3-4λ   ���ţ��ײ�Ϊ0��7-8λ
	public static void matchesTel(String tel) {
		System.out.println((tel.matches("0\\d{2,3}-[1-9]\\d{6,7}"))?"�̻��Ϸ�":"�̻��Ƿ�");
	}
	
	//����:ƥ��һ��IP��ַ   ����0.0.0.0-255.255.255.255   --->0-199,200-249,250-255
	public static void matchesIp(String ip) {
		String regex="((25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))\\.){3}(25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))";
		System.out.println((ip.matches(regex))?"IP�Ϸ�":"IP�Ƿ�");
	}
	
	//����:���տո��и�         �ϲ�                    ��      ѧ           ����         ��װѧ                Ժ
	public static void splitBlank(String str) {
		String[] arr=str.split(" +");
		System.out.println("�и�ո������Ԫ����:"+Arrays.toString(arr));
	}
	
	//����:�����ص����и�              ��ľľľľ����ӴӴӴ��ιι���Ѻúúúú���
	public static void splitPlex(String str) {
		String[] arr1=str.split("(.)\\1+");
		System.out.println("�и��ص��ʵ�����Ԫ����:"+Arrays.toString(arr1));
	}
	
	//����:ƥ��һ������    ��λ����Ϊ0����β��.com  .cn  .com.cn  .net    @  4-32���ַ�
	public static void matchesEmail(String email) {
		System.out.println((email.matches("[a-zA-Z1-9]\\w{3,31}@[a-zA-Z0-9]{2,}(\\.(com|cn|net)){1,2}"))?"�Ϸ�����":"�Ƿ�����");
	}
	
	//���󣺽���ϵ��ʽ�滻��*
	public static void replaceTest1() {
		String str="����Ҫ����ϵ�ң�15770858687��1373832455������Ҫ����ϵ�ң�15770858687��1373832455����Ҫ����ϵ�ң�15770858687��1373832455"
				+ "����Ҫ����ϵ�ң�15770858687��1373832455����Ҫ����ϵ�ң�15770858687��1373832455����Ҫ����ϵ�ң�15770858687��1373832455";
		String regex="1[34578]\\d{9}|[1-9]\\d{4,11}";
		str=str.replaceAll(regex, "****");
		System.out.println("�滻����ַ�����:"+str);
	}
	
	//����:���ص������滻�ɵ����ַ���----�����������Ұ��������������������������
	public static void replaceTest2() {
		String str="���������Ұ��������������������������";
		String regex="(.)\\1+";
		str=str.replaceAll(regex, "$1");
		System.out.println("������Ϣ��:"+str);
	}
	
}
