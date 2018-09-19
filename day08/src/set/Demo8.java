package set;

import java.util.HashSet;

//��ҵ1��set��Ӷ��ѧ����Ϣ��ѧ��������ͬ�Ŀ���һ��ѧ��

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
		
		return "����:"+this.name+"  ѧ��:"+this.sNo;
	}
}

public class Demo8 {

	public static void main(String[] args) {
		
		HashSet<Student> set=new HashSet<Student>();
		set.add(new Student("С��",110));
		set.add(new Student("С��",120));
		set.add(new Student("С־",140));
		set.add(new Student("С��",110));
		System.out.println(set);
	}
}
