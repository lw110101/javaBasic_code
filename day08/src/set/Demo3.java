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
		return "�û���:"+this.userName+" ����:"+this.password;
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
			System.out.println("�������û���:");
			String userName=sc.next();
			System.out.println("����������:");
			String password=sc.next();
			User u=new User(userName,password);
			if(set.add(u)) {
				System.out.println("ע��ɹ�!");
				System.out.println("��ǰע����Ա:"+set);
				sc.close();
				break;
			}else {
				System.out.println("ע��ʧ��!");
			}
		}
	}
}
