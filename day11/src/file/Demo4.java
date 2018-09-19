package file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
获取：
	getName()		获取文件或文件夹的名称，不包含上级路径。
	getPath()       返回绝对路径，可以是相对路径，但是目录要指定
	getAbsolutePath()	获取文件的绝对路径，与文件是否存在没关系
	length()		获取文件的大小（字节数），如果文件不存在则返回0L，如果是文件夹也返回0L。
	getParent()		返回此抽象路径名父目录的路径名字符串；如果此路径名没有指定父目录，则返回null。
	lastModified()	获取最后一次被修改的时间。
*/
public class Demo4 {

	public static void main(String[] args) {
		
		File file=new File("C:\\Users\\hasee\\Desktop\\a.txt");
		System.out.println("获取文件名字:"+file.getName());
		System.out.println("获取绝对路径:"+file.getPath());
		System.out.println("获取文件绝对路径:"+file.getAbsolutePath());
		System.out.println("获取文件大小:"+file.length());
		System.out.println("获取父目录:"+file.getParent());
		System.out.println("最后一次修改时间(毫秒):"+file.lastModified());
		
		//毫秒换成自己想要的格式
		Date date=new Date(file.lastModified());
		SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str=dateformat.format(date);
		System.out.println("最后一次修改时间是:"+str);
		
		
	}
}
