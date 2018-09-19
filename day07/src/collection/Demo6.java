package collection;

import java.util.*;
/*迭代
 toArray()
iterator()
迭代器的方法：
hasNext()
next()
remove()
 */
 

public class Demo6 {
	
	public static void main(String[] args) {
		Collection<String> c=new ArrayList<String>();
		c.add("狗剩");
		c.add("狗娃");
		c.add("铁蛋");
		c.add("肥喵");
		
		//toArray()遍历集合
		Object[] arr=c.toArray();
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		
		//iterator()遍历集合元素
		Iterator<String> it=c.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+"  ");
		}
		System.out.println();
		System.out.println(c);
		
		/*remove用法
		it.next();
		it.remove();
		System.out.println(c);
		*/
	}
}
