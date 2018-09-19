package file;

import java.io.File;
//import java.io.FileFilter;
import java.io.FilenameFilter;

//需求1：指定一个文件夹，列出所有的java文件
//需求2：指定一个文件夹，列出子文件与子文件夹，格式分开写：文件： 。。。。。文件夹：。。。。。
class MyFilter implements FilenameFilter{//过滤器

	String option;
	
	public MyFilter(String option) {
		
		this.option = option;
	}

	@Override
	public boolean accept(File dir, String name) {
		
		return name.endsWith(option);    //true时将添加到数组中。
	}
	
}/*
class Abc implements FileFilter{

	@Override
	public boolean accept(File pathname) {
		// TODO Auto-generated method stub
		return pathname.isFile();
	}
	
}*/
public class Demo6 {

	public static void main(String[] args) {
		//需求1：指定一个文件夹，列出所有的java文件
		File file=new File("C:\\Users\\hasee\\Desktop\\65");
		getJava(file);
		
		File file1=new File("C:\\Users\\hasee\\Desktop\\vba日志");
		listFile(file1);
		//test(file1);
		//需求2：指定一个文件夹，列出子文件与子文件夹，格式分开写：文件： 。。。。。文件夹：。。。。。
		
	}
	/*
	public static void test(File file) {
		File[] files=file.listFiles(new Abc());
		System.out.println("文件:");
		for(File fileItem:files) {
			System.out.println("\t"+fileItem.getName());
		}
	}
	*/
	public static void  getJava(File file) {
		File[] files=file.listFiles(new MyFilter(".java"));
		System.out.println("Java文件:");
		for(File fileItem:files) {
			System.out.println(fileItem.getName());
		}
	}
/*
	public static void getJava(File file) {
		File[] files=file.listFiles();
		System.out.println("所有的java文件是:");
		for(File temp:files) {
			if(temp.getName().endsWith(".java")&&file.isFile()) {
				System.out.println(temp.getName());
			}//还可以用正则
			if(temp.getName().matches(".+\\.java")&&temp.isFile()) {
				System.out.println(temp.getName());
			}
		}
	}*/
	
	public static void listFile(File file) {
		File[] files=file.listFiles();
		System.out.println("文件:");
		for(File fileItem:files) {
			if(fileItem.isFile()) {
				System.out.println("\t"+fileItem.getName());
			}
		}
		System.out.println("文件夹:");
		for(File fileItem:files) {
			if(fileItem.isDirectory()) {
				System.out.println("\t"+fileItem.getName());
			}
		}
	}
	
}
