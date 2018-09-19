package jdk15;

import java.util.ArrayList;

//新特性----增强for循环    实现了Iterable接口或数组对象

class MyIterator{
	
	String name;
	int id;
	public MyIterator(String name, int id) {
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "姓名:"+this.name+" 编号:"+this.id;
	}
	
}

public class Demo2 {

	public static void main(String[] args) {
		/*
		ArrayList<String> list=new ArrayList<String>();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		for(String temp:list) {
			System.out.print(temp+"  ");
		}
	*/
		ArrayList<MyIterator> list=new ArrayList<MyIterator>();
		list.add(new MyIterator("狗娃",110));
		list.add(new MyIterator("狗剩",130));
		list.add(new MyIterator("铁蛋",120));
		for(MyIterator temp:list) {
			System.out.print(temp+"  ");
		}
		
	}
	
}
