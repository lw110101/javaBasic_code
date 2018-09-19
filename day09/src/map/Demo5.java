package map;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TreeMap;

class Book implements Comparable<Book>{
	
	String bName;
	String date;
	public Book(String bName,String date) {
		this.bName=bName;
		this.date=date;
	}
	
	public String toString() {
		return "[书名:"+bName+"  出版日期:"+date+"]";
	}
	/*//借助字符串的compareTo方法比较。
	public int compareTo(Book o) {
		return this.date.compareTo(o.date);
	}
	*/
	//使用日期格式化类将日期转化为Date对象
	public int compareTo(Book o) {
		SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd");
		Date date1=null;
		Date date2=null;
		try {
			date1=dateformat.parse(this.date);
			date2=dateformat.parse(o.date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date1.compareTo(date2);
		
	}
}

public class Demo5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		TreeMap<Book,String> tree=new TreeMap<Book,String>();
		int i=0;
		System.out.println("请输入要添加的书本数:");
		int count=sc.nextInt();
		sc.nextLine();
		while(i<count) {
			System.out.println("请输入书名:");
			String name=sc.nextLine();
			System.out.println("请输入出版日期:");
			String date=sc.nextLine();
			System.out.println("请输入作者:");
			String author=sc.nextLine();
			Book b=new Book(name,date);
			tree.put(b,author);
			i++;	
		}
		sc.close();
		System.out.println("集合元素是:"+"\r\n"+tree);
	}
}
