package set;

import java.util.Comparator;
import java.util.TreeSet;
//ʹ�ñȽ���ʵ������
class Workers {
	String name;
	int id;
	double salary;
	public Workers(String name,int id,double salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	public String toString() {
		return "���:"+this.id+" ����:"+this.name+" нˮ:"+this.salary;
	}
}

class MyComparator implements Comparator<Workers>{
	@Override
	public int compare(Workers o1, Workers o2) {
		
		return o1.id -o2.id;
	}
}

public class Demo7 {

	public static void main(String[] args) {
		MyComparator comparator=new MyComparator();
		TreeSet<Workers> tree=new TreeSet<Workers>(comparator);
		tree.add(new Workers("����",110,5400.5));
		tree.add(new Workers("����",140,4500.8));
		tree.add(new Workers("����",120,8400.3));
		tree.add(new Workers("����",130,3400.4));
		System.out.println(tree);
	}
}