package buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

//ʹ�û�����������ַ���ʵ��ע���¼
public class Demo4 {
	static Scanner sc=new Scanner(System.in);
	static File file=new File("C:\\Users\\hasee\\Desktop\\user.txt");
	
	public static void main(String[] args) throws IOException {
		while (true) {
			System.out.println("������ѡ��:  (a)ע��        (b)��¼         (q)ע��");
			String option = sc.nextLine();
			if ("a".equalsIgnoreCase(option)) {
				reg();
			} else if ("b".equalsIgnoreCase(option)) {
				login();
			} else if ("q".equalsIgnoreCase(option)) {
				System.exit(0);
			} else {
				System.out.println("������������ѡ��!");
			}
		}
	}
	
	public static void reg() throws IOException {
		
		FileWriter fileWriter=new FileWriter(file,true);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		System.out.println("������ע���ʺ�:");
		String acounts = sc.nextLine();
		System.out.println("������ע������:");
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
			System.out.println("�������¼�ʺ�:");
			String acounts = sc.nextLine();
			if (arr[0].equals(acounts)) {
				in:while(true) {
				System.out.println("�������¼����:");
				String password = sc.nextLine();
				if (arr[1].equals(password)) {
					System.out.println("��¼�ɹ�!");
					break in; 
				}else {
					System.out.println("�����������������!");
				}
				}
			break out;
			} else {
				System.out.println("�ʺŲ����ڣ������µ�¼!");
			}
		}
	}
}
