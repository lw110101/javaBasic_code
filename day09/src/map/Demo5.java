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
		return "[����:"+bName+"  ��������:"+date+"]";
	}
	/*//�����ַ�����compareTo�����Ƚϡ�
	public int compareTo(Book o) {
		return this.date.compareTo(o.date);
	}
	*/
	//ʹ�����ڸ�ʽ���ཫ����ת��ΪDate����
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
		System.out.println("������Ҫ��ӵ��鱾��:");
		int count=sc.nextInt();
		sc.nextLine();
		while(i<count) {
			System.out.println("����������:");
			String name=sc.nextLine();
			System.out.println("�������������:");
			String date=sc.nextLine();
			System.out.println("����������:");
			String author=sc.nextLine();
			Book b=new Book(name,date);
			tree.put(b,author);
			i++;	
		}
		sc.close();
		System.out.println("����Ԫ����:"+"\r\n"+tree);
	}
}
