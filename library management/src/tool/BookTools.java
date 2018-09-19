package tool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import user_book.User;
import user_book.Book;
public class BookTools {

	private static ArrayList<Book> list=new ArrayList<Book>();
	static Scanner sc=new Scanner(System.in);
	static Book book=null;
	static User user=null;
	public static void addBook() {
		gainBook();
		System.out.println("请选择功能:   添加图书(A)   查看图书(B )   修改图书(C)  删除图书(D)   返回上一级(E)");
		String option=sc.nextLine();
		if("a".equalsIgnoreCase(option)) {
			gainBook();
		}else if("b".equalsIgnoreCase(option)) {
			selectBook();
		}else if("c".equalsIgnoreCase(option)) {
			updateBook();
		}else if("d".equalsIgnoreCase(option)) {
			delete();
		}else if("e".equalsIgnoreCase(option)) {
			if(user.getAcounts().equals("admin")) {
				UserTools.adminLogin();
			}else {
				UserTools.commonLogin();
			}
			
		}
	}
	
	public static void gainBook() {
		System.out.println("添加图书");
		System.out.println("请输入书名:");
		String bName=sc.nextLine();
		System.out.println("请输入作者:");
		String actor=sc.nextLine();
		System.out.println("请输入出版社:");
		String press=sc.nextLine();
		System.out.println("请输入价格:");
		double price=sc.nextDouble();
		System.out.println("请输入书号:");
		int bNo=sc.nextInt();
		sc.nextLine();
		String date=null;
		while (true) {
			System.out.println("请输入出版日期:");
			date = sc.nextLine();
			if (date.matches("yyyy-MM-dd")) {
				break;
			} else {
				System.out.println("日期格式不对，请重新输入!");
			}
		}
		book=new Book(bName,actor,press,price,bNo,date);
		System.out.println("新书信息如下:"+book.toString());
		System.out.println("是否保存该书:    (Y)是            (N)否");
		String option=sc.nextLine();
		if("y".equalsIgnoreCase(option)) {
			list.add(book);
			System.out.println("添加成功!");
		}else if("n".equalsIgnoreCase(option)) {
			System.out.println("添加失败");
		}
	}
	//按价格排序(A)   按作者排序(B)   按出版日期(C)   返回上一级(E)
	static 
	class Mycomparator1 implements Comparator<Book> {

		public int compare(Book o1, Book o2) {

			return (int) (o1.getPrice() - o2.getPrice());
		}
	}
	static 
	class Mycomparator2 implements Comparator<Book> {

		public int compare(Book o1, Book o2) {

			return o1.getActor().compareTo(o2.getActor());
		}
	}
	static 
	class Mycomparator3 implements Comparator<Book> {

		public int compare(Book o1, Book o2) {

			return o1.getDate().compareTo(o2.getDate());
		}
	}
	
	public static void selectBook() {
		startBook();
		lookBook();
		System.out.println("请选择查看方式:   按价格排序(A)   按作者排序(B)   按出版日期(C)   返回上一级(E)");
		String option = sc.nextLine();
		if ("a".equalsIgnoreCase(option)) {
			Collections.sort(list, new Mycomparator1());
			lookBook();
		} else if ("b".equalsIgnoreCase(option)) {
			Collections.sort(list, new Mycomparator2());
			lookBook();
		} else if ("c".equalsIgnoreCase(option)) {
			Collections.sort(list, new Mycomparator3());
			lookBook();
		} else if ("e".equalsIgnoreCase(option)) {
			if (user.getAcounts().equals("admin")) {
				UserTools.adminLogin();
			} else {
				UserTools.commonLogin();
			}
		}
	}

	public static void startBook() {
		list.add(new Book("java面向对象","张跃平","清华大学出版社",39.5,9787302,"2010-1-1"));
		list.add(new Book("计算机组成原理","唐朔飞","高等教育出版社",43.0,9787040,"1996-6-7"));
		list.add(new Book("操作系统","李冬梅","江苏大学出版社",39.8,9787811,"2013-8-1"));
		list.add(new Book("c程序设计","谭浩强","清华大学出版社",33.5,9787452,"2010-6-12"));
		list.add(new Book("中国教育史","曲铁华","武汉大学出版社",31.4,9787307,"2011-5-24"));
	}

	public static void lookBook() {
		Iterator<Book> it=list.iterator();
		System.out.println("书名|        |作者|      |出版社|     |价格|      |书号|     |出版日期|");
		while(it.hasNext()) {
			book=it.next();
			System.out.println(book.getbName()+"   \t"+book.getActor()+"   \t"+book.getPress()+"   \t"+
			book.getPrice()+"   \t"+book.getbNo()+"   \t"+book.getDate());
		}
	}
	
	public static void updateBook() {
		System.out.println("请输入要修改的书号:");
		int bNo = sc.nextInt();
		sc.nextLine();
		Iterator<Book> it = list.iterator();
		System.out.println("书名|    |作者|      |出版社|     |价格|      |书号|     |出版日期|");
		while (it.hasNext()) {
			book = it.next();
			if (bNo == book.getbNo()) {
				System.out.println(book.getbName() + "   \t" + book.getActor() + "   \t" + book.getPress() + "   \t"
						+ book.getPrice() + "   \t" + book.getbNo() + "   \t" + book.getDate());
			}
		}
		System.out.println("请选择要修改的属性:   书名修改(A)   作者修改(B)   出版社修改(C)  价格修改(D)  书号修改(E)  出版日期(F)  返回上一级(G)");
		String option = sc.nextLine();
		if ("a".equalsIgnoreCase(option)) {
			System.out.println("请输入要修改的书名:");
			String bName=sc.nextLine();
			book.setbName(bName);
		} else if ("b".equalsIgnoreCase(option)) {
			System.out.println("请输入要修改的作者:");
			String actor=sc.nextLine();
			book.setActor(actor);
		} else if ("c".equalsIgnoreCase(option)) {
			System.out.println("请输入要修改的出版社:");
			String press=sc.nextLine();
			book.setPress(press);
		} else if ("d".equalsIgnoreCase(option)) {
			System.out.println("请输入要修改的价格:");
			Double price=sc.nextDouble();
			book.setPrice(price);
		} else if ("e".equalsIgnoreCase(option)) {
			System.out.println("请输入要修改的书号:");
			int bno=sc.nextInt();
			sc.hasNextLine();
			book.setbNo(bno);
		} else if ("f".equalsIgnoreCase(option)) {
			System.out.println("请输入要修改的 出版日期:");
			String date=sc.nextLine();
			book.setDate(date);
		} else if ("g".equalsIgnoreCase(option)) {
			if(user.getAcounts().equals("admin")) {
				UserTools.adminLogin();
			}else {
				UserTools.commonLogin();
			}
		}
	}

	public static void delete() {
		System.out.println("请输入要删除的操作:   按书名删除(A)   按作者删除(B)   按书号删除(C)   返回上一级(E)");
		String option=sc.nextLine();
		if ("a".equalsIgnoreCase(option)) {
			System.out.println("请输入书名:");
			String bName = sc.nextLine();
			deleteBook(bName,book.getbName());
		} else if ("b".equalsIgnoreCase(option)) {
			System.out.println("请输入作者:");
			String actor= sc.nextLine();
			deleteBook(actor,book.getActor());
		}else if("c".equalsIgnoreCase(option)) {
			System.out.println("请输入书号");
			int bNo=sc.nextInt();
			sc.nextLine();
			deleteBook(bNo,book.getbNo());
		}else if("e".equalsIgnoreCase(option)) {
			if(user.getAcounts().equals("admin")) {
				UserTools.adminLogin();
			}else {
				UserTools.commonLogin();
			}
		}
		System.out.println("是否确定删除:  (Y)是        (N)否");
		String section=sc.nextLine();
		if("y".equalsIgnoreCase(section)) {
			list.remove(book);
			System.out.println("删除成功!");
		}else if("n".equalsIgnoreCase(section)) {
			System.out.println("删除失败!");
		}
	}

	public static void deleteBook(String profile, String str) {
		Iterator<Book> it = list.iterator();
		System.out.println("书名|    |作者|      |出版社|     |价格|      |书号|     |出版日期|");
		while (it.hasNext()) {
			book = it.next();
			if (profile.equals(str)) {
				System.out.println(book.getbName() + "   \t" + book.getActor() + "   \t" + book.getPress() + "   \t"
						+ book.getPrice() + "   \t" + book.getbNo() + "   \t" + book.getDate());
			}
		}
	}

	public static void deleteBook(int profile, int num) {
		Iterator<Book> it = list.iterator();
		System.out.println("书名|    |作者|      |出版社|     |价格|      |书号|     |出版日期|");
		while (it.hasNext()) {
			book = it.next();
			if (profile == num) {
				System.out.println(book.getbName() + "   \t" + book.getActor() + "   \t" + book.getPress() + "   \t"
						+ book.getPrice() + "   \t" + book.getbNo() + "   \t" + book.getDate());
			}
		}
	}
}

