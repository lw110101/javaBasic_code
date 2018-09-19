package buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

//使用缓冲输入输出字符流实现注册登录
public class Demo4 {
	static Scanner sc=new Scanner(System.in);
	static File file=new File("C:\\Users\\hasee\\Desktop\\user.txt");
	
	public static void main(String[] args) throws IOException {
		while (true) {
			System.out.println("请输入选项:  (a)注册        (b)登录         (q)注销");
			String option = sc.nextLine();
			if ("a".equalsIgnoreCase(option)) {
				reg();
			} else if ("b".equalsIgnoreCase(option)) {
				login();
			} else if ("q".equalsIgnoreCase(option)) {
				System.exit(0);
			} else {
				System.out.println("输入有误，重新选择!");
			}
		}
	}
	
	public static void reg() throws IOException {
		
		FileWriter fileWriter=new FileWriter(file,true);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		System.out.println("请输入注册帐号:");
		String acounts = sc.nextLine();
		System.out.println("请输入注册密码:");
		String password = sc.nextLine();
		String user=acounts+" "+password;
		bufferedWriter.write(user);
		bufferedWriter.newLine();
		bufferedWriter.close();
		
	}
	
	public static void login() throws IOException {
		
		FileReader fileReader=new FileReader(file);
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		String user =  bufferedReader.readLine();
		String[] arr=user.split(" ");
		bufferedReader.close();

		out:while (true) {
			System.out.println("请输入登录帐号:");
			String acounts = sc.nextLine();
			if (arr[0].equals(acounts)) {
				in:while(true) {
				System.out.println("请输入登录密码:");
				String password = sc.nextLine();
				if (arr[1].equals(password)) {
					System.out.println("登录成功!");
					break in; 
				}else {
					System.out.println("密码错误，请重新输入!");
				}
				}
			break out;
			} else {
				System.out.println("帐号不存在，请重新登录!");
			}
		}
	}
}
