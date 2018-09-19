package output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

//字节输出流：OutputStream------>读取文件:FileOutputStream
public class Demo1 {

	public static void main(String[] args) throws IOException {
		writeTest1();
		writeTest2();
		writeTest3();
		writeTest4();
	}
	
	public static void writeTest4() throws IOException {
		File file=new File("C:\\Users\\hasee\\Desktop\\a.txt");
		FileOutputStream fileOutputStream=new FileOutputStream(file,true);
		String str="\r\njava study";
		byte[] buf=str.getBytes();
		fileOutputStream.write(buf, 0, str.length());
		fileOutputStream.close();
	}
	
	public static void writeTest3() throws IOException {
		File file=new File("C:\\Users\\hasee\\Desktop\\a.txt");
		FileOutputStream fileOutputStream=new FileOutputStream(file,true);
		String str=" Boys and girls";
		byte[] buf=str.getBytes();
		fileOutputStream.write(buf);
		fileOutputStream.close();
	}
	
	public static void writeTest2() throws IOException {
		File file=new File("C:\\Users\\hasee\\Desktop\\a.txt");
		FileOutputStream fileOutputStream=new FileOutputStream(file);
		String str="Hello World!";
		byte[] buf=str.getBytes();
		fileOutputStream.write(buf);
		fileOutputStream.close();
	}
	
	public static void writeTest1() throws IOException {
		File file=new File("C:\\Users\\hasee\\Desktop\\a.txt");
		FileOutputStream fileOutputStream=new FileOutputStream(file);
		fileOutputStream.write('h');
		fileOutputStream.write('e');
		fileOutputStream.write('l');
		fileOutputStream.write('l');
		fileOutputStream.write('o');
		fileOutputStream.close();
		
	}
	
}
