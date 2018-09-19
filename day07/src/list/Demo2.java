package list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*迭代：
ListIterator<E> listIterator() 
ListIterator特有的方法：
	add(E e)   添加元素到当前指针位置
	set(E e)    替换迭代器最后一次返回的元素。
---------------------
	hasPrevious()
	previous()
*/
public class Demo2 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		list.add("赵六");
		System.out.println("初始集合元素是："+list);
		
		ListIterator<String> lit=list.listIterator();
		/*lit.next();
		System.out.println("有前一个元素吗？"+lit.hasPrevious());
		System.out.println("前一个元素是："+lit.previous());*/
		
		/*while(lit.hasNext()){    //死循环
			lit.next();
			System.out.println("当前元素是："+lit.previous());
		}*/
		
		/*while(lit.hasNext()){
			lit.next();
		}
		while(lit.hasPrevious()){
			System.out.println("当前元素是："+lit.previous());
		}
		*/
		lit.next();
		lit.next();
		lit.set("陈七");
		System.out.println("set后的元素是："+list);
		
		lit.add("王麻子");
		System.out.println("add后集合元素是："+list);
		
		
	}
}
