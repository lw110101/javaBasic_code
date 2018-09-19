package jdk15;

import java.util.ArrayList;
import java.util.Iterator;

//----增强for循环
class MyList implements Iterable<String>{
	
	ArrayList<Object> list=new ArrayList<Object>();
	public void add(Object o) {
		list.add(o);
	}
	public int getLength() {
		
		return list.size();
	}
	@Override
	public Iterator<String> iterator() {//匿名内部类
		
		return new Iterator<String>() {
			int cursor=0;
			@Override
			public boolean hasNext() {
			
				return cursor<list.size();
			}

			@Override
			public String next() {
				
				return (String)list.get(cursor++);
			}
			
		};
	}
	
}
/*
class MyList implements Iterable<String>{
	
	Object[] arr=new Object[10];
	int index=0;
	public void add(Object o) {
		arr[index++]=o;
	}
	public int length() {
		return index;
	}

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<String>() {
			int cursor;
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return cursor<index;
			}

			@Override
			public String next() {
				// TODO Auto-generated method stub
				return (String)arr[cursor++];
			}};
	}
	
}*/

public class Demo3 {

	public static void main(String[] args) {
		MyList list=new MyList();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		list.add("赵六");
		for(String temp:list) {
			System.out.println("元素："+temp);
		}
	}
}
