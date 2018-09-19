package sequenceInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Demo3 {

	public static void main(String[] args) throws IOException {
		cutFile();
		mergeFile();
		
	}
	//�и�
	public static void cutFile() throws IOException {
		
		File file=new File("C:\\Users\\hasee\\Desktop\\���� - ����.mp3");
		File dir=new File("C:\\Users\\hasee\\Desktop\\music");
		
		FileInputStream fileInputStream=new FileInputStream(file);
		byte[] buf=new byte[1024*1024*2];
		int length=0;
		for(int i=0;(length=fileInputStream.read(buf))!=-1;i++) {
			FileOutputStream fileOutputStream=new FileOutputStream(new File(dir,"part"+i+".mp3"));
			fileOutputStream.write(buf, 0, length);
			fileOutputStream.close();
		}
		fileInputStream.close();
	}
	//�ϲ�
	public static void mergeFile() throws IOException {
		
		File dir = new File("C:\\Users\\hasee\\Desktop\\music");
		Vector<FileInputStream> vector = new Vector<FileInputStream>();
		File[] files = dir.listFiles();
		for (File file : files) {
			if (file.getName().endsWith(".mp3")) {
				vector.add(new FileInputStream(file));
			}
		}
		Enumeration<FileInputStream> e = vector.elements();
		SequenceInputStream sequenceInputStream = new SequenceInputStream(e);

		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\hasee\\Desktop\\����.mp3");
		byte[] buf = new byte[1024];
		int length = 0;
		while ((length = sequenceInputStream.read(buf)) != -1) {
			fileOutputStream.write(buf, 0, length);
		}
		// �ر���Դ
		fileOutputStream.close();
		sequenceInputStream.close();
	}
}
