package day02;

import java.util.Arrays;

/*  ת��������
String(char[] value) ���ַ�����ת��Ϊ�ַ���
String(char[] value,int offset,int count)
static String valueOf(char[] data)
static String valueOf(char[] data,int offset,int count)
char[] toCharArray()  ���ַ���ת���ַ�����
byte[] getBytes();   ת��Ϊ�ֽ�����
 */
public class Demo5 {

	public static void main(String[] args) {
		String str=new String();
		char[] buf={'��','��','��','ѧ','��','��','��','װ','ѧ','Ժ'};
		str=new String(buf);
		str=new String(buf,4,6);
		
		String str1="�ú�ѧϰ����������";
		char[] arr=str1.toCharArray();
		byte[] bytes=str1.getBytes();
		
		System.out.println("�ַ�����ת��Ϊ�ַ���:"+str);
		System.out.println("ָ���ַ���"+String.valueOf(buf));
		System.out.println("ָ���ַ���"+String.valueOf(buf,4,6));
		System.out.println("���ַ���ת���ַ����飺"+Arrays.toString(arr));
		System.out.println("ת��Ϊ�ֽ�����:"+Arrays.toString(bytes));
	}

}
