package list;

import java.util.LinkedList;

//集合排序
class Body{
	String name;
	int age;
	public Body(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return "姓名:"+this.name+"  年龄:"+this.age;
	}
}

public class Demo11 {

	public static void main(String[] args) {
		LinkedList<Body> list=new LinkedList<Body>();
		list.add(new Body("祥爷",20));
		list.add(new Body("狗蛋",30));
		list.add(new Body("狗剩",12));
		list.add(new Body("铁蛋",7));
		
		//ListIterator<Body> lit=list.listIterator();
		for(int i=0;i<list.size()-1;i++) {
			for(int j=i+1;j<list.size();j++) {
				Body s=(Body)list.get(i);
				Body s1=(Body)list.get(j);
				if(s1.age<s.age) {
					list.set(i, s1);
					list.set(j, s);
				}
			}
		}
		System.out.println("按年龄从小到大排序："+list);
	}
}
