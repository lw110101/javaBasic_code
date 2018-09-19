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
		return "[姓名:"+this.name+"  年龄:"+this.age+"]";
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
		list.add(new Man("老刘",20));
		list.add(new Man("老王",24));
		list.add(new Man("老白",22));
		list.add(new Man("老李",42));
		
		Collections.sort(list,new AgeComparator());//传入比较器
		System.out.println("查找元素的索引值是:"+Collections.binarySearch(list, new Man("老白",22),new AgeComparator()));
		System.out.println("集合的最大值是:"+Collections.max(list,new AgeComparator()));
		System.out.println("集合的最小值是:"+Collections.min(list,new AgeComparator()));
		System.out.println("集合元素是:"+list);
		Collections.reverse(list);
		System.out.println("反转后的集合是:"+list);
		List<Man> list1=Collections.synchronizedList(list);
		System.out.println(list1);
		
	}
}
