package list;

import java.util.LinkedList;

//��������
class Body{
	String name;
	int age;
	public Body(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return "����:"+this.name+"  ����:"+this.age;
	}
}

public class Demo11 {

	public static void main(String[] args) {
		LinkedList<Body> list=new LinkedList<Body>();
		list.add(new Body("��ү",20));
		list.add(new Body("����",30));
		list.add(new Body("��ʣ",12));
		list.add(new Body("����",7));
		
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
		System.out.println("�������С��������"+list);
	}
}
