package ioexception;
//图片拷贝的异常处理

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//复制图片
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
			System.out.println("图片拷贝失败。。。");
			throw new RuntimeException(e);
		} finally {
			try {
				if (fileOutputStream != null) {
					fileOutputStream.close();
					System.out.println("关闭输出流资源成功！");
				}
			} catch (IOException e) {
				System.out.println("关闭输出流资源失败！");
				throw new RuntimeException(e);
			} finally {
				if (fileInputStream != null) {
					try {
						fileInputStream.close();
						System.out.println("关闭输入流资源成功！");

					} catch (IOException e) {
						System.out.println("关闭输入流资源失败！");
						throw new RuntimeException(e);
					}
				}
			}
		}
	}
}
