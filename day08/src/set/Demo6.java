package set;

import java.util.Iterator;
//С��ϰ�����ַ�������ֵ��������  String str="15 8 10 2 7";
import java.util.TreeSet;
//�ַ����ǿ��ԱȽ�����ġ�

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
			tree.add(Integer.parseInt(arr[i]));  //�ַ���תInt���ݣ�Ҫʹ��Integer.parseInt();
		}
		
		Iterator<Integer> it=tree.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}
	
}
