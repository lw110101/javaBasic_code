package genrictiry;

//�������Զ��巺��
public class Demo2 {

	public static void main(String[] args) {
		String str=getData("����");
		Integer i=getData(123);
		Object o=getData(new Object());
		System.out.println(str);
		System.out.println(i);
		System.out.println(o.toString());
	}
	
	public static <T>T getData(T o){
		return o;
	}
}
