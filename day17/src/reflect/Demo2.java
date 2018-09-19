package reflect;

import java.lang.reflect.Constructor;

//获取构造方法
public class Demo2 {

	public static void main(String[] args) throws Exception {
		
		Class<?> clazz1=Class.forName("reflect.Person");
		@SuppressWarnings("rawtypes")
		//暴力获取所有的构造方法
		/*Constructor[] constructors=clazz1.getDeclaredConstructors();
		for(Constructor<?> constructor:constructors) {
			System.out.println(constructor);
		}*/
		
		Constructor[] constructors=clazz1.getConstructors();
		for(Constructor<?> constructor:constructors) {
			System.out.println(constructor);
		}
		
		
		Constructor<?> constructor=clazz1.getConstructor(String.class,int.class);
		Person p=(Person) constructor.newInstance("小明",120);
		System.out.println(p);
		
		/*//暴力获取指定参数的构造方法
		Constructor<?> constructor=clazz1.getDeclaredConstructor(null);
		constructor.setAccessible(true);
		Person p=(Person) constructor.newInstance(null);
		p.id=110;
		p.name="铁蛋";
		System.out.println(p);*/
		
	
	}
}
