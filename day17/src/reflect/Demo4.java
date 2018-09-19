package reflect;

import java.lang.reflect.Field;

public class Demo4 {

	public static void main(String[] args) throws Exception {
		
		Class<?> clazz1=Class.forName("reflect.Person");
		/*//获取公共的成员变量
		Field[] fields=clazz1.getFields();
		for(Field field:fields) {
			System.out.println(field);
		}*/
		//获取所有的成员变量
		Field[] fields=clazz1.getDeclaredFields();
		for(Field field:fields) {
			System.out.println(field);
		}
		//获取单个成员变量
		Person p=new Person("小王",140);
		Field field=clazz1.getDeclaredField("id");
		field.setAccessible(true);
		System.out.println(p);
		field.set(p, 50);
		System.out.println(p);
		
	}
}
