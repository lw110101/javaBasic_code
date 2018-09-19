package collection;

import java.util.Arrays;

/* Collection接口中的方法：
  增加：
	add(E e)
	addAll(Collection<? extends E> c)
  删除
	clear() 
	remove(Object o) 
	removeAll(Collection<?> c)
	retainAll(Collection<?> c)	
  查看:
	size() 
  迭代：
	toArray()
	iterator() 
  判断：
	contains(Object o)
	containsAll(Collection<?> c)
	isEmpty()
 
集合比数组的优势：
1.集合可以存储任意类型的对象数据，数组只能存储同一种数据类型的数据。
2.集合的长度是会发生变化的，数组是固定的。
*/
public class Demo1 {

		public static void main(String[] args) {
			Object[] arr=new Object[10];
			arr[0]="abc";
			arr[1]=13;
			arr[2]=new Object();
			System.out.println(Arrays.toString(arr));
		}
}
