package day02;
/* �жϷ�����
boolean endsWith(String str)  �Ƿ���ָ�����ַ�������
boolean isEmpty()  �Ƿ񳤶�Ϊ0
boolean contains(CharSequences)  �Ƿ����ָ������(����) Ӧ�ã�����
boolean equals(Object anObject)  �����Ƿ����
boolean equalsIgnoreCase(String anotherString)   �����Ƿ�һ�£����Դ�Сд�Ƚ�
 */
public class Demo4 {

	public static void main(String[] args) {
		String str="Water has a thing, heartless, ruthless, you mean to me";
		String str1="what are you doing?";
		String str2="WHAT ARE YOU DOING?";
		
		System.out.println("�Ƿ���ָ�����ַ�������?"+str.endsWith("water"));
		System.out.println("�Ƿ񳤶�Ϊ0?"+str.isEmpty());
		System.out.println("�Ƿ����ָ������(����)?"+str.contains("mean"));
		System.out.println("�����Ƿ����?"+str.equals(str1));
		System.out.println("���Դ�Сд�������Ƿ�һ�£�"+str1.equalsIgnoreCase(str2));
	}

}
