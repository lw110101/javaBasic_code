package set;

import java.util.HashSet;
import java.util.Scanner;

class User{
	String userName;
	String password;
	
	public User(String userName,String password) {
		this.userName=userName;
		this.password=password;
	}
	
	public String toString() {
		return "用户名:"+this.userName+" 密码:"+this.password;
	}
	
	public int hashCode() {
		return this.userName.hashCode()-this.password.hashCode();
	}
	
	public boolean equals(Object obj) {
		User u=(User)obj;
		return this.userName.equals(u.userName)&&this.password.equals(u.password);
	}
}

public class Demo3 {

	public static void main(String[] args) {
		HashSet<User> set=new HashSet<User>();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("请输入用户名:");
			String userName=sc.next();
			System.out.println("请输入密码:");
			String password=sc.next();
			User u=new User(userName,password);
			if(set.add(u)) {
				System.out.println("注册成功!");
				System.out.println("当前注册人员:"+set);
				sc.close();
				break;
			}else {
				System.out.println("注册失败!");
			}
		}
	}
}
