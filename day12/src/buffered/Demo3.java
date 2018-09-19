package buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//图片的拷贝
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
			System.out.println("图片拷贝失败!");
			throw new RuntimeException(e);
		} finally {
			try {
				if (fileOutputStream != null) {
					bufferedOutputStream.close();
					System.out.println("缓存输出字节流对象关闭成功。");
				}
			} catch (IOException e) {
				System.out.println("缓存输出字节流对象关闭失败。");
				throw new RuntimeException(e);
			} finally {
				if (fileInputStream != null) {
					try {
						bufferedInputStream.close();
						System.out.println("缓存输入字节流对象关闭成功。");
					} catch (IOException e) {
						System.out.println("缓存输入字节流对象关闭失败。");
						throw new RuntimeException(e);
					}
				}

			}
		}
	}
}
