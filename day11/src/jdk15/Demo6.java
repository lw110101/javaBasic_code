package jdk15;
//������-----ö��

class Gender{//�Զ����Ա���

	String value;
	public static final Gender man=new Gender("��");
	public static final Gender woman=new Gender("Ů");
	private Gender(String value) {
		this.value = value;
	}
	
}
class Student{
	
	private String name;
	private Gender sex;

	public Student() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
/*
	public void setSex(String sex) {
		if ("��".equals(sex) || "Ů".equals(sex)) {
			this.sex = sex;
		} else {
			throw new RuntimeException("������Ϣ!");
		}
	}*/

	public Gender getSex() {
		return sex;
	}

	public void setSex(Gender sex) {
		this.sex = sex;
	}
	
}

public class Demo6 {

	public static void main(String[] args) {
		Student s=new Student();
		s.setName("����");
		s.setSex(Gender.man);
		System.out.println("����:"+s.getName()+"  �Ա�:"+s.getSex().value);
	}
}
