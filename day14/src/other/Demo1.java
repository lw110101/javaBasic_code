package other;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 ������������ObjectOutputStream
�������������ObjectInputStream
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
		
		return "��ַ�ǣ�"+this.country+this.city;
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
		System.out.println("�ϲ���ѧ������װѧԺ");
		return "�û���:"+this.userName+" ����:"+this.password+" ����:"+this.age+" ��ַ:"+this.address;
	}
}

public class Demo1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//writeObj();
		readObj();
		
	}
	//��������л�
	public static void writeObj() throws IOException {
		
		Address address = new Address("�й�", "�ϲ�");
		
		User user = new User("admin", "123", 15, address);
		
		File file = new File("C:\\Users\\hasee\\Desktop\\users.txt");
		
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		
		ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutputStream);
		
		objectOutput.writeObject(user);
		objectOutput.close();
	}
	//����ķ����л�
	public static void readObj() throws ClassNotFoundException, IOException {

		File file = new File("C:\\Users\\hasee\\Desktop\\users.txt");
		
		FileInputStream fileInputStream = new FileInputStream(file);
		
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		
		User user = (User) objectInputStream.readObject();
		
		System.out.println("������:" + user);
		objectInputStream.close();
	}
}
