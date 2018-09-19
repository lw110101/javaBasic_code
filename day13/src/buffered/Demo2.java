package buffered;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) throws IOException {

		File file=new File("C:\\Users\\hasee\\Desktop\\65.txt");
		FileReader fileReader=new FileReader(file);
		String line=null;
		while((line=myReadLine(fileReader))!=null) {
			System.out.println(line);
		}
	}
//空行返回""
	public static String myReadLine(FileReader fileReader) throws IOException {
		StringBuffer sb = new StringBuffer();
		int content = 0;
		while ((content = fileReader.read()) != -1) {
			if (content == '\r') {
				continue;
			} else if (content == '\n') {
				break;
			} else {
				sb.append((char) content);
			}
			
		}
		//代表已经读取完毕了。
		if(content==-1) {
			return null;	
		}
		return sb.toString();

	}
}
