package writer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyImg {

	public static void main(String[] args) throws IOException {
		
		File startFile=new File("C:\\Users\\hasee\\Desktop\\pic\\Koala.jpg");
		File destFile=new File("C:\\Users\\hasee\\Desktop\\koala.jpg");
		FileReader fileReader=new FileReader(startFile);
		FileWriter fileWriter=new FileWriter(destFile);
		char[] buf=new char[1024];
		int length=0;
		while((length=fileReader.read(buf))!=-1) {
			fileWriter.write(buf, 0, length);
		}
		fileWriter.close();
		fileReader.close();

	}
}
