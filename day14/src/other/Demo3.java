package other;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

//����ʹ��properties���б�������������Σ���ʾ�������棬�˳�jvm
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
			System.out.println("�������ʹ�ô����Ѿ����������ô������빺���������!");
			System.exit(0);
		}
		count++;
		System.out.println("������Ѿ�������"+count+"��");
		
		properties.setProperty("count", count+"");
		properties.store(new FileOutputStream(file), "runcount");
		
		
		
	}
}
