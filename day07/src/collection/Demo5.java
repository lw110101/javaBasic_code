package collection;

import java.util.*;
//ʹ�ü���ʵ��ע���¼���ܡ�

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
		return "{�ʺţ�"+acounts+"  ���룺"+password+"}";
	}
}

public class Demo5 {
	static Scanner sc=new Scanner(System.in);
	static Collection<User> c=new ArrayList<User>();
	public static void main(String[] args) {
			
		while(true){
			System.out.println("��ѡ���ܣ�        A(ע��)     B(��¼)");
			String option=sc.next();
			
			if(option.equalsIgnoreCase("a")){
				User u=null;
				while(true){
				System.out.println("������ע���ʺţ�");
				String acounts=sc.next();
				System.out.println("������ע�����룺");
				String password=sc.next();
				u=new User(acounts,password);
				if(c.contains(u)){
					System.out.println("���ʺ��ѱ�ע�ᣬ���������룡");
				}else{
					c.add(u);
					break;
					}
				}
				System.out.println("ע��ɹ���");
				System.out.println("��ǰע����Ա��"+c);
				
			}else if(option.equalsIgnoreCase("b")){
				
			while(true){
					System.out.println("�������¼�ʺţ�");
					String acounts=sc.next();
					System.out.println("�������¼���룺");
					String password=sc.next();
					//Object[] arr=c.toArray();
					User u=new User(acounts,password);
					if(c.contains(u)){
						System.out.println("��¼�ɹ���");
						break;
					}else{
						System.out.println("�ʺ����벻��ȷ�����������룡");
					}
				}
					System.out.println("��ӭ��¼��");
					
			}else{
				System.out.println("ѡ���������������룡");
			}
		}
	}
}

