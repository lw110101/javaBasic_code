package list;

import java.util.ArrayList;
import java.util.List;

/*List接口特有方法：
添加：
	void add(int index, E element)
	boolean addAll(int index, Collection<? extends E> c)

获取：
	E get(int index) 
	int indexOf(Object o)  
	int lastIndexOf(Object o)  
	List<E> subList(int fromIndex, int toIndex) 

修改：
	E set(int index, E element)

*/
public class Demo1 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		list.add("赵六");
		list.add("李四");
		
		/*添加
		List list1=new ArrayList();
		list1.add("王麻子");
		list1.add("陈狗蛋");
		
		list.add(2, "陈七");
		System.out.println("元素是："+list);
		list.addAll(3,list1);
		System.out.println("集合元素是："+list);*/
		
		/*获取
		System.out.println("当前元素是："+list.get(2));
		System.out.println("当前元素第一次出现的索引值是："+list.indexOf("陈七"));//不存在返回-1
		System.out.println("当前元素最后出现的位置是："+list.lastIndexOf("李四"));
		List sublist=list.subList(1, 3);
		System.out.println("截取的元素是："+sublist);//包头不包尾
		 */	
		//修改
		list.set(2, "王麻子");
		System.out.println("集合元素是："+list);
	}
}
