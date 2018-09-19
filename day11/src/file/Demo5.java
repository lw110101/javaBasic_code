package file;

import java.io.File;

/*
�ļ�����أ�
staic File[] listRoots()	�г����еĸ�Ŀ¼��Window�о�������ϵͳ���̷���
String[] list()				����Ŀ¼�µ��ļ�����Ŀ¼�������������ļ��������ļ����������᷵��null��
File[] listFiles()		����Ŀ¼�µ��ļ�����Ŀ¼����File��ʵ���������������ļ��������ļ����������᷵��null��

String[] list(FilenameFilter filter)	����ָ����ǰĿ¼�з��Ϲ������������ļ�����Ŀ¼�������ļ����������᷵��null��		
File[] listFiles(FilenameFilter filter)	����ָ����ǰĿ¼�з��Ϲ������������ļ�����Ŀ¼�������ļ����������᷵��null��
*/
public class Demo5 {

	public static void main(String[] args) {
		
		File file=new File("C:\\Users\\hasee\\Desktop\\HTML��־");
		File[] list=File.listRoots();
		for(File temp:list) {
			System.out.println(temp);
		}
		
		System.out.println("��ȡĿ¼�µ��ļ����ļ�����:");
		String[] arr=file.list();
		for(String a:arr) {
			System.out.println(a);
		}
		
		System.out.println("��ȡĿ¼�µ��ļ����ļ���:");
		File[] list1=file.listFiles();
		for(File b:list1) {
			System.out.println("�ļ���:"+b.getName());
		}
		System.out.println("\\");
		
	}
}
