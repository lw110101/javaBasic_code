package day01;
//�ַ���������

public class Demo3 {

	public static void main(String[] args) {
		
		String str1="�ϲ���ѧ������װѧԺ";
		
		String str2="�ϲ���ѧ������װѧԺ";
		
		String str3=new String("�ϲ���ѧ������װѧԺ");
		
		String str4=new String("�ϲ���ѧ������װѧԺ");
		
		System.out.println("str1=str2?"+(str1==str2));
		
		System.out.println("str2=str3?"+(str2==str3));
		
		System.out.println("str3=str4?"+(str3==str4));
		
		System.out.println("str3.equals(str4)?"+(str3.equals(str4)));
	//String���obj��equals()����<Ĭ�ϱȽ���������ĵ�ַ>������д������Ƚ��������ݡ�
}
}
