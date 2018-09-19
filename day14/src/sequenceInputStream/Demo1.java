package sequenceInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

//需求：合并两个文件内容
public class Demo1 {

	public static void main(String[] args) throws IOException {
		merge3();
	}
	//合并3个以上文件
	public static void merge3() throws IOException{
		
		File inFile1=new File("C:\\Users\\hasee\\Desktop\\a.txt");
		File inFile2=new File("C:\\Users\\hasee\\Desktop\\b.txt");
		File inFile3=new File("C:\\Users\\hasee\\Desktop\\c.txt");
		File outFile=new File("C:\\Users\\hasee\\Desktop\\d.txt");
		
		FileOutputStream fileOutputStream=new FileOutputStream(outFile);
		FileInputStream fileInputStream1=new FileInputStream(inFile1);
		FileInputStream fileInputStream2=new FileInputStream(inFile2);
		FileInputStream fileInputStream3=new FileInputStream(inFile3);
	
		Vector<FileInputStream> vector=new Vector<FileInputStream>();
		vector.add(fileInputStream1);
		vector.add(fileInputStream2);
		vector.add(fileInputStream3);
		Enumeration<FileInputStream> e=vector.elements();
		
		SequenceInputStream sequenceInputStream=new SequenceInputStream(e);
		
		int length=0;
		byte[] buf=new byte[1024];
		while((length=sequenceInputStream.read(buf))!=-1) {
			fileOutputStream.write(buf, 0, length);
		}
		sequenceInputStream.close();
		fileOutputStream.close();
		
	}
	
	//使用SequenceInputStream合并
	public static void merge2() throws IOException {
		
		File inFile1=new File("C:\\Users\\hasee\\Desktop\\a.txt");
		File inFile2=new File("C:\\Users\\hasee\\Desktop\\b.txt");
		File outFile=new File("C:\\Users\\hasee\\Desktop\\c.txt");
		
		FileOutputStream fileOutputStream=new FileOutputStream(outFile);
		FileInputStream fileInputStream1=new FileInputStream(inFile1);
		FileInputStream fileInputStream2=new FileInputStream(inFile2);
		
		SequenceInputStream sequenceInputStream=new SequenceInputStream(fileInputStream1,fileInputStream2);
		int length=0;
		byte[] buf=new byte[1024];
		while((length=sequenceInputStream.read(buf))!=-1) {
			fileOutputStream.write(buf, 0, length);
		}
		sequenceInputStream.close();
		fileInputStream2.close();
		fileOutputStream.close();
	}
	
	//合并a.txt与b.txt
	public static void merge1() throws IOException {
		
		File inFile1=new File("C:\\Users\\hasee\\Desktop\\a.txt");
		File inFile2=new File("C:\\Users\\hasee\\Desktop\\b.txt");
		File outFile=new File("C:\\Users\\hasee\\Desktop\\c.txt");
		
		FileInputStream fileInputStream1=new FileInputStream(inFile1);
		FileInputStream fileInputStream2=new FileInputStream(inFile2);
		FileOutputStream fileOutputStream=new FileOutputStream(outFile);
		
		ArrayList<FileInputStream> list=new ArrayList<FileInputStream>();
		list.add(fileInputStream1);
		list.add(fileInputStream2);
		
		byte[] buf=new byte[1024];
		int length=0;
		
		for(int i=0;i<list.size();i++) {
			FileInputStream fileInputStream=list.get(i);
			while((length=fileInputStream.read(buf))!=-1) {
				fileOutputStream.write(buf, 0, length);
			}
			fileInputStream.close();
		}
		fileOutputStream.close();
	}
}
