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

		System.out.println("注册新用户");
		while (true) {
			System.out.println("请输入用户名:");
			String acounts = sc.nextLine();
			String reg1 = "[a-zA-Z1-9][a-zA-Z0-9]{4,8}";
			user = new User(acounts, null);
			if (acounts.matches(reg1)) {
				if (list.contains(user)) {
					System.out.println("该帐号已存在，请重新输入!");
				} else {
					break;
				}
			} else {
				System.out.println("用户名非法输入，请重新输入!");
			}
		}
		while (true) {
			System.out.println("请输入密码:");
			String password = sc.nextLine();
			String reg2 = "\\w{8,12}";
			if (password.matches(reg2)) {
				user.setPassword(password);
				list.add(user);
				break;
			} else {
				System.out.println("密码非法输入，请重新输入!");
			}
		}
		System.out.println("用户注册成功!");
		System.out.println(list);
	}

	public static void login() {
		list.add(new User("admin","12345678"));
		System.out.println("用户登录");
		boolean flag = false;
		out: while (true) {
			System.out.println("请输入用户名:");
			String acounts = sc.nextLine();
			System.out.println("请输入密码:");
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
			System.out.println("帐号密码错误，请重新输入!");
		}
		if (flag) {
			System.out.println("欢迎管理员admin!");
			adminLogin();
		} else {
			System.out.println("欢迎" + user.getAcounts() + "登录!");
			commonLogin();
		}

	}

	public static void commonLogin() {
		System.out.println(
				"请选择功能:  添加图书(A)  查看图书(B )  修改图书(C)  删除图书(D)  修改用户名(E) " 
						+ "修改密码(F)   修改用户(G)   查看所有用户(I)   注销(Q)");
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
		System.out.println("请选择功能:  添加图书(A)  查看图书(B )  修改图书(C)  删除图书(D)  修改用户名(E) "
				+ "修改密码(F)   修改用户(G)   删除用户(H)   查看所有用户(I)   注销(Q)");
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
		System.out.println("修改用户名");
		System.out.println("请输入要被修改的用户名:");
		String acount = sc.nextLine();
		System.out.println("请输入修改的用户名:");
		String acounts = sc.nextLine();
		Iterator<User> it = list.iterator();
		while (it.hasNext()) {
			user = it.next();
			if (user.getAcounts().equals(acount)) {
				user.setAcounts(acounts);
			}
		}
		System.out.println("修改后的用户是:" + user);
	}

	public static void updatePassword() {
		System.out.println("修改密码");
		while (true) {
			System.out.println("请输入要被修改的用户名与密码:");
			String acount = sc.nextLine();
			String password = sc.nextLine();
			user = new User(acount, password);
			System.out.println("请输入修改的密码:");
			String passwords = sc.nextLine(); 
			if (list.contains(user)) {
				user.setPassword(passwords);
				break;
			} else {
				System.out.println("该用户名与密码不存在,请重新输入!");
			}
		}
		System.out.println("修改后的用户是:" + user);
	}

	public static void updateUser() {
		System.out.println("修改用户");
		System.out.println("请输入要修改的用户名:");
		String acount = sc.nextLine();
		System.out.println("请输入要修改的密码:");
		String password = sc.nextLine();
		user.setAcounts(acount);
		user.setPassword(password);
	}
	
	public static void deleteUser() {
		System.out.println("删除用户");
		System.out.println("请输入要被删除的用户名:");
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
		System.out.println("查看所有用户");
		System.out.println(list);
	}
}
