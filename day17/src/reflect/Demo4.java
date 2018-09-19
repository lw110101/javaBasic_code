package reflect;

import java.lang.reflect.Field;

public class Demo4 {

	public static void main(String[] args) throws Exception {
		
		Class<?> clazz1=Class.forName("reflect.Person");
		/*//��ȡ�����ĳ�Ա����
		Field[] fields=clazz1.getFields();
		for(Field field:fields) {
			System.out.println(field);
		}*/
		//��ȡ���еĳ�Ա����
		Field[] fields=clazz1.getDeclaredFields();
		for(Field field:fields) {
			System.out.println(field);
		}
		//��ȡ������Ա����
		Person p=new Person("С��",140);
		Field field=clazz1.getDeclaredField("id");
		field.setAccessible(true);
		System.out.println(p);
		field.set(p, 50);
		System.out.println(p);
		
	}
}
