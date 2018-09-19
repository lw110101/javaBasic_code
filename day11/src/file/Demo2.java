package file;

import java.io.File;
import java.io.IOException;

/*
 * ������
	createNewFile()	��ָ��λ�ô���һ�����ļ����ɹ��ͷ���true������Ѵ��ھͲ�����Ȼ�󷵻�false
	mkdir()			���������ļ���
	mkdirs()		��ָ��λ�ô���Ŀ¼����ᴴ��·�������в����ڵ�Ŀ¼��
	renameTo(File dest)	�������ļ����ļ��У�Ҳ���Բ����ǿյ��ļ��У��ļ���ͬʱ�൱���ļ��ļ���,
			����ʱ���ܲ����ǿյ��ļ��С��ƶ�/�������ɹ��򷵻�true��ʧ���򷵻�false��
*/
public class Demo2 {

	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\Users\\hasee\\Desktop\\lw.txt");
		System.out.println("�����ļ��ɹ���"+file.createNewFile());
		
		File file1=new File("C:\\Users\\hasee\\Desktop\\lw");
		System.out.println("�����ļ��гɹ���"+file1.mkdir());
		
		File file2=new File("C:\\Users\\hasee\\Desktop\\lw\\abc\\a.txt");
		System.out.println("�����༶�ļ��гɹ���"+file2.mkdirs());
		
		File destFile=new File("C:\\Users\\hasee\\Desktop\\c");
		System.out.println("�������ɹ���"+file1.renameTo(destFile));
		
		File destFile1=new File("C:\\a");
		System.out.println("���гɹ���"+file.renameTo(destFile1));
		
	}
}

