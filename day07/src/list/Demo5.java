package list;
/*ɾ���ظ�Ԫ��

	˼·������һ���¼��ϣ����¼��ϲ�����ԭ����Ԫ�أ���ô�ͽ�ԭ����Ԫ����ӽ��¼����*/

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
		return "����:"+name+"  ѧ��:"+id;
	}
}

public class Demo5 {

	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<Student>();
		ArrayList<Student> list1=new ArrayList<Student>();
			list.add(new Student("����",110));
			list.add(new Student("����",120));
			list.add(new Student("����",130));
			list.add(new Student("����",140));
			list.add(new Student("����",110));
			list.add(new Student("����",120));
			list.add(new Student("����",120));
			
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
