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
		System.out.println("��ѡ����:   ���ͼ��(A)   �鿴ͼ��(B )   �޸�ͼ��(C)  ɾ��ͼ��(D)   ������һ��(E)");
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
		System.out.println("���ͼ��");
		System.out.println("����������:");
		String bName=sc.nextLine();
		System.out.println("����������:");
		String actor=sc.nextLine();
		System.out.println("�����������:");
		String press=sc.nextLine();
		System.out.println("������۸�:");
		double price=sc.nextDouble();
		System.out.println("���������:");
		int bNo=sc.nextInt();
		sc.nextLine();
		String date=null;
		while (true) {
			System.out.println("�������������:");
			date = sc.nextLine();
			if (date.matches("yyyy-MM-dd")) {
				break;
			} else {
				System.out.println("���ڸ�ʽ���ԣ�����������!");
			}
		}
		book=new Book(bName,actor,press,price,bNo,date);
		System.out.println("������Ϣ����:"+book.toString());
		System.out.println("�Ƿ񱣴����:    (Y)��            (N)��");
		String option=sc.nextLine();
		if("y".equalsIgnoreCase(option)) {
			list.add(book);
			System.out.println("��ӳɹ�!");
		}else if("n".equalsIgnoreCase(option)) {
			System.out.println("���ʧ��");
		}
	}
	//���۸�����(A)   ����������(B)   ����������(C)   ������һ��(E)
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
		System.out.println("��ѡ��鿴��ʽ:   ���۸�����(A)   ����������(B)   ����������(C)   ������һ��(E)");
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
		list.add(new Book("java�������","��Ծƽ","�廪��ѧ������",39.5,9787302,"2010-1-1"));
		list.add(new Book("��������ԭ��","��˷��","�ߵȽ���������",43.0,9787040,"1996-6-7"));
		list.add(new Book("����ϵͳ","�÷","���մ�ѧ������",39.8,9787811,"2013-8-1"));
		list.add(new Book("c�������","̷��ǿ","�廪��ѧ������",33.5,9787452,"2010-6-12"));
		list.add(new Book("�й�����ʷ","������","�人��ѧ������",31.4,9787307,"2011-5-24"));
	}

	public static void lookBook() {
		Iterator<Book> it=list.iterator();
		System.out.println("����|        |����|      |������|     |�۸�|      |���|     |��������|");
		while(it.hasNext()) {
			book=it.next();
			System.out.println(book.getbName()+"   \t"+book.getActor()+"   \t"+book.getPress()+"   \t"+
			book.getPrice()+"   \t"+book.getbNo()+"   \t"+book.getDate());
		}
	}
	
	public static void updateBook() {
		System.out.println("������Ҫ�޸ĵ����:");
		int bNo = sc.nextInt();
		sc.nextLine();
		Iterator<Book> it = list.iterator();
		System.out.println("����|    |����|      |������|     |�۸�|      |���|     |��������|");
		while (it.hasNext()) {
			book = it.next();
			if (bNo == book.getbNo()) {
				System.out.println(book.getbName() + "   \t" + book.getActor() + "   \t" + book.getPress() + "   \t"
						+ book.getPrice() + "   \t" + book.getbNo() + "   \t" + book.getDate());
			}
		}
		System.out.println("��ѡ��Ҫ�޸ĵ�����:   �����޸�(A)   �����޸�(B)   �������޸�(C)  �۸��޸�(D)  ����޸�(E)  ��������(F)  ������һ��(G)");
		String option = sc.nextLine();
		if ("a".equalsIgnoreCase(option)) {
			System.out.println("������Ҫ�޸ĵ�����:");
			String bName=sc.nextLine();
			book.setbName(bName);
		} else if ("b".equalsIgnoreCase(option)) {
			System.out.println("������Ҫ�޸ĵ�����:");
			String actor=sc.nextLine();
			book.setActor(actor);
		} else if ("c".equalsIgnoreCase(option)) {
			System.out.println("������Ҫ�޸ĵĳ�����:");
			String press=sc.nextLine();
			book.setPress(press);
		} else if ("d".equalsIgnoreCase(option)) {
			System.out.println("������Ҫ�޸ĵļ۸�:");
			Double price=sc.nextDouble();
			book.setPrice(price);
		} else if ("e".equalsIgnoreCase(option)) {
			System.out.println("������Ҫ�޸ĵ����:");
			int bno=sc.nextInt();
			sc.hasNextLine();
			book.setbNo(bno);
		} else if ("f".equalsIgnoreCase(option)) {
			System.out.println("������Ҫ�޸ĵ� ��������:");
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
		System.out.println("������Ҫɾ���Ĳ���:   ������ɾ��(A)   ������ɾ��(B)   �����ɾ��(C)   ������һ��(E)");
		String option=sc.nextLine();
		if ("a".equalsIgnoreCase(option)) {
			System.out.println("����������:");
			String bName = sc.nextLine();
			deleteBook(bName,book.getbName());
		} else if ("b".equalsIgnoreCase(option)) {
			System.out.println("����������:");
			String actor= sc.nextLine();
			deleteBook(actor,book.getActor());
		}else if("c".equalsIgnoreCase(option)) {
			System.out.println("���������");
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
		System.out.println("�Ƿ�ȷ��ɾ��:  (Y)��        (N)��");
		String section=sc.nextLine();
		if("y".equalsIgnoreCase(section)) {
			list.remove(book);
			System.out.println("ɾ���ɹ�!");
		}else if("n".equalsIgnoreCase(section)) {
			System.out.println("ɾ��ʧ��!");
		}
	}

	public static void deleteBook(String profile, String str) {
		Iterator<Book> it = list.iterator();
		System.out.println("����|    |����|      |������|     |�۸�|      |���|     |��������|");
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
		System.out.println("����|    |����|      |������|     |�۸�|      |���|     |��������|");
		while (it.hasNext()) {
			book = it.next();
			if (profile == num) {
				System.out.println(book.getbName() + "   \t" + book.getActor() + "   \t" + book.getPress() + "   \t"
						+ book.getPrice() + "   \t" + book.getbNo() + "   \t" + book.getDate());
			}
		}
	}
}

