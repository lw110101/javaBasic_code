/*���췽����
String()  ����һ�������ݵ��ַ�����
String(byte[] bytes) ʹ��һ���ֽ����鹹��һ���ַ��������磺97��98��99-->abc
String(byte[] bytes, int offset, int length)
	bytes:Ҫ���������
	offset��ָ����������ĸ�����ֵ��ʼ����
	length����Ҫ����ĸ���
String(char[] value)  ʹ��һ���ַ����鹹��һ���ַ���
String(char[] value, int offset, int count) ʹ��һ���ַ����鹹��һ���ַ�����ָ����ʼ���������ֵ�ͽ������
String(int[] codePoints, int offset, int count)
String(String original)   ʹ���ַ��������ַ��� **
 * 
 */
package day02;

public class Demo2 {
	public static void main(String[] args) {
		String str=new String();
		
		byte[] bytes={97,98,99,100,101,102};
		str=new String(bytes);
		str=new String(bytes,2,3);
		
		char[] ch={'��','��','��','ѧ','��','��','��','װ','ѧ','Ժ'};
		str=new String(ch);
		str=new String(ch,4,6);
		
		int[] arr={65,66,67,68,69,70};
		str=new String(arr,2,3);
		
		String a="�ú�ѧjava";
		str=new String(a);
		str = new String("��������˾���ĸ���");
		System.out.println("�������ַ�����"+str);
		
		
	}

}
