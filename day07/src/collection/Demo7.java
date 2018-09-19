package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;


//注册登录的优化版

class Users{
	int id;
	String password;
	
	public String toString(){
		return "{帐号："+this.id +"  密码："+this.password +"}";
	}
	
	public boolean equals(Object obj){
		Users u=(Users)obj;
		return this.id==u.id;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password=password;
	}
	
	public Users(int id,String password){
		this.id=id;
		this.password=password;
	}
}


public class Demo7 {
	static Collection<Users> c=new ArrayList<Users>();
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while(true){
			System.out.println("请选择功能：       A(注册)      B(登录)");
			String option=sc.next();
			
			if("a".equalsIgnoreCase(option)){
				reg();
					
			}else if("b".equalsIgnoreCase(option)){
				
				login();
			}else{
				System.out.println("选择有误，重新选择！！");
			}
		}
	}

	public static void login() {
		while(true){
			System.out.println("请输入登录帐号：");
			int id=sc.nextInt();
			System.out.println("请输入登录密码：");
			String password=sc.next();
			Iterator<Users> it=c.iterator();
			boolean flag=false;
			while(it.hasNext()){
				Users u=(Users)it.next();
				if(u.id==id&&u.password.equals(password)){
					System.out.println("登录成功！");
					flag=true;
				}
			}
			if(flag){
				System.out.println("欢迎登录本界面！");
				break;
			}else{
				System.out.println("帐号密码不正确，请重新输入！");
			}
		}
	}

	public static void reg() {
		Users u=null;
		while(true){
			System.out.println("请输入注册帐号：");
			int id=sc.nextInt();
			u=new Users(id,null);
			if(c.contains(u)){
				System.out.println("该帐号已被注册，请重新输入！");
			}else{
				break;
			}
		}
			System.out.println("请输入注册密码：");
			String password=sc.next();
			u.setPassword(password);
			c.add(u);
			System.out.println("注册成功！");
			System.out.println("当前注册人员："+c);
	}
}
