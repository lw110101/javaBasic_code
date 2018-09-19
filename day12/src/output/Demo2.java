package output;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//¸´ÖÆÍ¼Æ¬
public class Demo2 {

	public static void main(String[] args) throws IOException {
		copyPicture();
	}
	
	public static void copyPicture() throws IOException {
		File file=new File("C:\\Users\\hasee\\Desktop\\pic\\Koala.jpg");
		FileInputStream fileInputStream=new FileInputStream(file);
		File file1=new File("C:\\Users\\hasee\\Desktop\\pic1.jpg");
		FileOutputStream fileOutputStream=new FileOutputStream(file1);
		byte[] buf=new byte[1024];
		int length=0;
		while((length=fileInputStream.read(buf))!=-1) {
			fileOutputStream.write(buf,0,length);
		}
		fileOutputStream.close();
		fileInputStream.close();
	}
}
