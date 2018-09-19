package jdk15;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo9
{
	
	 public static void main(String[] args) {
		 	List<String> list = new ArrayList<String>();
			list.add("1");
			list.add("4");
			list.add("2");
			list.add("7");
			
			// 因为2是最后一个元素了，也就是删除后 没有在调用了迭代器的next方法。
			Iterator<String> it = list.iterator();
			while(it.hasNext()){
				String s = it.next();
				if("1".equals(s)){
					list.remove("1");
					break;
				}
			}
			System.out.println(list);
		}

}
