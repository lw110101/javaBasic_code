package math_date;
/*
 * Math  ��ѧ��;�ṩ�ܶ���ѧ��ʽ
	abs(double b)   ��ȡ����ֵ
	ceil(double b)   ����ȡ��
	floor(double b)   ����ȡ��
	round(float a)   ��������
	random()    ����һ�������   [0.0,1.0)��α�����

Random  ������� 
 */
public class Demo2 {

	public static void main(String[] args) {
	
		System.out.println("����ֵ��"+Math.abs(-3.14));
		System.out.println("����ȡ����"+Math.ceil(-3.14));
		System.out.println("����ȡ����"+Math.floor(-3.14));
		System.out.println("�������룺"+Math.round(-3.54));
		System.out.println("α�������"+(Math.random()+1));
	
	}

}
