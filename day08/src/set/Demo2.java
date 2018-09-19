package set;

public class Demo2 {

	public static void main(String[] args) {
		String str="java welcome you!";
		String str1=new String("java welcome you!");
		System.out.println("是同一个对象吗?"+(str1==str));
		System.out.println("str1的hashCode："+str1.hashCode());
		System.out.println("str的hashCode："+str.hashCode());
	}
}
///String重写了hashCode()方法。