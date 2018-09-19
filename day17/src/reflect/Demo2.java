package reflect;

import java.lang.reflect.Constructor;

//��ȡ���췽��
public class Demo2 {

	public static void main(String[] args) throws Exception {
		
		Class<?> clazz1=Class.forName("reflect.Person");
		@SuppressWarnings("rawtypes")
		//������ȡ���еĹ��췽��
		/*Constructor[] constructors=clazz1.getDeclaredConstructors();
		for(Constructor<?> constructor:constructors) {
			System.out.println(constructor);
		}*/
		
		Constructor[] constructors=clazz1.getConstructors();
		for(Constructor<?> constructor:constructors) {
			System.out.println(constructor);
		}
		
		
		Constructor<?> constructor=clazz1.getConstructor(String.class,int.class);
		Person p=(Person) constructor.newInstance("С��",120);
		System.out.println(p);
		
		/*//������ȡָ�������Ĺ��췽��
		Constructor<?> constructor=clazz1.getDeclaredConstructor(null);
		constructor.setAccessible(true);
		Person p=(Person) constructor.newInstance(null);
		p.id=110;
		p.name="����";
		System.out.println(p);*/
		
	
	}
}
