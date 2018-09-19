package jdk15;
//新特性-----枚举

class Gender{//自定义性别类

	String value;
	public static final Gender man=new Gender("男");
	public static final Gender woman=new Gender("女");
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
		if ("男".equals(sex) || "女".equals(sex)) {
			this.sex = sex;
		} else {
			throw new RuntimeException("垃圾信息!");
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
		s.setName("肥喵");
		s.setSex(Gender.man);
		System.out.println("姓名:"+s.getName()+"  性别:"+s.getSex().value);
	}
}
