package buffered;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

//»º´æÊä³ö×Ö½ÚÁ÷
public class Demo2 {

	public static void main(String[] args) throws IOException {
		
		File file=new File("C:Users\\hasee\\Desktop\\a.txt");
		FileOutputStream fileOutputStream=new FileOutputStream(file);
		BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
		bufferedOutputStream.write("Hello World!\r\nBoys  and girls".getBytes());
		//bufferedOutputStream.flush();
		bufferedOutputStream.close();
	}
}
