package other;
/*
����1���г�һ���ļ��е������ļ���Ŀ¼��

2���г�ָ��Ŀ¼�����е������ļ�������Ŀ¼����Ҫ������ǰ��Ҫ����Ӧ�����Ŀո�
		��һ��ǰ����0�����ڶ���ǰ����1����������ǰ����2��...���Դ����ơ�

3���г�ָ��Ŀ¼�����е������ļ�������Ŀ¼����Ҫ��Ҫ����״�ṹ��Ч��������ʾ��
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

����4: ɾ��һ���ǿյ��ļ��С� 

*/

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class Demo8 {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\hasee\\Desktop\\ps��־");
		//listFile1(file);
		//listFile2(file,"");
		listFile3(file,"|--");
		
		File dir=new File("C:\\Users\\hasee\\Desktop\\aa");
		deleteFile(dir);
	}
	
	//����4: ɾ��һ���ǿյ��ļ��С�
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
	
	//3���г�ָ��Ŀ¼�����е������ļ�������Ŀ¼����Ҫ��Ҫ����״�ṹ��Ч��������ʾ
	public static void listFile3(File dir, String space) throws IOException {

		File[] files = dir.listFiles();
		System.setOut(new PrintStream("C:\\Users\\hasee\\Desktop\\a.txt"));
		for (File file : files) {
			if (file.isFile()) {
				System.out.println(space + "�ļ�����:" + file.getName());
			} else if (file.isDirectory()) {
				System.out.println(space + "�ļ�������:" + file.getName());
				listFile2(file, "|    " + space);

			}
		}
	}
	
	//2���г�ָ��Ŀ¼�����е������ļ�������Ŀ¼����Ҫ������ǰ��Ҫ����Ӧ�����Ŀո񣺵�һ��ǰ����0�����ڶ���ǰ����1����������ǰ����2��...���Դ����ơ�
	public static void listFile2(File dir,String space) {
		
		File[] files = dir.listFiles();
		for (File file : files) {
			if (file.isFile()) {
				System.out.println(space + "�ļ�����:" + file.getName());
			} else if (file.isDirectory()) {
				System.out.println(space + "�ļ�������:" + file.getName());
				listFile2(file, "    " + space);

			}
		}
	}
	
	//����1���г�һ���ļ��е������ļ���Ŀ¼��
	public static void listFile1(File dir) {

		File[] files=dir.listFiles();
		for(File file:files) {
			if(file.isFile()) {
				System.out.println("�ļ�����:"+file.getName());
			}else if(file.isDirectory()) {
				System.out.println("�ļ�������:"+file.getName());
				listFile1(file);
			}
		}
	}
}
