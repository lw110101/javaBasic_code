package ioexception;
//ͼƬ�������쳣����

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//����ͼƬ
public class Demo2 {

	public static void main(String[] args) {
		copyPicture();
	}
	
	public static void copyPicture() {
		
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		try {
			File file = new File("C:\\Users\\hasee\\Desktop\\pic\\Koala.jpg");
			File file1 = new File("C:\\Users\\hasee\\Desktop\\pic1.jpg");
			fileInputStream = new FileInputStream(file);
			fileOutputStream = new FileOutputStream(file1);
			byte[] buf = new byte[1024];
			int length = 0;
			while ((length = fileInputStream.read(buf)) != -1) {
				fileOutputStream.write(buf, 0, length);
			}
		} catch (IOException e) {
			System.out.println("ͼƬ����ʧ�ܡ�����");
			throw new RuntimeException(e);
		} finally {
			try {
				if (fileOutputStream != null) {
					fileOutputStream.close();
					System.out.println("�ر��������Դ�ɹ���");
				}
			} catch (IOException e) {
				System.out.println("�ر��������Դʧ�ܣ�");
				throw new RuntimeException(e);
			} finally {
				if (fileInputStream != null) {
					try {
						fileInputStream.close();
						System.out.println("�ر���������Դ�ɹ���");

					} catch (IOException e) {
						System.out.println("�ر���������Դʧ�ܣ�");
						throw new RuntimeException(e);
					}
				}
			}
		}
	}
}
