package tcp;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/*
String name=sc.next()

User user=new User(name,null);

String id=sc.nextInt();

user.setId(id);而如下不可以：

String name=sc.next()

String id=sc.nextInt();

User user=new User(name,id);*/
class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	String name;
	String id;
	public User(String name, String id) {
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "姓名:"+this.name+"  编号:"+this.id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
public class TestClient {

	public static void main(String[] args) throws IOException {
		Socket socket=new Socket(InetAddress.getLocalHost(), 60000);
		
		ObjectOutputStream socketout=new ObjectOutputStream(socket.getOutputStream());
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("请输入帐号:");
		String name=sc.next();
		User user=new User(name,null);
		System.out.println("请输入密码:");
		String id=sc.next();
		user.setId(id);
		System.out.println(user);
		socketout.writeObject(user);
		sc.close();
		socket.close();*/
	
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入帐号:");
		String name=sc.next();
		System.out.println("请输入密码:");
		String id=sc.next();
		User user=new User(name,id);
		socketout.writeObject(user);
		sc.close();
		socket.close();
		//System.out.println(user);
	}
}
