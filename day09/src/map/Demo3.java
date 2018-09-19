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
		return "[����:"+this.name+"  ѧ��:"+this.stuNo+"]";
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
		map.put(new Student("��ΰ",1715029), "Ů");
		map.put(new Student("����",1715007), "��");
		map.put(new Student("С��",1715035), "Ů");
		map.put(new Student("С��",1715049), "Ů");
		map.put(new Student("��ΰ",1715029), "��");//�����������ͬ������ô����ӵ����ݵ�ֵ��ȡ��֮ǰ ��ֵ��
	
		System.out.println(map);
	}
}
