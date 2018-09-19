package Collections_Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Collections：常见方法：
	1.对list进行二分查找：(前提该集合一定要有序.)	
		int binarySearch(list,key);
	1>. 必须根据元素自然顺序对列表进行升级排序
	2>. 要求list 集合中的元素都是Comparable 的子类。
		int binarySearch(list,key,Comparator);
	
	2.对list集合进行排序。
		sort(list); 
	 . 对list进行排序,其实使用的是list容器中的对象的compareTo方法
		sort(list,comaprator);
	     . 如果不具备自然顺序，要传入自定义比较规则的比较器进行排序
	
	3.对集合取最大值或者最小值。
		max(Collection)
		max(Collection,comparator)
		min(Collection)
		min(Collection,comparator)
	
	4.对list集合进行反转。
		reverse(list);
	
	5.可以将不同步的集合变成同步的集合。
		Set synchronizedSet(Set<T> s)
		Map synchronizedMap(Map<K,V> m)
		List synchronizedList(List<T> list)
	*/
public class Demo1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(5);
		list.add(2);
		list.add(32);
		list.add(15);
		
		Collections.sort(list);
		System.out.println("查找元素的索引值是:"+Collections.binarySearch(list, 15));
		System.out.println("集合的最大值是:"+Collections.max(list));
		System.out.println("集合的最小值是:"+Collections.min(list));
		System.out.println("集合元素是:"+list);
		Collections.reverse(list);
		System.out.println("反转后的集合是:"+list);
		List<Integer> list1=Collections.synchronizedList(list);
		System.out.println(list1);
	}
}
