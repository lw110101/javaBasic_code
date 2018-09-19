package list;

import java.util.LinkedList;

//机试题：用LinkedList模拟堆栈与队列数据结构存储方式
//------堆栈数据结构：先进后出-------------
class StackList{
	LinkedList<Object> list;
	public StackList() {
		list=new LinkedList<Object>();
	}
	
	public void add(Object obj) {
		list.push(obj);
	}
	
	public Object pop() {
		return list.pop();
	}
	
	public int getSize() {
		return list.size();
	}
}
//------队列数据结构：先进先出-------------
class TeamList{
	LinkedList<Object> list;
	
	public TeamList(){
		list = new LinkedList<Object>();
	}
	public void add(Object obj) {
		list.offer(obj);
	}
	
	public Object remove() {
		return list.poll();
	}
	
	public int getSize() {
		return list.size();
	}
	
}

public class Demo8 {

	public static void main(String[] args) {
		//堆栈
		StackList list=new StackList();
		list.add("狗娃");
		list.add("狗剩");
		list.add("铁蛋");
		
		int size=list.getSize();
		System.out.println("堆栈的抛栈：");
		for(int i=0;i<size;i++) {
			System.out.print(list.pop()+"  ");
		}
		
		
	/*---------自己的想法----------
		LinkedList list=new LinkedList();
		list.push("1");
		list.push("2");
		list.push("3");
		
		System.out.println("堆栈存储方式--进栈："+list);
		System.out.println("堆栈存储方式--抛栈：");
		int size=list.size();
		for(int i=0;i<size;i++) {
			System.out.print(list.pop()+"  ");
		}
		
		list.offer("1");
		list.offer("2");
		list.offer("3");
		
		System.out.println("队列存储方式--进队："+list);
		System.out.println("队列存储方式--出队：");
		int size=list.size();
		for(int i=0;i<size;i++) {
			System.out.print(list.poll()+"  ");
		}*/
	}
}
