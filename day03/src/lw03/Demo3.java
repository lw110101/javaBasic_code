package lw03;
/*
 * append(boolean b) ��������������͵�����
	insert(int offset, boolean b) ָ�����������ֵ�����Ӧ������  

ɾ����
	delete(int start, int end)  ����ָ���Ŀ�ʼ���������ֵɾ����Ӧ����
	deleteCharAt(int index)  ����ָ������ֵɾ��һ���ַ�
�鿴��
	charAt(int index)
	capacity()  �鿴�ַ�����ĳ���
	length()  �鿴�洢�ַ�����
	lastIndexOf(String str) 
	indexOf(String str, int fromIndex) ����ָ������λ�ò鿴ָ�����ݵ�һ�γ��ֵ�����ֵ
	toString  ���ַ�����������������ַ�������
 
�޸ģ�
	ensureCapacity(int minimumCapacity)  ָ��StringBuffer�ڲ��ַ����鳤��
	substring(int start��int end)  ����ָ���Ŀ�ʼ���������ֵ��ȡ�Ӵ�
	replace(int start, int end, String str)  ����ָ���Ŀ�ʼ���������ֵ���ָ������
	reverse()  ��ת
	setCharAt(int index, char ch)  ��ָ���ַ��滻��ָ������ֵ��

 */
public class Demo3 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();//Ĭ��16���ַ�.����һ��+2
		sb.append("�ϲ���ѧ������װѧԺ");
		sb.append(123);
		sb.append(true);
		sb.insert(10,"��ΰ");
		sb.delete(12, 15);
		sb.deleteCharAt(15);
		sb.append("imlwejavaabcjavaacbjkh");
		String str=sb.toString();
	//��ɾ	
	System.out.println(sb);
	//�鿴
	System.out.println(sb.capacity());
	System.out.println(sb.length());
	System.out.println(sb.lastIndexOf("����"));
	System.out.println(sb.indexOf("java",1));
	System.out.println("�ַ������ǣ�"+str);
	System.out.println("�鿴charAt:"+sb.charAt(5));
	//�޸�
	sb.setCharAt(5, '��');//void��������
	System.out.println("��ȡ���ַ����ǣ�"+sb.substring(0, 10));
	System.out.println("replace������"+sb.replace(12, 37, "15�������ѧ�뼼��"));
	System.out.println(sb);
	System.out.println("��ת��"+sb.reverse());

}
}
