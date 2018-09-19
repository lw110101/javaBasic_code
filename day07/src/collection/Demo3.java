package collection;

import java.util.ArrayList;
import java.util.Collection;



/*  查看:
	size()   集合的长度
   
  判断：
	contains(Object o)   包含集合元素
	containsAll(Collection<?> c)   包含集合
	isEmpty()
 */
class Student{
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Student s=(Student)obj;
		return this.id==s.id;
	}
	
	String name;
	int id;
	public Student(String name,int id){
		this.name=name;
		this.id=id;
	}
	
}

public class Demo3 {

		public static void main(String[] args) {
			Collection<Student> c=new ArrayList<Student>();
			c.add(new Student("狗剩",110));
			c.add(new Student("狗蛋",101));
			c.add(new Student("铁蛋",102));
			c.add(new Student("陈狗蛋",119));
			System.out.println("长度是："+c.size());
			
			Collection<Student> c1=new ArrayList<Student>();
			c1.add(new Student("狗剩",110));
			c1.add(new Student("狗蛋",101));
			
			System.out.println("c包含铁蛋吗？"+c.contains(new Student("铁蛋",102)));
			System.out.println("c包含c1吗？"+c.containsAll(c1));
			
			System.out.println("c1为空吗？"+c1.isEmpty());
			
		}
}
