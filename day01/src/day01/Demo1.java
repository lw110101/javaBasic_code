package day01;
class Student{
	public String getName() {
		return "我的名字是："+name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return "性别："+sex;
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
		System.out.println(name+"好好学习，天天向上！");
		
	}
	public String toString(){
		return "姓名："+name+"  性别："+sex;
	}
}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student s=new Student("刘伟","男");
	s.setName("lw");
	s.getName();
	s.setSex("男");
	s.getSex();
//		s.study();
		//System.out.println("姓名："+s.name+"性别："+s.sex);
		System.out.println(s.getName()+s.getSex());
	}

}
