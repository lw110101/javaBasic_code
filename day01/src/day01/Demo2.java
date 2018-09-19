package day01;
class Person{
	int id;
	String name;
	public Person(int id,String name){
		this.id=id;
		this.name=name;
	}
	//������д
	public String toString(){
		return "������"+this.name+"  ѧ�ţ�"+this.id;
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
		Person p1=new Person(29,"��ΰ");
		Person p2=new Person(29,"Сΰ��");
		//System.out.println("toString:"+p1.toString());
		System.out.println(p1);
		System.out.println("p1��p2��ͬһ��������"+p1.equals(p2));
		System.out.println("p1�Ĺ�ϣ�룺"+p1.hashCode());
		System.out.println("p2�Ĺ�ϣ�룺"+p2.hashCode());		
}
}
