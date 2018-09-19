package set;

import java.util.Iterator;
//小练习：对字符串的数值进行排序  String str="15 8 10 2 7";
import java.util.TreeSet;
//字符串是可以比较排序的。

public class Demo6 {

	public static void main(String[] args) {
		/*
		TreeSet tree=new TreeSet();
		tree.add("abcccc");
		tree.add("abw");
		System.out.println(tree);
		System.out.println("fedcba".compareTo("abcdef"));
		*/
		TreeSet<Integer> tree=new TreeSet<Integer>();
		String str="15 8 10 2 7";
		String[] arr=str.split(" ");
		for(int i=0;i<arr.length;i++) {
			tree.add(Integer.parseInt(arr[i]));  //字符串转Int数据，要使用Integer.parseInt();
		}
		
		Iterator<Integer> it=tree.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}
	
}
