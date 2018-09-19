package genrictiry;

import java.util.ArrayList;
import java.util.Collection;
//import java.util.HashSet;
import java.util.LinkedList;

/*//泛型的上下限
需求1： 定义一个函数可以接收接收任意类型的集合对象， 要求接收的集合对象只能存储Integer或者是Integer的父类类型数据。

需求2： 定义一个函数可以接收接收任意类型的集合对象， 要求接收的集合对象只能存储Number或者是Number的子类类型数据。
*/
public class Demo5 {

	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<Integer>();
		//HashSet<String> set=new HashSet<String>();
		LinkedList<Integer> list2=new LinkedList<Integer>();
		getBate(list1);
		getBate(list2);  //getBate(set);---不可以
		
		getBata(list1);
		getBata(list2);   //getBata(set);---不可以
	}
	//泛型下限
	public static void getBate(Collection<? super Integer> c) {
		
	}
	//泛型上限
	public static void getBata(Collection<? extends Number> c) {
		
	}
}
