package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;


//ע���¼���Ż���

class Users{
	int id;
	String password;
	
	public String toString(){
		return "{�ʺţ�"+this.id +"  ���룺"+this.password +"}";
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
			System.out.println("��ѡ���ܣ�       A(ע��)      B(��¼)");
			String option=sc.next();
			
			if("a".equalsIgnoreCase(option)){
				reg();
					
			}else if("b".equalsIgnoreCase(option)){
				
				login();
			}else{
				System.out.println("ѡ����������ѡ�񣡣�");
			}
		}
	}

	public static void login() {
		while(true){
			System.out.println("�������¼�ʺţ�");
			int id=sc.nextInt();
			System.out.println("�������¼���룺");
			String password=sc.next();
			Iterator<Users> it=c.iterator();
			boolean flag=false;
			while(it.hasNext()){
				Users u=(Users)it.next();
				if(u.id==id&&u.password.equals(password)){
					System.out.println("��¼�ɹ���");
					flag=true;
				}
			}
			if(flag){
				System.out.println("��ӭ��¼�����棡");
				break;
			}else{
				System.out.println("�ʺ����벻��ȷ�����������룡");
			}
		}
	}

	public static void reg() {
		Users u=null;
		while(true){
			System.out.println("������ע���ʺţ�");
			int id=sc.nextInt();
			u=new Users(id,null);
			if(c.contains(u)){
				System.out.println("���ʺ��ѱ�ע�ᣬ���������룡");
			}else{
				break;
			}
		}
			System.out.println("������ע�����룺");
			String password=sc.next();
			u.setPassword(password);
			c.add(u);
			System.out.println("ע��ɹ���");
			System.out.println("��ǰע����Ա��"+c);
	}
}
