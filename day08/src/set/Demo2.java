package set;

public class Demo2 {

	public static void main(String[] args) {
		String str="java welcome you!";
		String str1=new String("java welcome you!");
		System.out.println("��ͬһ��������?"+(str1==str));
		System.out.println("str1��hashCode��"+str1.hashCode());
		System.out.println("str��hashCode��"+str.hashCode());
	}
}
///String��д��hashCode()������