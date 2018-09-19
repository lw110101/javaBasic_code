package other;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

//编码与解码
public class Demo5 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String str="南昌大学";
		byte[] buf=str.getBytes("utf-8");
		System.out.println("数组元素是:"+Arrays.toString(buf));
		str=new String(buf,"utf-8");
		System.out.println(str);
		
		String str1="人民武装";
		byte[] buf1=str1.getBytes("unicode");
		System.out.println("数组元素是:"+Arrays.toString(buf1));
		
		String str2="15计本";
		byte[] buf2=str2.getBytes();
		System.out.println("数组元素是:"+Arrays.toString(buf2));
		
		str2=new String(buf2,"iso8859-1");
		System.out.println(str2);
		buf2=str2.getBytes("iso8859-1");
		str2=new String(buf2);
		System.out.println(str2);
	}
}
