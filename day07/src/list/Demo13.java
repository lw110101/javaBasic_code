package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo13 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> list1=new ArrayList<Integer>();
		Random ran=new Random();
		for(int i=0;i<10;i++) {
			list.add(ran.nextInt(8));
		}
		System.out.println(list);
		System.out.println("删除6后的元素是：");
		for(int i=0;i<list.size();i++) {
			int a=(int)list.get(i);
			if(a==6) {
			list1.add(a);
			}
			/*if(a!=6) {
				System.out.print(a+"  ");
			}*/
		}
		list.removeAll(list1);
		System.out.println(list);
	}
}
