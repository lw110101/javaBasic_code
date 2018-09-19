package day02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class Dao{
	String name;
	int id;
	public Dao(String name, int id) {
		
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "姓名:"+this.name+"  标号:"+this.id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}


public class Demo8 {
	static Dao d=null;
	public static void main(String[] args) {
		ArrayList<Dao> list = new ArrayList<Dao>();
		d=new Dao("lw", 12);
		Dao d2=new Dao("ad", 123);
		Dao d3=new Dao("zc", 145);
		list.add(d);
		list.add(d2);
		list.add(d3);
		Collections.sort(list,new Mycomparator());
		System.out.println("初始集合元素:"+list);
		d.setName("sdjk");
		System.out.println(list);
		
	}
	static 
	class Mycomparator implements Comparator<Dao> {

		public int compare(Dao o1, Dao o2) {

			return o1.getId()-o2.getId();
		}
	}
}
