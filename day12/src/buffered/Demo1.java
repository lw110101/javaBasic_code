package buffered;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

//���������ֽ�����BufferedInputStream
public class Demo1 {

	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\Users\\hasee\\Desktop\\a.txt");
		FileInputStream fileInputStream=new FileInputStream(file);
		BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
		int content=0;
		while((content=bufferedInputStream.read())!=-1) {//����һ���ֽ���
			System.out.print((char)content);
		}
		bufferedInputStream.close();
	}
}
