package review;

import java.util.Scanner;
import java.util.TreeMap;

/*
	2.输入一个字符串，按字母顺序统计各字母出现的次数
*/
public class Demo2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("请输入一段字符串:");
		
		String line=sc.next();
		
		char[] arr=line.toCharArray();
		
		TreeMap<Character,Integer> map=new TreeMap<Character,Integer>(); 

		for (char a : arr) {
			
			if (map.containsKey(a)) {
			
				Integer count = map.get(a);
		
				map.put(a, count + 1);
			
			} else {
			
				map.put(a, 1);
			}
		}
	
		System.out.println(map);
		
		sc.close();
	}
}
