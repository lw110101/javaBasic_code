package day02;
/*
 ��ȡ������
int length()  ��ȡ�ַ����ĳ��ȡ�
char charAt(int index) ��ȡ�ض�λ�õ��ַ����Ǳ�Խ�磩
int indexOf(String str)  ��ȡ�ض��ַ��ĵ�һ�γ��ֵ�λ��,����Ҳ�������-1��overload��
int lastIndexOf(int ch)  ��ȡ�ض��ַ��������ֵ�λ��,����Ҳ�������-1
 *///Java����int��ʾ����Unicode�����,int�ܱ�ʾ��char���ܱ�ʾ�������ַ�
public class Demo3 {

	public static void main(String[] args) {
		String str="good good study,day day up!";

		System.out.println("�ַ��������ǣ�"+str.length());
		System.out.println("��ȡ�ض�λ�õ��ַ���"+str.charAt(5));
		System.out.println("��ȡ�ַ���һ�γ��ֵ�λ���ǣ�"+str.indexOf("day"));
		System.out.println("��ȡ�ַ������ֵ�λ���ǣ�"+str.lastIndexOf(5));
	}

}
