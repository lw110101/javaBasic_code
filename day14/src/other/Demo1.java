package other;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 对象的输出流：ObjectOutputStream
对象的输入流：ObjectInputStream
*/
class Address implements Serializable{
	
	private static final long serialVersionUID = 1L;

	String country;
	
	String city;
	
	public Address(String country, String city) {
		this.country = country;
		this.city = city;
	}
	@Override
	public String toString() {
		
		return "地址是："+this.country+this.city;
	}
	
}

class User implements Serializable{
	
	private static final long serialVersionUID = 1L;

	String userName;
	
	String password;

	transient int age;
	
	Address address;
	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	
	public User(String userName, String password, int age,Address address) {
		this.userName = userName;
		this.password = password;
		this.age = age;
		this.address=address;
	}

	public String toString() {
		System.out.println("南昌大学人民武装学院");
		return "用户名:"+this.userName+" 密码:"+this.password+" 年龄:"+this.age+" 地址:"+this.address;
	}
}

public class Demo1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//writeObj();
		readObj();
		
	}
	//对象的序列化
	public static void writeObj() throws IOException {
		
		Address address = new Address("中国", "南昌");
		
		User user = new User("admin", "123", 15, address);
		
		File file = new File("C:\\Users\\hasee\\Desktop\\users.txt");
		
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		
		ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutputStream);
		
		objectOutput.writeObject(user);
		objectOutput.close();
	}
	//对象的反序列化
	public static void readObj() throws ClassNotFoundException, IOException {

		File file = new File("C:\\Users\\hasee\\Desktop\\users.txt");
		
		FileInputStream fileInputStream = new FileInputStream(file);
		
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		
		User user = (User) objectInputStream.readObject();
		
		System.out.println("对象是:" + user);
		objectInputStream.close();
	}
}
