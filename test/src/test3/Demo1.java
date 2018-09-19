package test3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//定义一个ArrayList集合，存储一批书籍，书籍具有书名、
//作者、价格三个属性，键盘录入一个书名时，显示该书籍的详细信息。
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
		
		return "书名:"+this.bName+"  作者:"+this.actor+"  价钱:"+this.price;
	}	
}

public class Demo1 {

	public static void main(String[] args) {
		
		ArrayList<Book> list = new ArrayList<Book>();
		Scanner sc = new Scanner(System.in);

		list.add(new Book("java面向对象", "小刘", 12.6));
		list.add(new Book("数据结构", "小李", 24.1));
		list.add(new Book("c语音", "小黄", 15.5));
		list.add(new Book("XTML", "小白", 18.7));

		System.out.println("请输入书名:");
		String bName = sc.nextLine();
		//   ----缺陷：当书籍不存在，没有返回信息
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
			System.out.println("该书籍不存在!");
		}

	}
}
