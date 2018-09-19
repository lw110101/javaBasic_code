package other;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

//需求：使用properties运行本软件，超过三次，提示购买正版，退出jvm
public class Demo3 {

	public static void main(String[] args) throws IOException {
	
		File file=new File("C:\\Users\\hasee\\Desktop\\run.properties");
		if(!file.exists()) {
			file.createNewFile();
		}
		Properties properties=new Properties();
		properties.load(new FileInputStream(file));
		String value=properties.getProperty("count");
		int count=0;
		if(value!=null) {
			count=Integer.parseInt(value);
		}
		
		if(count==3) {
			System.out.println("该软件的使用次数已经超过了试用次数，请购买正版软件!");
			System.exit(0);
		}
		count++;
		System.out.println("该软件已经运行了"+count+"次");
		
		properties.setProperty("count", count+"");
		properties.store(new FileOutputStream(file), "runcount");
		
		
		
	}
}
