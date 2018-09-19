package input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//输入字节流：InputStream
public class Demo1 {

	public static void main(String[] args) throws IOException {
		
		testRead1();
		testRead2();
		testRead3();
		testRead4();
	}
	
	//方法四：read(byte[] b)配合循环
	public static void testRead4() throws IOException {
		long startTime=System.currentTimeMillis();
		File file=new File("C:\\Users\\hasee\\Desktop\\day01.txt");
		FileInputStream fileInputStream=new FileInputStream(file);
		byte[] b=new byte[1024];
		int length=0;
		System.out.println("读取的内容是:");
		while((length=fileInputStream.read(b))!=-1) {
			String content=new String(b,0,length);
			System.out.print(content+"  ");
		}
		fileInputStream.close();
		long endTime=System.currentTimeMillis();
		System.out.println("读取的时间是:"+(endTime-startTime));
		
	}
	
	//方法三：read(byte[] b):
	public static void testRead3() throws IOException {
		
		File file=new File("C:\\Users\\hasee\\Desktop\\a.txt");
		FileInputStream fileInputStream=new FileInputStream(file);
		byte[] b=new byte[64];
		int length=fileInputStream.read(b);
		String content=new String(b,0,length);
		System.out.println("\r\n读取的数据是:"+content);
		fileInputStream.close();
		
	}
	
	//方法二read()配合循环：
	public static void testRead2() throws IOException {
		long startTime=System.currentTimeMillis();
		File file=new File("C:\\Users\\hasee\\Desktop\\day01.txt");
		FileInputStream fileInputStream=new FileInputStream(file);
		int content=0;
		System.out.print("读取的内容是:");
		while((content=fileInputStream.read())!=-1) {
			System.out.print(content+"  ");
		}	
		fileInputStream.close();
		long endTime=System.currentTimeMillis();
		System.out.println("\r\n读取的时间是:"+(endTime-startTime));
	}
//读取方法一：一次只能读取一个字节
	public static void testRead1() throws FileNotFoundException, IOException {
		
		File file=new File("C:\\Users\\hasee\\Desktop\\a.txt");
		FileInputStream fileInputStream=new FileInputStream(file);
		int content=fileInputStream.read();//返回一个字节码
		System.out.println("读取的内容是:"+content);
		fileInputStream.close();
		
	}
}
