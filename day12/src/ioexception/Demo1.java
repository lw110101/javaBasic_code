package ioexception;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*//IO异常的处理
把IOException传递给RuntimeException包装一层，然后再抛出，目的是为了让调用者使用变得更加灵活。
*/
public class Demo1 {

	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		
		FileInputStream fileInputStream = null;
		try {
			File file = new File("C:\\Users\\hasee\\Desktop\\aa.txt");
			fileInputStream = new FileInputStream(file);
			int length = 0;
			byte[] buf = new byte[1024];
			System.out.println("读取的内容是:");
			while ((length = fileInputStream.read(buf)) != -1) {
				System.out.println(new String(buf, 0, length));
			}
		} catch (IOException e) {
			System.out.println("读取文件出错!");
			throw new RuntimeException(e);
		} finally {
			try {
				if(fileInputStream!=null) {
				fileInputStream.close();
				System.out.println("关闭成功");
				}
			} catch (IOException e) {
				System.out.println("关闭失败");
				throw new RuntimeException(e);
			}
		}
	}
}
