package day02;

import java.util.Arrays;

/*  ����������
String replace(char oldChar,char newChar)  �滻
String[] split(String regex)  �и�
String substring(int beginIndex)
String substring(int beginIndex,int endIndex)  ��ȡ�ַ���
String toUpperCase() ת��д
String toLowerCase()  תСд
String trim()  ȥ���ո�
 */
public class Demo6 {

	public static void main(String[] args) {
		String str="������ĩ,����Ҫ�ϿΣ�";
		String str1="A-B-C-D-E-F-G-H-I";
		String[] arr=str1.split("-");
		String str2="abHGJbhghBhbhjV";
		String str3="      ̧ͷ���չ���б�� ������ˮ�����������Ͼ���          ";
		System.out.println("�滻��"+str.replace("Ҫ�ϿΣ�","��Ϣ������˯������"));
		System.out.println("�и"+Arrays.toString(arr));
		System.out.println("��ȡ��"+str.substring(5));
		System.out.println("��ͷ����β��ȡ��"+str.substring(2,6));
		System.out.println("ת��д��"+str2.toUpperCase());
		System.out.println("תСд��"+str2.toLowerCase());
		System.out.println("ȥ���ո�"+str3.trim());
	}

}
