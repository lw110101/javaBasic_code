package collection;
/*
增加：
add(E e)  添加集合元素
addAll(Collection<? extends E> c)
 删除
	clear()   清除成功，返回Ture，失败返回False；
	remove(Object o) 
	removeAll(Collection<?> c)    删除交集
	retainAll(Collection<?> c)	保留交集，其他一律删除
*/
import java.util.ArrayList;
import java.util.Collection;

public class Demo2 {

	public static void main(String[] args) {
		Collection<String> c=new ArrayList<String>();
		c.add("C语言");
		c.add("数据结构");
		c.add("java");
		System.out.println("集合元素是："+c);
		
		Collection<String> c1=new ArrayList<String>();
		c1.add("VBA");
		c1.add("数据库");
		c1.add("java");
//		c.addAll(c1);
//		System.out.println("新的集合元素是："+c);
		/*
		c1.clear();
		System.out.println("集合元素是："+c1);
		
		c.remove("C语言");
		System.out.println("集合元素是："+c);
		*/
		c.removeAll(c1);
		System.out.println("新的集合元素是："+c);
		
		c.retainAll(c1);
		System.out.println("新的集合元素是："+c);
		}
}
