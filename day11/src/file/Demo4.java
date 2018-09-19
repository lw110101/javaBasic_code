package file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
��ȡ��
	getName()		��ȡ�ļ����ļ��е����ƣ��������ϼ�·����
	getPath()       ���ؾ���·�������������·��������Ŀ¼Ҫָ��
	getAbsolutePath()	��ȡ�ļ��ľ���·�������ļ��Ƿ����û��ϵ
	length()		��ȡ�ļ��Ĵ�С���ֽ�����������ļ��������򷵻�0L��������ļ���Ҳ����0L��
	getParent()		���ش˳���·������Ŀ¼��·�����ַ����������·����û��ָ����Ŀ¼���򷵻�null��
	lastModified()	��ȡ���һ�α��޸ĵ�ʱ�䡣
*/
public class Demo4 {

	public static void main(String[] args) {
		
		File file=new File("C:\\Users\\hasee\\Desktop\\a.txt");
		System.out.println("��ȡ�ļ�����:"+file.getName());
		System.out.println("��ȡ����·��:"+file.getPath());
		System.out.println("��ȡ�ļ�����·��:"+file.getAbsolutePath());
		System.out.println("��ȡ�ļ���С:"+file.length());
		System.out.println("��ȡ��Ŀ¼:"+file.getParent());
		System.out.println("���һ���޸�ʱ��(����):"+file.lastModified());
		
		//���뻻���Լ���Ҫ�ĸ�ʽ
		Date date=new Date(file.lastModified());
		SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str=dateformat.format(date);
		System.out.println("���һ���޸�ʱ����:"+str);
		
		
	}
}
