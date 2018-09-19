package Collections_Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Man {
	
	String name;
	int age;
	public Man(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public String toString() {
		return "[����:"+this.name+"  ����:"+this.age+"]";
	} 
}

class AgeComparator implements Comparator<Man>{

	@Override
	public int compare(Man o1, Man o2) {
	
		return o1.age-o2.age;
	}
	
} 

public class Demo2 {

	public static void main(String[] args) {
		
		ArrayList<Man> list=new ArrayList<Man>();
		list.add(new Man("����",20));
		list.add(new Man("����",24));
		list.add(new Man("�ϰ�",22));
		list.add(new Man("����",42));
		
		Collections.sort(list,new AgeComparator());//����Ƚ���
		System.out.println("����Ԫ�ص�����ֵ��:"+Collections.binarySearch(list, new Man("�ϰ�",22),new AgeComparator()));
		System.out.println("���ϵ����ֵ��:"+Collections.max(list,new AgeComparator()));
		System.out.println("���ϵ���Сֵ��:"+Collections.min(list,new AgeComparator()));
		System.out.println("����Ԫ����:"+list);
		Collections.reverse(list);
		System.out.println("��ת��ļ�����:"+list);
		List<Man> list1=Collections.synchronizedList(list);
		System.out.println(list1);
		
	}
}
