package review;

import java.util.Scanner;
import java.util.TreeMap;

/*
	2.����һ���ַ���������ĸ˳��ͳ�Ƹ���ĸ���ֵĴ���
*/
public class Demo2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("������һ���ַ���:");
		
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
