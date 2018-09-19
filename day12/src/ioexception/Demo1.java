package ioexception;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*//IO�쳣�Ĵ���
��IOException���ݸ�RuntimeException��װһ�㣬Ȼ�����׳���Ŀ����Ϊ���õ�����ʹ�ñ�ø�����
*/
public class Demo1 {

	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		
		FileInputStream fileInputStream = null;
		try {
			File file = new File("C:\\Users\\hasee\\Desktop\\aa.txt");
			fileInputStream = new FileInputStream(file);
			int length = 0;
			byte[] buf = new byte[1024];
			System.out.println("��ȡ��������:");
			while ((length = fileInputStream.read(buf)) != -1) {
				System.out.println(new String(buf, 0, length));
			}
		} catch (IOException e) {
			System.out.println("��ȡ�ļ�����!");
			throw new RuntimeException(e);
		} finally {
			try {
				if(fileInputStream!=null) {
				fileInputStream.close();
				System.out.println("�رճɹ�");
				}
			} catch (IOException e) {
				System.out.println("�ر�ʧ��");
				throw new RuntimeException(e);
			}
		}
	}
}
