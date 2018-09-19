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
		
		System.out.println("南昌大学人民武装学院!");
		
		while(i<user.capacity()){
		
		System.out.println("请选择功能： 注册(A)  查看用户(B)  退出系统(Q)");
		
		Scanner sc=new Scanner(System.in);
		String message=sc.next();
		sc.close();
		if(message.equals("A")){
			
			System.out.print("请输入用户名：");
			String a=sc.next();
			System.out.print("请输入密码：");
			String b=sc.next();
			//User u=new User(a,b);
			user.append(a);
			user.append(b);
			
			i++;
			
		}else if(message.equals("B")){
			if(i==0){
				System.out.println("暂时没有用户输入，请重新选择！");
			}else{
			System.out.println("当前用户为：");
			for(int j=0;j<i;j++){//外层循环退出前查看
				System.out.println("用户名："+user.substring(j,j+1)+"  密码："+user.substring(j+1,j+2));

				}
			}
		}else if(message.equals("Q")){
			//System.out.println("退出系统。");
			System.exit(0);
		
		}else{
		
			System.out.println("指令输入有错，重新选择(A-B-Q)！");
		}
		}
		
	}
}
/*问题：输完全部用户后，查看显示出错
		数组长度问题
*/