package file;

import java.io.File;

/*
ɾ����
	boolean delete()	ɾ���ļ���һ�����ļ��У�����ɾ��
	deleteOnExit()	�˳�jvmʱɾ���ļ�   һ������ɾ����ʱ�ļ�
�жϣ�
	exists()	�ļ����ļ����Ƿ���ڡ�
	isFile()	�Ƿ���һ���ļ�����������ڣ���ʼ��Ϊfalse��
	isDirectory()	�Ƿ���һ��Ŀ¼����������ڣ���ʼ��Ϊfalse��
	isHidden()	�Ƿ���һ�����ص��ļ����Ƿ������ص�Ŀ¼��
	isAbsolute()	���Դ˳���·�����Ƿ�Ϊ����·������
*/
public class Demo3 {

	public static void main(String[] args) {
		/*//ɾ��
		File file=new File("C:\\Users\\hasee\\Desktop\\a");
		System.out.println("ɾ���ɹ���"+file.delete());
		
		File file1=new File("C:\\Users\\hasee\\Desktop\\a.txt");
		file1.deleteOnExit();
		System.out.println("abc");//
		
		*///�ж�
		File file=new File("C:\\Users\\hasee\\Desktop\\JavaϹ��");
		System.out.println("�ļ��д�����"+file.exists());
	
		System.out.println("���ļ���"+file.isFile());
		System.out.println("���ļ�����"+file.isDirectory());
		System.out.println("�������ļ���"+file.isHidden());
		System.out.println("�Ǿ���·����"+file.isAbsolute());
		
	}
}
