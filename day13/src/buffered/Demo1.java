package buffered;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//缓冲输入字符流
public class Demo1 {

	public static void main(String[] args) throws IOException {
		//bufferedReadTest1();
		bufferedReadTest2();
	}
	
	public static void bufferedReadTest1() throws IOException {
		File file=new File("C:\\Users\\hasee\\Desktop\\65.txt");
		FileReader fileReader=new FileReader(file);
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		int content=0;
		while((content=bufferedReader.read())!=-1) {
			System.out.print((char)content);
		}
		bufferedReader.close();
	}
//拓展功能readLine()方法
	public static void bufferedReadTest2() throws IOException {
		File file=new File("C:\\Users\\hasee\\Desktop\\65.txt");
		FileReader fileReader=new FileReader(file);
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		String content=bufferedReader.readLine();
		System.out.println(content);
		bufferedReader.close();
	}

}
