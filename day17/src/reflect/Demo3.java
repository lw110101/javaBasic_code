package reflect;

import java.lang.reflect.Method;

//��ȡ����
public class Demo3 {

	public static void main(String[] args) throws Exception {
		
		Class<?> clazz1=Class.forName("reflect.Person");
		/*//��ȡ���з���
		Method[] methods=clazz1.getMethods();
		for(Method method:methods) {
			System.out.println("���з���:"+method);
		}*/
		//��ȡ���а���˽�з���
		Method[] methods=clazz1.getDeclaredMethods();
		for(Method method:methods) {
			System.out.println("���з���:"+method);
		}
		/*//��ȡ��������
		Person p=new Person("С��",150);
		Method method=clazz1.getMethod("eat", null);
		method.invoke(p, null);
		*/
	}
}
