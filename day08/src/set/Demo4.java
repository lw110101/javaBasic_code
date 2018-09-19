package set;

import java.util.TreeSet;
//按自然顺序排序输出
public class Demo4 {

	public static void main(String[] args) {
		TreeSet<String> tree=new TreeSet<String>();
		/*
		tree.add(31);
		tree.add(21);
		tree.add(17);
		tree.add(47);
		tree.add(19);
		System.out.println(tree);
		*/
    	/*	
		tree.add('a');
		tree.add('z');
		tree.add('r');
		tree.add('g');
		System.out.println(tree);
		
		tree.add("中国");
		tree.add("英国");
		tree.add("美国");
		tree.add("江西");
		tree.add("日本");
		System.out.println(tree);
		*/
		tree.add("赵");
		tree.add("钱");
		tree.add("李");
		tree.add("孙");
		tree.add("刘");
		System.out.println(tree);
	}
}
