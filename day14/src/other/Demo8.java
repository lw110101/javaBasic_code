package other;
/*
需求1：列出一个文件夹的子孙文件与目录。

2，列出指定目录中所有的子孙文件与子孙目录名，要求名称前面要有相应数量的空格：
		第一级前面有0个，第二级前面有1个，第三级前面有2个...，以此类推。

3，列出指定目录中所有的子孙文件与子孙目录名，要求要是树状结构，效果如下所示：
		|--src
		|   |--cn
		|   |   |--itcast
		|   |   |   |--a_helloworld
		|   |   |   |   |--HelloWorld.java
		|   |   |   |--b_for
		|   |   |   |   |--ForTest.java
		|   |   |   |--c_api
		|   |   |   |   |--Student.java
		|--bin
		|   |--cn
		|   |   |--itcast
		|   |   |   |--i_exception
		|   |   |   |   |--ExceptionTest.class
		|   |   |   |--h_linecount
		|   |   |   |   |--LineCounter3.class
		|   |   |   |   |--LineCounter2.class
		|   |   |   |   |--LineCounter.class
		|--lib
		|   |--commons-io.jar

需求4: 删除一个非空的文件夹。 

*/

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class Demo8 {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\hasee\\Desktop\\ps日志");
		//listFile1(file);
		//listFile2(file,"");
		listFile3(file,"|--");
		
		File dir=new File("C:\\Users\\hasee\\Desktop\\aa");
		deleteFile(dir);
	}
	
	//需求4: 删除一个非空的文件夹。
	public static void deleteFile(File dir) {
		
		File[] files = dir.listFiles();
		for(File file:files) {
			if(file.isFile()) {
				file.delete();
			}else if(file.isDirectory()) {
				deleteFile(file);
			}
		}
		dir.delete();
	}
	
	//3，列出指定目录中所有的子孙文件与子孙目录名，要求要是树状结构，效果如下所示
	public static void listFile3(File dir, String space) throws IOException {

		File[] files = dir.listFiles();
		System.setOut(new PrintStream("C:\\Users\\hasee\\Desktop\\a.txt"));
		for (File file : files) {
			if (file.isFile()) {
				System.out.println(space + "文件名是:" + file.getName());
			} else if (file.isDirectory()) {
				System.out.println(space + "文件夹名是:" + file.getName());
				listFile2(file, "|    " + space);

			}
		}
	}
	
	//2，列出指定目录中所有的子孙文件与子孙目录名，要求名称前面要有相应数量的空格：第一级前面有0个，第二级前面有1个，第三级前面有2个...，以此类推。
	public static void listFile2(File dir,String space) {
		
		File[] files = dir.listFiles();
		for (File file : files) {
			if (file.isFile()) {
				System.out.println(space + "文件名是:" + file.getName());
			} else if (file.isDirectory()) {
				System.out.println(space + "文件夹名是:" + file.getName());
				listFile2(file, "    " + space);

			}
		}
	}
	
	//需求1：列出一个文件夹的子孙文件与目录。
	public static void listFile1(File dir) {

		File[] files=dir.listFiles();
		for(File file:files) {
			if(file.isFile()) {
				System.out.println("文件名是:"+file.getName());
			}else if(file.isDirectory()) {
				System.out.println("文件夹名是:"+file.getName());
				listFile1(file);
			}
		}
	}
}
