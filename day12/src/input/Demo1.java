package input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//�����ֽ�����InputStream
public class Demo1 {

	public static void main(String[] args) throws IOException {
		
		testRead1();
		testRead2();
		testRead3();
		testRead4();
	}
	
	//�����ģ�read(byte[] b)���ѭ��
	public static void testRead4() throws IOException {
		long startTime=System.currentTimeMillis();
		File file=new File("C:\\Users\\hasee\\Desktop\\day01.txt");
		FileInputStream fileInputStream=new FileInputStream(file);
		byte[] b=new byte[1024];
		int length=0;
		System.out.println("��ȡ��������:");
		while((length=fileInputStream.read(b))!=-1) {
			String content=new String(b,0,length);
			System.out.print(content+"  ");
		}
		fileInputStream.close();
		long endTime=System.currentTimeMillis();
		System.out.println("��ȡ��ʱ����:"+(endTime-startTime));
		
	}
	
	//��������read(byte[] b):
	public static void testRead3() throws IOException {
		
		File file=new File("C:\\Users\\hasee\\Desktop\\a.txt");
		FileInputStream fileInputStream=new FileInputStream(file);
		byte[] b=new byte[64];
		int length=fileInputStream.read(b);
		String content=new String(b,0,length);
		System.out.println("\r\n��ȡ��������:"+content);
		fileInputStream.close();
		
	}
	
	//������read()���ѭ����
	public static void testRead2() throws IOException {
		long startTime=System.currentTimeMillis();
		File file=new File("C:\\Users\\hasee\\Desktop\\day01.txt");
		FileInputStream fileInputStream=new FileInputStream(file);
		int content=0;
		System.out.print("��ȡ��������:");
		while((content=fileInputStream.read())!=-1) {
			System.out.print(content+"  ");
		}	
		fileInputStream.close();
		long endTime=System.currentTimeMillis();
		System.out.println("\r\n��ȡ��ʱ����:"+(endTime-startTime));
	}
//��ȡ����һ��һ��ֻ�ܶ�ȡһ���ֽ�
	public static void testRead1() throws FileNotFoundException, IOException {
		
		File file=new File("C:\\Users\\hasee\\Desktop\\a.txt");
		FileInputStream fileInputStream=new FileInputStream(file);
		int content=fileInputStream.read();//����һ���ֽ���
		System.out.println("��ȡ��������:"+content);
		fileInputStream.close();
		
	}
}
