package other;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

//���������
public class Demo5 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String str="�ϲ���ѧ";
		byte[] buf=str.getBytes("utf-8");
		System.out.println("����Ԫ����:"+Arrays.toString(buf));
		str=new String(buf,"utf-8");
		System.out.println(str);
		
		String str1="������װ";
		byte[] buf1=str1.getBytes("unicode");
		System.out.println("����Ԫ����:"+Arrays.toString(buf1));
		
		String str2="15�Ʊ�";
		byte[] buf2=str2.getBytes();
		System.out.println("����Ԫ����:"+Arrays.toString(buf2));
		
		str2=new String(buf2,"iso8859-1");
		System.out.println(str2);
		buf2=str2.getBytes("iso8859-1");
		str2=new String(buf2);
		System.out.println(str2);
	}
}
