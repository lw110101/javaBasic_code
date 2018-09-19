package test4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//2.编写一个方法实现拷贝任意文件的功能，要求效率最高
public class CopyFile {

	public static void main(String[] args) throws IOException {
		
		File dir=new File("C:\\Users\\hasee\\Desktop\\中国教育史.doc");
		String path="C:\\Users\\hasee\\Desktop";
		copy(dir,path);
	}
	
	public static void copy(File dir,String path ) throws IOException {
		
		BufferedInputStream bufferedInputStream=new BufferedInputStream(new FileInputStream(dir));
		
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
				new FileOutputStream(new File(path, "copy" + dir.getName())));
		@SuppressWarnings("unused")
		int length = 0;
		byte[] buf = new byte[1024];
		while ((length = bufferedInputStream.read(buf)) != -1) {
			bufferedOutputStream.write(buf);
		}
		bufferedOutputStream.close();
		bufferedInputStream.close();
	}
}
