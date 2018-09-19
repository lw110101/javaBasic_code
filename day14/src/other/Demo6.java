package other;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

//ת����:InputStreamReader       OutputStreamWriter
public class Demo6 {

	public static void main(String[] args) throws IOException {
		readTest();
		//writeTest2();
		
	}
	//ʹ��OutputStreamWriterָ��������д����
	public static void writeTest2() throws IOException {
		
		File file=new File("C:\\Users\\hasee\\Desktop\\a.txt");
		
		OutputStream out=new FileOutputStream(file);
		
		OutputStreamWriter outputStreamWriter=new OutputStreamWriter(out, "utf-8");
		
		outputStreamWriter.write("�Ǹ߹������ǣ����ǵ͹����Լ��أ�");
		
		outputStreamWriter.close();
	}
	
	//ʹ��InputStreamReaderָ�������ж�ȡ����
	public static void readTest2() throws IOException {
		
		File file=new File("C:\\Users\\hasee\\Desktop\\a.txt");
		FileInputStream inputStream=new FileInputStream(file);
		
		InputStreamReader inputStreamReader=new InputStreamReader(inputStream,"gbk");
		
		BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
		
		int length=0;
		
		char[] buf=new char[1024];
		
		while((length=bufferedReader.read(buf))!=-1) {
			System.out.println("ʹ��UTF-8��ȡ��������:"+new String(buf,0,length));
		}
		bufferedReader.close();
	}
	
	//OutputStreamWriter��ʹ��
	public static void writeTest() throws IOException {
		
		File file=new File("C:\\Users\\hasee\\Desktop\\a.txt");
		
		FileOutputStream fileOutputStream=new FileOutputStream(file);
		//�ֽ���ת�����ַ���
		OutputStreamWriter outputStreamWriter=new OutputStreamWriter(fileOutputStream);
		
		outputStreamWriter.write("�ϲ���ѧ������װѧԺ15�Ʊ���ΰ");
		
		outputStreamWriter.close();
		
		/*String str="�ϲ���ѧ������װѧԺ15�Ʊ���ΰ";
		byte[] buf=str.getBytes();
		fileOutputStream.write(buf);
		fileOutputStream.close();*/
	}
	//InputStreamReader��ʹ��
	public static void readTest() throws IOException {
		//��ȡ��׼������
		InputStream in = System.in;
		//ֻ��ȡһ���ֽ�
		//System.out.println("��ȡ���ַ���:"+(char)in.read());
		//�ֽ���ת�����ַ���
		InputStreamReader inputStreamReader = new InputStreamReader(in);

	/*	System.out.println("��ȡ��������:"+inputStreamReader.read());*/
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		String line = null;

		while ((line = bufferedReader.readLine()) != null) {
			System.out.println("��ȡ��������:" + line);
			if("quit".equalsIgnoreCase(line)) {
				break;
			}
		}
	
	}
}
