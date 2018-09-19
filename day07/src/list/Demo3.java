package list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//三种方法遍历集合
public class Demo3 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		list.add("赵六");
		list.add("王麻子");
		list.add("陈狗蛋");
		
		//方法一：
		System.out.println("==============get方法遍历==========");
		for(int i=0;i<list.size();i++){
			list.get(i);
			
			System.out.print(list.get(i)+"  ");
		}
		
		//方法二：
		System.out.println("\r\n===========迭代器顺序遍历===============");
		ListIterator<String> lit=list.listIterator();
		while(lit.hasNext()){
			
			System.out.print(lit.next()+"  ");
		}
		
		
		//方法三：
		System.out.println("\r\n===========迭代器逆序遍历=============");
		while(lit.hasPrevious()){
			
			System.out.print(lit.previous()+"  ");
		}
		
		//方法四：
		System.out.println("\r\n==========增强for()方法遍历============");
		for(Object o:list) {
			System.out.print(o+"  ");
		}
		
	}
}
