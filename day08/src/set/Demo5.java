package set;

import java.util.TreeSet;
//ʹ��Comparable�ӿ�ʵ�ֱȽϡ�
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
		return "���:"+this.id+" ����:"+this.name+" нˮ:"+this.salary;
	}

	@Override
	public int compareTo(Worker o) {
		
		return this.id-o.id;
	}

	//Comparable()�����ķ���ֵ��������0�����������ݴ˶�����С�ڣ����ڻ��Ǵ���ָ���������
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
		tree.add(new Worker("����",110,5400.5));
		tree.add(new Worker("����",140,4500.8));
		tree.add(new Worker("����",120,8400.3));
		tree.add(new Worker("����",130,3400.4));
		System.out.println(tree);
	}
}
