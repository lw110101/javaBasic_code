package set;

import java.util.HashSet;

//作业1：set添加多个学生信息，学生属性相同的看作一个学生

class Student{
	String name;
	int sNo;
	public Student(String name, int sNo) {
		this.name = name;
		this.sNo = sNo;
	}
	@Override
	public boolean equals(Object obj) {
		Student s=(Student)obj;
		return this.name.equals(s.name)&&this.sNo==s.sNo;
	}
	@Override
	public int hashCode() {
		
		return (int)(this.name.hashCode()*0.6+this.sNo*0.4);
	}
	@Override
	public String toString() {
		
		return "姓名:"+this.name+"  学号:"+this.sNo;
	}
}

public class Demo8 {

	public static void main(String[] args) {
		
		HashSet<Student> set=new HashSet<Student>();
		set.add(new Student("小明",110));
		set.add(new Student("小花",120));
		set.add(new Student("小志",140));
		set.add(new Student("小明",110));
		System.out.println(set);
	}
}
