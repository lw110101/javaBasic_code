package file;

import java.io.File;
//import java.io.FileFilter;
import java.io.FilenameFilter;

//����1��ָ��һ���ļ��У��г����е�java�ļ�
//����2��ָ��һ���ļ��У��г����ļ������ļ��У���ʽ�ֿ�д���ļ��� �����������ļ��У�����������
class MyFilter implements FilenameFilter{//������

	String option;
	
	public MyFilter(String option) {
		
		this.option = option;
	}

	@Override
	public boolean accept(File dir, String name) {
		
		return name.endsWith(option);    //trueʱ����ӵ������С�
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
		//����1��ָ��һ���ļ��У��г����е�java�ļ�
		File file=new File("C:\\Users\\hasee\\Desktop\\65");
		getJava(file);
		
		File file1=new File("C:\\Users\\hasee\\Desktop\\vba��־");
		listFile(file1);
		//test(file1);
		//����2��ָ��һ���ļ��У��г����ļ������ļ��У���ʽ�ֿ�д���ļ��� �����������ļ��У�����������
		
	}
	/*
	public static void test(File file) {
		File[] files=file.listFiles(new Abc());
		System.out.println("�ļ�:");
		for(File fileItem:files) {
			System.out.println("\t"+fileItem.getName());
		}
	}
	*/
	public static void  getJava(File file) {
		File[] files=file.listFiles(new MyFilter(".java"));
		System.out.println("Java�ļ�:");
		for(File fileItem:files) {
			System.out.println(fileItem.getName());
		}
	}
/*
	public static void getJava(File file) {
		File[] files=file.listFiles();
		System.out.println("���е�java�ļ���:");
		for(File temp:files) {
			if(temp.getName().endsWith(".java")&&file.isFile()) {
				System.out.println(temp.getName());
			}//������������
			if(temp.getName().matches(".+\\.java")&&temp.isFile()) {
				System.out.println(temp.getName());
			}
		}
	}*/
	
	public static void listFile(File file) {
		File[] files=file.listFiles();
		System.out.println("�ļ�:");
		for(File fileItem:files) {
			if(fileItem.isFile()) {
				System.out.println("\t"+fileItem.getName());
			}
		}
		System.out.println("�ļ���:");
		for(File fileItem:files) {
			if(fileItem.isDirectory()) {
				System.out.println("\t"+fileItem.getName());
			}
		}
	}
	
}
