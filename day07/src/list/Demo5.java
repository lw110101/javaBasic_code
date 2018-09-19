package list;
/*删除重复元素

	思路：创建一个新集合，若新集合不存在原集合元素，那么就将原集合元素添加进新集合里。*/

import java.util.ArrayList;
import java.util.ListIterator;

class Student{
	String name;
	int id;
	public Student(String name,int id) {
		this.name=name;
		this.id=id;
	}
	public boolean equals(Object obj) {
		Student s=(Student)obj;
		return  this.id==s.id;
	}
	public String toString() {
		return "姓名:"+name+"  学号:"+id;
	}
}

public class Demo5 {

	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<Student>();
		ArrayList<Student> list1=new ArrayList<Student>();
			list.add(new Student("陈七",110));
			list.add(new Student("赵六",120));
			list.add(new Student("王五",130));
			list.add(new Student("赵三",140));
			list.add(new Student("李四",110));
			list.add(new Student("王八",120));
			list.add(new Student("狗蛋",120));
			
			ListIterator<Student> lit=list.listIterator();
			while(lit.hasNext()) {
				Student s1=(Student)lit.next();
				if(!list1.contains(s1)) {
					list1.add(s1);
				}
		}
			System.out.println(list1);
	}
}
