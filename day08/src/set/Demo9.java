package set;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//��ҵ2��ʹ��mapʵ�ֽ�������������С����������Сѧ��������˾���������
class Person{
	String name;

	public Person(String name) {
		
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "����:"+this.name;
	}
}
public class Demo9 {

	public static void main(String[] args) {
		
		HashMap<Person,String> map=new HashMap<Person,String>();
		
		map.put(new Person("С��"),"1999-9   ����Сѧ");
		map.put(new Person("С��"),"2002-9   ϣ��Сѧ");
		map.put(new Person("С��"),"2011-7 A��˾");
		map.put(new Person("С��"),"2013-7 B��˾");
		map.put(new Person("С��"),"2017-5 C��˾");
		Set<Map.Entry<Person, String>> set=map.entrySet();
		System.out.println("������������:");
		for(Map.Entry<Person, String> entry:set ) {
			System.out.println(entry);
		}
		/*Iterator<Map.Entry<Person, String>> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+"  ");
		}*/
	}
}
