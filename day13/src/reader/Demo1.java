package reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//输入字符流
public class Demo1 {

	public static void main(String[] args) throws IOException {
		//readTest1();
		readTest2();
	}
	
	//使用字符数组
	public static void readTest2() throws IOException {
		File file =new File("C:\\Users\\hasee\\Desktop\\2017-12-28.txt");
		FileReader fileReader=new FileReader(file);
		char[] buf=new char[1024];
		int length=0;
		while((length=fileReader.read(buf))!=-1) {
			System.out.print(new String(buf,0,length));
		}
		fileReader.close();
	}
	
	//read()方法
	public static void readTest1() throws IOException {
		File file =new File("C:\\Users\\hasee\\Desktop\\2017-12-28.txt");
		FileReader fileReader=new FileReader(file);
		int content=0;
		while((content=fileReader.read())!=-1) {
			System.out.print((char)content);
		}
		fileReader.close();
	}
}
