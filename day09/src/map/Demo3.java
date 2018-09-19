package map;

import java.util.HashMap;

class Student{
	
	String name;
	int stuNo;
	
	public Student(String name,int stuNo) {
		this.name=name;
		this.stuNo=stuNo;
	}
	
	public String toString() {
		return "[姓名:"+this.name+"  学号:"+this.stuNo+"]";
	}
	
	public int hashCode() {
		return this.stuNo;
	}
	
	public boolean equals(Object o) {
		Student s=(Student)o;
		return this.name.equals(s.name)&&this.stuNo==s.stuNo;
	}
}
public class Demo3 {

	public static void main(String[] args) {
		
		HashMap<Student,String> map=new HashMap<Student,String>();
		map.put(new Student("刘伟",1715029), "女");
		map.put(new Student("付豪",1715007), "男");
		map.put(new Student("小花",1715035), "女");
		map.put(new Student("小琴",1715049), "女");
		map.put(new Student("刘伟",1715029), "男");//如果出现了相同键，那么后添加的数据的值会取代之前 的值。
	
		System.out.println(map);
	}
}
