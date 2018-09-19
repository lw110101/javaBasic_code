package sequenceInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

//MP3的拆与合并
public class Demo2 {

	public static void main(String[] args) throws IOException {
		splitMp3();
		mergeMp3();
	}
	//合并MP3
	public static void mergeMp3() throws IOException {
		
		File outfile1=new File("C:\\Users\\hasee\\Desktop\\1");
		File outfile2=new File("C:\\Users\\hasee\\Desktop\\2");
		File outfile3=new File("C:\\Users\\hasee\\Desktop\\3");
		File outfile4=new File("C:\\Users\\hasee\\Desktop\\4");
		File outfile5=new File("C:\\Users\\hasee\\Desktop\\5");
		File outfile6=new File("C:\\Users\\hasee\\Desktop\\6");
		File file=new File("C:\\Users\\hasee\\Desktop\\流年.mp3");
		
		FileInputStream fileInputStream1=new FileInputStream(outfile1);
		FileInputStream fileInputStream2=new FileInputStream(outfile2);
		FileInputStream fileInputStream3=new FileInputStream(outfile3);
		FileInputStream fileInputStream4=new FileInputStream(outfile4);
		FileInputStream fileInputStream5=new FileInputStream(outfile5);
		FileInputStream fileInputStream6=new FileInputStream(outfile6);
		FileOutputStream fileOutputStream=new FileOutputStream(file);
		
		Vector<FileInputStream> vector=new Vector<FileInputStream>();
		vector.add(fileInputStream1);
		vector.add(fileInputStream2);
		vector.add(fileInputStream3);
		vector.add(fileInputStream4);
		vector.add(fileInputStream5);
		vector.add(fileInputStream6);
		Enumeration<FileInputStream> e=vector.elements();
	
		SequenceInputStream sequenceInputStream=new SequenceInputStream(e);
		
		byte[] buf=new byte[1024];
		int length=0;
		while((length=sequenceInputStream.read(buf))!=-1) {
			fileOutputStream.write(buf, 0, length);
		}
		sequenceInputStream.close();
		fileOutputStream.close();
	}
	//拆MP3	
	public static void splitMp3() throws IOException {
		
		File file=new File("C:\\Users\\hasee\\Desktop\\王菲 - 流年.mp3");
		File outfile1=new File("C:\\Users\\hasee\\Desktop\\1");
		File outfile2=new File("C:\\Users\\hasee\\Desktop\\2");
		File outfile3=new File("C:\\Users\\hasee\\Desktop\\3");
		File outfile4=new File("C:\\Users\\hasee\\Desktop\\4");
		File outfile5=new File("C:\\Users\\hasee\\Desktop\\5");
		File outfile6=new File("C:\\Users\\hasee\\Desktop\\6");
		
		FileInputStream fileInputStream=new FileInputStream(file);
		FileOutputStream fileOutputStream1=new FileOutputStream(outfile1);
		FileOutputStream fileOutputStream2=new FileOutputStream(outfile2);
		FileOutputStream fileOutputStream3=new FileOutputStream(outfile3);
		FileOutputStream fileOutputStream4=new FileOutputStream(outfile4);
		FileOutputStream fileOutputStream5=new FileOutputStream(outfile5);
		FileOutputStream fileOutputStream6=new FileOutputStream(outfile6);
		
		byte[] buf=new byte[1024];
		int length=0;
		int count=0;
		while ((length = fileInputStream.read(buf)) != -1) {
			count++;
			if (count <= 1024 * 2) {
				fileOutputStream1.write(buf, 0, length);
			} else if (count <= 1024 * 4) {
				fileOutputStream2.write(buf, 0, length);
			} else if (count <= 1024 * 6) {
				fileOutputStream3.write(buf, 0, length);
			} else if (count <= 1024 * 8) {
				fileOutputStream4.write(buf, 0, length);
			} else if (count <= 1024 * 10) {
				fileOutputStream5.write(buf,0,length);
			}else if(count<=1024*12) {
				fileOutputStream6.write(buf,0,length);
			}
		}
		fileOutputStream6.close();
		fileOutputStream5.close();
		fileOutputStream4.close();
		fileOutputStream3.close();
		fileOutputStream2.close();
		fileOutputStream1.close();
		fileInputStream.close();
	}
}
