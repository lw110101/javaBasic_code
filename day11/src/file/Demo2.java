package file;

import java.io.File;
import java.io.IOException;

/*
 * 创建：
	createNewFile()	在指定位置创建一个空文件，成功就返回true，如果已存在就不创建然后返回false
	mkdir()			创建单级文件夹
	mkdirs()		在指定位置创建目录，这会创建路径中所有不存在的目录。
	renameTo(File dest)	重命名文件或文件夹，也可以操作非空的文件夹，文件不同时相当于文件的剪切,
			剪切时候不能操作非空的文件夹。移动/重命名成功则返回true，失败则返回false。
*/
public class Demo2 {

	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\Users\\hasee\\Desktop\\lw.txt");
		System.out.println("创建文件成功？"+file.createNewFile());
		
		File file1=new File("C:\\Users\\hasee\\Desktop\\lw");
		System.out.println("创建文件夹成功？"+file1.mkdir());
		
		File file2=new File("C:\\Users\\hasee\\Desktop\\lw\\abc\\a.txt");
		System.out.println("创建多级文件夹成功？"+file2.mkdirs());
		
		File destFile=new File("C:\\Users\\hasee\\Desktop\\c");
		System.out.println("重命名成功？"+file1.renameTo(destFile));
		
		File destFile1=new File("C:\\a");
		System.out.println("剪切成功？"+file.renameTo(destFile1));
		
	}
}

