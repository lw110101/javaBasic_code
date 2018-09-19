package day02;

import java.util.Arrays;

/*  转换方法：
String(char[] value) 将字符数组转换为字符串
String(char[] value,int offset,int count)
static String valueOf(char[] data)
static String valueOf(char[] data,int offset,int count)
char[] toCharArray()  将字符串转换字符数组
byte[] getBytes();   转换为字节数组
 */
public class Demo5 {

	public static void main(String[] args) {
		String str=new String();
		char[] buf={'南','昌','大','学','人','民','武','装','学','院'};
		str=new String(buf);
		str=new String(buf,4,6);
		
		String str1="好好学习，天天向上";
		char[] arr=str1.toCharArray();
		byte[] bytes=str1.getBytes();
		
		System.out.println("字符数组转换为字符串:"+str);
		System.out.println("指定字符："+String.valueOf(buf));
		System.out.println("指定字符："+String.valueOf(buf,4,6));
		System.out.println("将字符串转换字符数组："+Arrays.toString(arr));
		System.out.println("转换为字节数组:"+Arrays.toString(bytes));
	}

}
