package math_date;
import java.util.*;

class User{
	String name;
	String password;
	public User(String name,String password){
		this.name=name;
		this.password=password;	
		}

	}
	

class Demo5
{
	public static void main(String[] args)
	{
		int i=0;
		StringBuilder user=new StringBuilder();
		
		System.out.println("�ϲ���ѧ������װѧԺ!");
		
		while(i<user.capacity()){
		
		System.out.println("��ѡ���ܣ� ע��(A)  �鿴�û�(B)  �˳�ϵͳ(Q)");
		
		Scanner sc=new Scanner(System.in);
		String message=sc.next();
		sc.close();
		if(message.equals("A")){
			
			System.out.print("�������û�����");
			String a=sc.next();
			System.out.print("���������룺");
			String b=sc.next();
			//User u=new User(a,b);
			user.append(a);
			user.append(b);
			
			i++;
			
		}else if(message.equals("B")){
			if(i==0){
				System.out.println("��ʱû���û����룬������ѡ��");
			}else{
			System.out.println("��ǰ�û�Ϊ��");
			for(int j=0;j<i;j++){//���ѭ���˳�ǰ�鿴
				System.out.println("�û�����"+user.substring(j,j+1)+"  ���룺"+user.substring(j+1,j+2));

				}
			}
		}else if(message.equals("Q")){
			//System.out.println("�˳�ϵͳ��");
			System.exit(0);
		
		}else{
		
			System.out.println("ָ�������д�����ѡ��(A-B-Q)��");
		}
		}
		
	}
}
/*���⣺����ȫ���û��󣬲鿴��ʾ����
		���鳤������
*/