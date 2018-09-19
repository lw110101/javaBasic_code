package reflect;
//获取Class对象

public class Demo1 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		//方式一：  Class.forName("完整类名")  ----->推荐使用
		Class<?> clazz1=Class.forName("reflect.Person");
		System.out.println("Class对象:"+clazz1);
		
		//方式二：	通过类名获取
		Class<?> clazz2=Person.class;
		System.out.println("Class对象:"+clazz2);
		
		//方式三：  通过对象获取
		Person p=new Person("狗娃", 110);
		Class<?> clazz3=p.getClass();
		System.out.println("Class对象:"+clazz3);
			
		
	}
}
