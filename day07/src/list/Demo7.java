package list;

import java.util.Iterator;
import java.util.LinkedList;

/*LinkedList的特有方法：
		1：方法介绍
			addFirst(E e) 
			addLast(E e) 
		-----------------
			getFirst() 
			getLast() 
		-----------------
			removeFirst() 
			removeLast() 
			如果集合中没有元素，获取或者删除元素抛：NoSuchElementException
		2：数据结构
			1：栈 （1.6）
				先进后出
				push() 
				pop()
			2：队列（双端队列1.5）
				先进先出
				offer()
				poll()
		3：返回逆序的迭代器对象      
			descendingIterator()   返回逆序的迭代器对象*/
public class Demo7 {

	public static void main(String[] args) {
		LinkedList<Student> list=new LinkedList<Student>();
		list.add(new Student("陈七",110));
		list.add(new Student("赵六",120));
		list.add(new Student("王五",130));
		/*
		list.addFirst("狗剩");
		list.addLast("狗蛋");
		
		System.out.println("移除并返回第一个元素："+list.removeFirst());
		System.out.println("移除并返回最后一个元素："+list.removeLast());
		
		System.out.println("获取第一个元素："+list.getFirst());
		System.out.println("获取最后一个元素："+list.getLast());
		
		list.push("铁蛋");   //添加元素到首位置
		System.out.println("集合："+list);
		System.out.println("移除并返回首元素："+list.pop());   //移除 并返回首元素
		
		list.offer("李四");
		System.out.println("集合："+list);   //添加元素到末尾
		System.out.println("移除并返回首元素："+list.poll());     //移除 并返回首元素
		*/
		Iterator<Student> it=list.descendingIterator();
		while(it.hasNext()) {
		
			System.out.print(it.next()+"  ");
		}
	}
}
