package file;
/*
 * File��Ĺ��췽����
	File(File parent, String child)  ���ݸ�·������·�����ַ�������File��
          	 
	File(String pathname)  ָ���ļ����ļ��е�·������һ��File�ļ�
         	
	File(String parent, String child)   ���ݸ�·�����ַ�������·�����ַ�������File��
*/
import java.io.File;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) throws IOException {

		File file=new File("C:\\Users\\hasee\\Desktop\\Java��־");
		System.out.println("���ļ�������"+file.exists());
		
		File parentFile=new File("C:\\Users\\hasee\\Desktop");
		File file1=new File(parentFile,"Java��־");
		System.out.println("���ļ�������"+file1.exists());
		
		File file2=new File("C:\\Users\\hasee\\Desktop","Java��־");
		System.out.println("���ļ�������"+file2.exists());
		
		File file3=new File(".");
		System.out.println("��ǰ·��:"+file3.getAbsolutePath());
		System.out.println("��׼·��:"+file.getCanonicalPath());
	
		
		
	}
}
