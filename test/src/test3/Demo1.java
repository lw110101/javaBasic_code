package test3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//����һ��ArrayList���ϣ��洢һ���鼮���鼮����������
//���ߡ��۸��������ԣ�����¼��һ������ʱ����ʾ���鼮����ϸ��Ϣ��
class Book{
	
	String bName;
	
	String actor;
	
	Double price;

	public Book(String bName, String actor, Double price) {
		this.bName = bName;
		this.actor = actor;
		this.price = price;
	}
	@Override
	public String toString() {
		
		return "����:"+this.bName+"  ����:"+this.actor+"  ��Ǯ:"+this.price;
	}	
}

public class Demo1 {

	public static void main(String[] args) {
		
		ArrayList<Book> list = new ArrayList<Book>();
		Scanner sc = new Scanner(System.in);

		list.add(new Book("java�������", "С��", 12.6));
		list.add(new Book("���ݽṹ", "С��", 24.1));
		list.add(new Book("c����", "С��", 15.5));
		list.add(new Book("XTML", "С��", 18.7));

		System.out.println("����������:");
		String bName = sc.nextLine();
		//   ----ȱ�ݣ����鼮�����ڣ�û�з�����Ϣ
		Iterator<Book> it = list.iterator();
		int count=0;
		while (it.hasNext()) {
			Book b = it.next();
			if (b.bName.equals(bName)) {
				System.out.println(b);
			}else {
				count++;
			}
			sc.close();
		}
		if(count==list.size()) {
			System.out.println("���鼮������!");
		}

	}
}
