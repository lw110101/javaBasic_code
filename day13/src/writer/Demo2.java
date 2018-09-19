package writer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//拷贝一个java文件
public class Demo2 {

	public static void main(String[] args) throws IOException {

		File startFile = new File("E:\\eclipse-Workspace\\day13\\src\\reader\\Demo1.java");
		File destFile = new File("C:\\Users\\hasee\\Desktop\\Demo1.java");
		FileReader fileReader = new FileReader(startFile);
		FileWriter fileWriter = new FileWriter(destFile);
		/*
		int content = 0;
		while ((content = fileReader.read()) != -1) {
			fileWriter.write(content);
		}*/
		char[] buf=new char[1024];
		int length=0;
		while((length=fileReader.read(buf))!=-1) {
			fileWriter.write(buf, 0, length);;
		}
		fileWriter.close();
		fileReader.close();

	}
}
