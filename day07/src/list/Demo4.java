package list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//迭代元素注意事项。
public class Demo4 {
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		
		ListIterator<String> lit=list.listIterator();
		/*while(lit.hasNext()){
			System.out.print(lit.next()+"  ");
			//lit.add("赵六");
			//list.add("abc");  不允许的
			//lit.set("赵六");
			list.set(1,"陈七");
		}*/
		
		lit.next();   //位置一换就出错
		list.add("赵六");
		System.out.println("\r\n集合元素："+list);
	}
}
