package genrictiry;

import java.util.ArrayList;
/*
ArrayList<String> list=new ArrayList<String>();  true
ArrayList<String> list=new ArrayList<Object>();  false
ArrayList<Object> list=new ArrayList<String>();  false
ArrayList         list=new ArrayList<String>();  true    ����ǿ������ת��
ArrayList<String> list=new ArrayList();   true    ����ǿת
//����
*/public class Demo1 {

	public static void main(String[] args) {
		//ArrayList<String> list=new ArrayList<String>();
		ArrayList<String> list=new ArrayList<String>();
		list.add("abc");
		list.add("opq");
		list.add("wyz");
		//list.add(123);
		for(int i=0;i<list.size();i++) {
			String str=list.get(i);
			//String str=(String)list.get(i);
			System.out.println("��д��"+str.toUpperCase());
		}
	}
}
