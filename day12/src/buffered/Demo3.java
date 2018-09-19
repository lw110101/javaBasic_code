package buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//ͼƬ�Ŀ���
public class Demo3 {

	public static void main(String[] args) {

		File startFile = new File("C:Users\\hasee\\Desktop\\pic\\Koala.jpg");
		File destFile = new File("C:Users\\hasee\\Desktop\\copy1.jpg");
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		BufferedInputStream bufferedInputStream = null;
		BufferedOutputStream bufferedOutputStream = null;
		try {
			fileInputStream = new FileInputStream(startFile);
			fileOutputStream = new FileOutputStream(destFile);
			bufferedInputStream = new BufferedInputStream(fileInputStream);
			bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
			int content = 0;
			while ((content = bufferedInputStream.read()) != -1) {
				bufferedOutputStream.write(content);
			}
		} catch (IOException e) {
			System.out.println("ͼƬ����ʧ��!");
			throw new RuntimeException(e);
		} finally {
			try {
				if (fileOutputStream != null) {
					bufferedOutputStream.close();
					System.out.println("��������ֽ�������رճɹ���");
				}
			} catch (IOException e) {
				System.out.println("��������ֽ�������ر�ʧ�ܡ�");
				throw new RuntimeException(e);
			} finally {
				if (fileInputStream != null) {
					try {
						bufferedInputStream.close();
						System.out.println("���������ֽ�������رճɹ���");
					} catch (IOException e) {
						System.out.println("���������ֽ�������ر�ʧ�ܡ�");
						throw new RuntimeException(e);
					}
				}

			}
		}
	}
}
