package set;

import java.util.Comparator;
import java.util.TreeSet;
//使用比较器实现排序
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
		return "编号:"+this.id+" 姓名:"+this.name+" 薪水:"+this.salary;
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
		tree.add(new Workers("张三",110,5400.5));
		tree.add(new Workers("李四",140,4500.8));
		tree.add(new Workers("王五",120,8400.3));
		tree.add(new Workers("赵六",130,3400.4));
		System.out.println(tree);
	}
}