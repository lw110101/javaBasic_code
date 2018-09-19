package collection;

import java.util.*;
//使用集合实现注册登录功能。

class User{
	String acounts;
	String password;
	public User(String acounts,String password){
		this.acounts=acounts;
		this.password=password;
	}
	public boolean equals(Object obj){
		User u=(User)obj;
		return this.acounts.equals(u.acounts)&&this.password.equals(u.password);
	}
	public String toString(){
		return "{帐号："+acounts+"  密码："+password+"}";
	}
}

public class Demo5 {
	static Scanner sc=new Scanner(System.in);
	static Collection<User> c=new ArrayList<User>();
	public static void main(String[] args) {
			
		while(true){
			System.out.println("请选择功能：        A(注册)     B(登录)");
			String option=sc.next();
			
			if(option.equalsIgnoreCase("a")){
				User u=null;
				while(true){
				System.out.println("请输入注册帐号：");
				String acounts=sc.next();
				System.out.println("请输入注册密码：");
				String password=sc.next();
				u=new User(acounts,password);
				if(c.contains(u)){
					System.out.println("该帐号已被注册，请重新输入！");
				}else{
					c.add(u);
					break;
					}
				}
				System.out.println("注册成功！");
				System.out.println("当前注册人员："+c);
				
			}else if(option.equalsIgnoreCase("b")){
				
			while(true){
					System.out.println("请输入登录帐号：");
					String acounts=sc.next();
					System.out.println("请输入登录密码：");
					String password=sc.next();
					//Object[] arr=c.toArray();
					User u=new User(acounts,password);
					if(c.contains(u)){
						System.out.println("登录成功！");
						break;
					}else{
						System.out.println("帐号密码不正确，请重新输入！");
					}
				}
					System.out.println("欢迎登录！");
					
			}else{
				System.out.println("选择有误，请重新输入！");
			}
		}
	}
}

