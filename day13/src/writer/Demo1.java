package writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//����ַ�����
public class Demo1 {

	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\Users\\hasee\\Desktop\\a.txt");
		FileWriter fileWriter=new FileWriter(file,true);
		String data="15�������ѧ�뼼��";
		fileWriter.write(data);
		//fileWriter.flush();
		fileWriter.close();
		
	}
}
