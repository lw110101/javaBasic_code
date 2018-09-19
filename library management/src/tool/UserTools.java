package tool;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import user_book.User;

public class UserTools {

	private static ArrayList<User> list=new ArrayList<User>();
	static Scanner sc=new Scanner(System.in);
	static User user=null;
	
	public static void reg() {

		System.out.println("ע�����û�");
		while (true) {
			System.out.println("�������û���:");
			String acounts = sc.nextLine();
			String reg1 = "[a-zA-Z1-9][a-zA-Z0-9]{4,8}";
			user = new User(acounts, null);
			if (acounts.matches(reg1)) {
				if (list.contains(user)) {
					System.out.println("���ʺ��Ѵ��ڣ�����������!");
				} else {
					break;
				}
			} else {
				System.out.println("�û����Ƿ����룬����������!");
			}
		}
		while (true) {
			System.out.println("����������:");
			String password = sc.nextLine();
			String reg2 = "\\w{8,12}";
			if (password.matches(reg2)) {
				user.setPassword(password);
				list.add(user);
				break;
			} else {
				System.out.println("����Ƿ����룬����������!");
			}
		}
		System.out.println("�û�ע��ɹ�!");
		System.out.println(list);
	}

	public static void login() {
		list.add(new User("admin","12345678"));
		System.out.println("�û���¼");
		boolean flag = false;
		out: while (true) {
			System.out.println("�������û���:");
			String acounts = sc.nextLine();
			System.out.println("����������:");
			String password = sc.nextLine();
			Iterator<User> it = list.iterator();
			while (it.hasNext()) {
				user = it.next();
				if (user.getAcounts().equals(acounts) && user.getPassword().equals(password)
						&& acounts.equals("admin")) {
					flag = true;
					break out;
				} else if (user.getAcounts().equals(acounts) && user.getPassword().equals(password)) {
					flag = false;
					break out;
				}
			} 
			System.out.println("�ʺ������������������!");
		}
		if (flag) {
			System.out.println("��ӭ����Աadmin!");
			adminLogin();
		} else {
			System.out.println("��ӭ" + user.getAcounts() + "��¼!");
			commonLogin();
		}

	}

	public static void commonLogin() {
		System.out.println(
				"��ѡ����:  ���ͼ��(A)  �鿴ͼ��(B )  �޸�ͼ��(C)  ɾ��ͼ��(D)  �޸��û���(E) " 
						+ "�޸�����(F)   �޸��û�(G)   �鿴�����û�(I)   ע��(Q)");
		String option = sc.nextLine();
		if ("a".equalsIgnoreCase(option)) {
			BookTools.addBook();
		} else if ("b".equalsIgnoreCase(option)) {
			BookTools.selectBook();
		} else if ("c".equalsIgnoreCase(option)) {
			BookTools.updateBook();
		} else if ("d".equalsIgnoreCase(option)) {
			BookTools.delete();
		} else if ("e".equalsIgnoreCase(option)) {
			updateAcounts();
		} else if ("f".equalsIgnoreCase(option)) {
			updatePassword();
		} else if ("g".equalsIgnoreCase(option)) {
			updateUser();
		} else if ("i".equalsIgnoreCase(option)) {
			selectUser();
		} else if ("q".equalsIgnoreCase(option)) {
			login();
		}
	}

	public static void adminLogin() {
		System.out.println("��ѡ����:  ���ͼ��(A)  �鿴ͼ��(B )  �޸�ͼ��(C)  ɾ��ͼ��(D)  �޸��û���(E) "
				+ "�޸�����(F)   �޸��û�(G)   ɾ���û�(H)   �鿴�����û�(I)   ע��(Q)");
		String option = sc.nextLine();
		if ("a".equalsIgnoreCase(option)) {
			BookTools.addBook();
		} else if ("b".equalsIgnoreCase(option)) {
			BookTools.selectBook();
		} else if ("c".equalsIgnoreCase(option)) {
			BookTools.updateBook();
		} else if ("d".equalsIgnoreCase(option)) {
			BookTools.delete();
		} else if ("e".equalsIgnoreCase(option)) {
			updateAcounts();
		} else if ("f".equalsIgnoreCase(option)) {
			updatePassword();
		} else if ("g".equalsIgnoreCase(option)) {
			updateUser();
		} else if ("h".equalsIgnoreCase(option)) {
			deleteUser();
		} else if ("i".equalsIgnoreCase(option)) {
			selectUser();
		} else if ("Q".equalsIgnoreCase(option)) {
			login();
		}
	}

	public static void updateAcounts() {
		System.out.println("�޸��û���");
		System.out.println("������Ҫ���޸ĵ��û���:");
		String acount = sc.nextLine();
		System.out.println("�������޸ĵ��û���:");
		String acounts = sc.nextLine();
		Iterator<User> it = list.iterator();
		while (it.hasNext()) {
			user = it.next();
			if (user.getAcounts().equals(acount)) {
				user.setAcounts(acounts);
			}
		}
		System.out.println("�޸ĺ���û���:" + user);
	}

	public static void updatePassword() {
		System.out.println("�޸�����");
		while (true) {
			System.out.println("������Ҫ���޸ĵ��û���������:");
			String acount = sc.nextLine();
			String password = sc.nextLine();
			user = new User(acount, password);
			System.out.println("�������޸ĵ�����:");
			String passwords = sc.nextLine(); 
			if (list.contains(user)) {
				user.setPassword(passwords);
				break;
			} else {
				System.out.println("���û��������벻����,����������!");
			}
		}
		System.out.println("�޸ĺ���û���:" + user);
	}

	public static void updateUser() {
		System.out.println("�޸��û�");
		System.out.println("������Ҫ�޸ĵ��û���:");
		String acount = sc.nextLine();
		System.out.println("������Ҫ�޸ĵ�����:");
		String password = sc.nextLine();
		user.setAcounts(acount);
		user.setPassword(password);
	}
	
	public static void deleteUser() {
		System.out.println("ɾ���û�");
		System.out.println("������Ҫ��ɾ�����û���:");
		String acount=sc.nextLine();
		Iterator<User> it=list.iterator();
		while(it.hasNext()) {
			user=it.next();
			if(user.getAcounts().equals(acount)) {
				it.remove();
			}
		}
	}

	public static void selectUser() {
		System.out.println("�鿴�����û�");
		System.out.println(list);
	}
}
