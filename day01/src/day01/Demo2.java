package day01;
class Person{
	int id;
	String name;
	public Person(int id,String name){
		this.id=id;
		this.name=name;
	}
	//方法重写
	public String toString(){
		return "姓名："+this.name+"  学号："+this.id;
	}
	public boolean equals(Object obj){
		Person p=(Person)obj;
		return this.id==p.id;
	}
	public int hashCode(){
		return this.id;
	}
}
public class Demo2 {
	public static void main(String[] args) {
		Person p1=new Person(29,"刘伟");
		Person p2=new Person(29,"小伟子");
		//System.out.println("toString:"+p1.toString());
		System.out.println(p1);
		System.out.println("p1与p2是同一个对象吗？"+p1.equals(p2));
		System.out.println("p1的哈希码："+p1.hashCode());
		System.out.println("p2的哈希码："+p2.hashCode());		
}
}
