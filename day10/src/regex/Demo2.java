package regex;
/*
Ԥ�����ַ���        
	. �κ��ַ������н���������ƥ��Ҳ���ܲ�ƥ�䣩 
	\d ���֣�[0-9] 
	\D �����֣� [^0-9] 
	\s �հ��ַ���[ \t\n\x0B\f\r] 
	\S �ǿհ��ַ���[^\s] 
	\w �����ַ���[a-zA-Z_0-9] 
	\W �ǵ����ַ���[^\w] 
ע�⣺�κ�Ԥ�����ַ���û�м�������֮ǰ��ֻ��ƥ��һ���ַ���

Greedy ������ 
	X? X��һ�λ�һ��Ҳû�� 
	X* X����λ��� 
	X+ X��һ�λ��� 
	X{n} X��ǡ�� n �� 
	X{n,} X������ n �� 
	X{n,m} X������ n �Σ����ǲ����� m �� 

�ַ��� ����Χ�ʣ�
	[abc] a��b �� c�����ࣩ 
	[^abc] �κ��ַ������� a��b �� c���񶨣� 
	[a-zA-Z] a �� z �� A �� Z����ͷ����ĸ�������ڣ���Χ�� 
	[a-d[m-p]] a �� d �� m �� p��[a-dm-p]�������� 
	[a-z&&[def]] d��e �� f�������� 
	[a-z&&[^bc]] a �� z������ b �� c��[ad-z]����ȥ�� 
	[a-z&&[^m-p]] a �� z������ m �� p��[a-lq-z]����ȥ�� 
ע�⣺�κη�Χ����û��������֮ǰ��ֻ��ƥ��һ���ַ���
*/
public class Demo2 {

	public static void main(String[] args) {
		//Ԥ�����ַ���      
		System.out.println("�����ַ�:"+(".".matches(".")));  //ƥ�������ַ�
		System.out.println("�����ַ�:"+("&".matches("\\d")));
		System.out.println("�������ַ�:"+("a".matches("\\D")));
		System.out.println("�հ��ַ�:"+("\r".matches("\\s")));
		System.out.println("�ǿհ��ַ�:"+(" ".matches("\\S")));
		System.out.println("�����ַ�:"+("_".matches("\\w")));
		System.out.println("�ǵ����ַ�:"+("g".matches("\\W")));
		
		//Greedy ������ 
		System.out.println("һ����һ��Ҳû��:"+("a".matches("\\w?")));
		System.out.println("�������:"+("avs".matches("\\w*")));
		System.out.println("һ�λ���:"+(" ".matches("\\w+")));
		System.out.println("ǡ��һ��:"+("zvc".matches("[zcv]{3}")));
		System.out.println("����һ��:"+("124".matches("\\w{1,}")));
		System.out.println("����n�Σ�����m��:"+("dfsss".matches("[dssfs]{2,5}")));
		
		//�ַ��� ����Χ�ʣ�
		System.out.println("����:"+("d".matches("[abfd]")));
		System.out.println("^����:"+("d".matches("[^abfd]")));
		System.out.println("��Сд��ĸ:"+("5".matches("[a-zA-Z0-9]")));
		System.out.println("����:"+("K".matches("[a-dH-T]")));
		//System.out.println("����:"+("255.255.245.1".matches("([1-9]?\\d.|1\\d\\d.|2[0-4]\\d.|25[0-5]\\.){3}([1-9]?\\d.|1\\d\\d.|2[0-4]\\d.|25[0-5])")));
	}
}
