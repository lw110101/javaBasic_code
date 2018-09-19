package map;

import java.util.Comparator;
import java.util.TreeMap;

class Teacher implements Comparable<Teacher>{
	
	String name;
	int id;
	int salary;
	public Teacher(String name,int id,int salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	public String toString() {
		return "[编号:"+this.id+" 姓名:"+this.name +" 薪水:"+this.salary+"]";
	}
	
	  //实现Comparable接口。
	public int compareTo(Teacher o) {
		
		return this.id-o.id;
	}
	
}

class MyComparator implements Comparator<Teacher>{
	
	public int compare(Teacher o1, Teacher o2) {
		
		return o1.salary-o2.salary;
	}
}
public class Demo4 {

	public static void main(String[] args) {
		/*
		TreeMap<Character,Integer> tree=new TreeMap<Character,Integer>();
		tree.put('a', 24);
		tree.put('m', 35);
		tree.put('g', 19);
		tree.put('z', 8);
		System.out.println(tree);
		*/
		TreeMap<Teacher,Integer> tree=new TreeMap<Teacher,Integer>();
		MyComparator comparator=new MyComparator();
		TreeMap<Teacher,Integer> tree1=new TreeMap<Teacher,Integer>(comparator);
		tree.put(new Teacher("老黄",140,2000), 002);
		tree.put(new Teacher("老李",110,1000), 001);
		tree.put(new Teacher("老王",120,5000), 005);
		tree.put(new Teacher("老陆",150,3000), 003);
		tree1.put(new Teacher("老黄",140,2000), 002);
		tree1.put(new Teacher("老李",110,1000), 001);
		tree1.put(new Teacher("老王",120,5000), 005);
		tree1.put(new Teacher("老陆",150,3000), 003);
		System.out.println("集合元素是:"+tree);
		System.out.println("集合元素是:"+tree1);
		
	}
}
