package day01;
class Student{
	public String getName() {
		return "�ҵ������ǣ�"+name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return "�Ա�"+sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	String name;
	String sex;
	public Student(String name,String sex){
		this.name=name;
		this.sex=sex;
	}
	
	public void study(){
		System.out.println(name+"�ú�ѧϰ���������ϣ�");
		
	}
	public String toString(){
		return "������"+name+"  �Ա�"+sex;
	}
}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student s=new Student("��ΰ","��");
	s.setName("lw");
	s.getName();
	s.setSex("��");
	s.getSex();
//		s.study();
		//System.out.println("������"+s.name+"�Ա�"+s.sex);
		System.out.println(s.getName()+s.getSex());
	}

}
