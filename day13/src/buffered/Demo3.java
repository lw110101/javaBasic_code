package buffered;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//��������ַ���
public class Demo3 {

	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\Users\\hasee\\Desktop\\a.txt");
		FileWriter fileWriter=new FileWriter(file,true);
		BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
		bufferedWriter.newLine();
		bufferedWriter.write("15�Ʊ���ΰ");
		bufferedWriter.close();	
	}
}
