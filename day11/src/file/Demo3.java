package file;

import java.io.File;

/*
删除：
	boolean delete()	删除文件或一个空文件夹，马上删除
	deleteOnExit()	退出jvm时删除文件   一般用于删除临时文件
判断：
	exists()	文件或文件夹是否存在。
	isFile()	是否是一个文件，如果不存在，则始终为false。
	isDirectory()	是否是一个目录，如果不存在，则始终为false。
	isHidden()	是否是一个隐藏的文件或是否是隐藏的目录。
	isAbsolute()	测试此抽象路径名是否为绝对路径名。
*/
public class Demo3 {

	public static void main(String[] args) {
		/*//删除
		File file=new File("C:\\Users\\hasee\\Desktop\\a");
		System.out.println("删除成功？"+file.delete());
		
		File file1=new File("C:\\Users\\hasee\\Desktop\\a.txt");
		file1.deleteOnExit();
		System.out.println("abc");//
		
		*///判断
		File file=new File("C:\\Users\\hasee\\Desktop\\Java瞎编");
		System.out.println("文件夹存在吗？"+file.exists());
	
		System.out.println("是文件吗？"+file.isFile());
		System.out.println("是文件夹吗？"+file.isDirectory());
		System.out.println("是隐藏文件吗？"+file.isHidden());
		System.out.println("是绝对路径吗？"+file.isAbsolute());
		
	}
}
