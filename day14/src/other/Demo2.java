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
	//��ȡ�����ļ�
	public static void readProperties() throws IOException{
		//����Properties����
		Properties properties=new Properties();
		
		properties.load(new FileReader("C:\\Users\\hasee\\Desktop\\Propertie.properties") );
	
		Set<Entry<Object, Object>> set=properties.entrySet();
		for(Entry<Object, Object> entry:set) {
			System.out.println("������Ϣ:"+entry);
		}
		//����2��properties.list(System.out);
		
		properties.setProperty("����", "15");
		properties.store(new FileWriter("C:\\Users\\hasee\\Desktop\\Propertie.properties"), "vb");
	
	}
	
	//���������ļ�
	public static void creatProperties() throws IOException {
		//����Properties����
		Properties properties=new Properties();
		//����Properties�ļ���Ϣ
		properties.setProperty("��ΰ", "29");
		properties.setProperty("����", "07");
		properties.setProperty("����", "10");
		//�����ļ���Ϣ
		properties.store(new FileWriter("C:\\Users\\hasee\\Desktop\\Propertie.properties"), "hh");
		
	}
}
