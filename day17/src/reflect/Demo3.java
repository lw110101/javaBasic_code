package reflect;

import java.lang.reflect.Method;

//获取方法
public class Demo3 {

	public static void main(String[] args) throws Exception {
		
		Class<?> clazz1=Class.forName("reflect.Person");
		/*//获取所有方法
		Method[] methods=clazz1.getMethods();
		for(Method method:methods) {
			System.out.println("所有方法:"+method);
		}*/
		//获取所有包括私有方法
		Method[] methods=clazz1.getDeclaredMethods();
		for(Method method:methods) {
			System.out.println("所有方法:"+method);
		}
		/*//获取单个方法
		Person p=new Person("小花",150);
		Method method=clazz1.getMethod("eat", null);
		method.invoke(p, null);
		*/
	}
}
