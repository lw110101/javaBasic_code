package jdk15;

import java.util.ArrayList;

//������----��ǿforѭ��    ʵ����Iterable�ӿڻ��������

class MyIterator{
	
	String name;
	int id;
	public MyIterator(String name, int id) {
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "����:"+this.name+" ���:"+this.id;
	}
	
}

public class Demo2 {

	public static void main(String[] args) {
		/*
		ArrayList<String> list=new ArrayList<String>();
		list.add("����");
		list.add("����");
		list.add("����");
		for(String temp:list) {
			System.out.print(temp+"  ");
		}
	*/
		ArrayList<MyIterator> list=new ArrayList<MyIterator>();
		list.add(new MyIterator("����",110));
		list.add(new MyIterator("��ʣ",130));
		list.add(new MyIterator("����",120));
		for(MyIterator temp:list) {
			System.out.print(temp+"  ");
		}
		
	}
	
}
