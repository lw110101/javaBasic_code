package collection;

import java.util.ArrayList;
import java.util.Collection;



/*  �鿴:
	size()   ���ϵĳ���
   
  �жϣ�
	contains(Object o)   ��������Ԫ��
	containsAll(Collection<?> c)   ��������
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
			c.add(new Student("��ʣ",110));
			c.add(new Student("����",101));
			c.add(new Student("����",102));
			c.add(new Student("�¹���",119));
			System.out.println("�����ǣ�"+c.size());
			
			Collection<Student> c1=new ArrayList<Student>();
			c1.add(new Student("��ʣ",110));
			c1.add(new Student("����",101));
			
			System.out.println("c����������"+c.contains(new Student("����",102)));
			System.out.println("c����c1��"+c.containsAll(c1));
			
			System.out.println("c1Ϊ����"+c1.isEmpty());
			
		}
}
