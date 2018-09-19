package set;

import java.util.TreeSet;
//使用Comparable接口实现比较。
class Worker implements Comparable<Worker>{
	String name;
	int id;
	double salary;
	public Worker(String name,int id,double salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	public String toString() {
		return "编号:"+this.id+" 姓名:"+this.name+" 薪水:"+this.salary;
	}

	@Override
	public int compareTo(Worker o) {
		
		return this.id-o.id;
	}

	//Comparable()方法的返回值：负数，0，正数，根据此对象是小于，等于还是大于指定对象而言
	/*public int compareTo(Object o) {
		Worker worker=(Worker)o;
		return (int)(this.salary-worker.salary);
	}*/
	/*public int compareTo(Object o) {
		Worker worker=(Worker)o;
		return this.id-worker.id;
	}*/
	
}

public class Demo5 {

	public static void main(String[] args) {
		TreeSet<Worker> tree=new TreeSet<Worker>();
		tree.add(new Worker("张三",110,5400.5));
		tree.add(new Worker("李四",140,4500.8));
		tree.add(new Worker("王五",120,8400.3));
		tree.add(new Worker("赵六",130,3400.4));
		System.out.println(tree);
	}
}
