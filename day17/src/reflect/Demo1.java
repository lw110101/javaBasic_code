package reflect;
//��ȡClass����

public class Demo1 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		//��ʽһ��  Class.forName("��������")  ----->�Ƽ�ʹ��
		Class<?> clazz1=Class.forName("reflect.Person");
		System.out.println("Class����:"+clazz1);
		
		//��ʽ����	ͨ��������ȡ
		Class<?> clazz2=Person.class;
		System.out.println("Class����:"+clazz2);
		
		//��ʽ����  ͨ�������ȡ
		Person p=new Person("����", 110);
		Class<?> clazz3=p.getClass();
		System.out.println("Class����:"+clazz3);
			
		
	}
}
