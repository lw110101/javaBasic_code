package other;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

//Properties
public class Demo2 {

	public static void main(String[] args) throws IOException {
	  //creatProperties();
		readProperties();

	}
	//读取配置文件
	public static void readProperties() throws IOException{
		//创建Properties对象
		Properties properties=new Properties();
		
		properties.load(new FileReader("C:\\Users\\hasee\\Desktop\\Propertie.properties") );
	
		Set<Entry<Object, Object>> set=properties.entrySet();
		for(Entry<Object, Object> entry:set) {
			System.out.println("配置信息:"+entry);
		}
		//遍历2：properties.list(System.out);
		
		properties.setProperty("陈鹏", "15");
		properties.store(new FileWriter("C:\\Users\\hasee\\Desktop\\Propertie.properties"), "vb");
	
	}
	
	//生成配置文件
	public static void creatProperties() throws IOException {
		//创建Properties对象
		Properties properties=new Properties();
		//设置Properties文件信息
		properties.setProperty("刘伟", "29");
		properties.setProperty("付豪", "07");
		properties.setProperty("陈鹏", "10");
		//生成文件信息
		properties.store(new FileWriter("C:\\Users\\hasee\\Desktop\\Propertie.properties"), "hh");
		
	}
}
