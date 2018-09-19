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

//转换流:InputStreamReader       OutputStreamWriter
public class Demo6 {

	public static void main(String[] args) throws IOException {
		readTest();
		//writeTest2();
		
	}
	//使用OutputStreamWriter指定码表进行写数据
	public static void writeTest2() throws IOException {
		
		File file=new File("C:\\Users\\hasee\\Desktop\\a.txt");
		
		OutputStream out=new FileOutputStream(file);
		
		OutputStreamWriter outputStreamWriter=new OutputStreamWriter(out, "utf-8");
		
		outputStreamWriter.write("是高估了你们，还是低估了自己呢？");
		
		outputStreamWriter.close();
	}
	
	//使用InputStreamReader指定码表进行读取数据
	public static void readTest2() throws IOException {
		
		File file=new File("C:\\Users\\hasee\\Desktop\\a.txt");
		FileInputStream inputStream=new FileInputStream(file);
		
		InputStreamReader inputStreamReader=new InputStreamReader(inputStream,"gbk");
		
		BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
		
		int length=0;
		
		char[] buf=new char[1024];
		
		while((length=bufferedReader.read(buf))!=-1) {
			System.out.println("使用UTF-8读取的内容是:"+new String(buf,0,length));
		}
		bufferedReader.close();
	}
	
	//OutputStreamWriter的使用
	public static void writeTest() throws IOException {
		
		File file=new File("C:\\Users\\hasee\\Desktop\\a.txt");
		
		FileOutputStream fileOutputStream=new FileOutputStream(file);
		//字节流转换成字符流
		OutputStreamWriter outputStreamWriter=new OutputStreamWriter(fileOutputStream);
		
		outputStreamWriter.write("南昌大学人民武装学院15计本刘伟");
		
		outputStreamWriter.close();
		
		/*String str="南昌大学人民武装学院15计本刘伟";
		byte[] buf=str.getBytes();
		fileOutputStream.write(buf);
		fileOutputStream.close();*/
	}
	//InputStreamReader的使用
	public static void readTest() throws IOException {
		//获取标准输入流
		InputStream in = System.in;
		//只读取一个字节
		//System.out.println("读取的字符是:"+(char)in.read());
		//字节流转换成字符流
		InputStreamReader inputStreamReader = new InputStreamReader(in);

	/*	System.out.println("读取的内容是:"+inputStreamReader.read());*/
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		String line = null;

		while ((line = bufferedReader.readLine()) != null) {
			System.out.println("读取的内容是:" + line);
			if("quit".equalsIgnoreCase(line)) {
				break;
			}
		}
	
	}
}
