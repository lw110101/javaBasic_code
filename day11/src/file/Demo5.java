package file;

import java.io.File;

/*
文件夹相关：
staic File[] listRoots()	列出所有的根目录（Window中就是所有系统的盘符）
String[] list()				返回目录下的文件或者目录名，包含隐藏文件。对于文件这样操作会返回null。
File[] listFiles()		返回目录下的文件或者目录对象（File类实例），包含隐藏文件。对于文件这样操作会返回null。

String[] list(FilenameFilter filter)	返回指定当前目录中符合过滤条件的子文件或子目录。对于文件这样操作会返回null。		
File[] listFiles(FilenameFilter filter)	返回指定当前目录中符合过滤条件的子文件或子目录。对于文件这样操作会返回null。
*/
public class Demo5 {

	public static void main(String[] args) {
		
		File file=new File("C:\\Users\\hasee\\Desktop\\HTML日志");
		File[] list=File.listRoots();
		for(File temp:list) {
			System.out.println(temp);
		}
		
		System.out.println("获取目录下的文件或文件夹名:");
		String[] arr=file.list();
		for(String a:arr) {
			System.out.println(a);
		}
		
		System.out.println("获取目录下的文件或文件夹:");
		File[] list1=file.listFiles();
		for(File b:list1) {
			System.out.println("文件名:"+b.getName());
		}
		System.out.println("\\");
		
	}
}
