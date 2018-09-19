package other;
//打印流
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
class Car{
	String color;
	int count;
	public Car(String color, int count) {
		this.color = color;
		this.count = count;
	}
	@Override
	public String toString() {
		
		return "颜色:"+this.color+"  数量:"+this.count;
	}
}
public class Demo4 {

	public static void main(String[] args) throws IOException {
		/*
		File file=new File("C:\\Users\\hasee\\Desktop\\a.txt");
		PrintStream printStream=new PrintStream(file);
		printStream.println(123);
		printStream.println("abc");
		printStream.println(new Car("白色",4));
		printStream.println('a');
		
		//System.setOut(printStream);
		System.out.println("南昌大学人民武装学院");//默认是在控制平台打印
		*/
		//异常日志的收集
		File file=new File("C:\\Users\\hasee\\Desktop\\2018-1-10.log");
		PrintStream printStream=new PrintStream(new FileOutputStream(file,true));
		try {
			int c=4/0;
			System.out.println("c="+c);
		}catch(Exception e) {
			e.printStackTrace(printStream);
		}
		printStream.close();
		
	}
}
