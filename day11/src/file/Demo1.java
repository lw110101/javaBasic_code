package file;
/*
 * File类的构造方法：
	File(File parent, String child)  根据父路径和子路径名字符串创建File类
          	 
	File(String pathname)  指定文件或文件夹的路径创建一个File文件
         	
	File(String parent, String child)   根据父路径名字符串和子路径名字符串创建File类
*/
import java.io.File;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) throws IOException {

		File file=new File("C:\\Users\\hasee\\Desktop\\Java日志");
		System.out.println("该文件存在吗？"+file.exists());
		
		File parentFile=new File("C:\\Users\\hasee\\Desktop");
		File file1=new File(parentFile,"Java日志");
		System.out.println("该文件存在吗？"+file1.exists());
		
		File file2=new File("C:\\Users\\hasee\\Desktop","Java日志");
		System.out.println("该文件存在吗？"+file2.exists());
		
		File file3=new File(".");
		System.out.println("当前路径:"+file3.getAbsolutePath());
		System.out.println("标准路径:"+file.getCanonicalPath());
	
		
		
	}
}
