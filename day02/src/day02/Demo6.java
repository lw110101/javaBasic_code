package day02;

import java.util.Arrays;

/*  其他方法：
String replace(char oldChar,char newChar)  替换
String[] split(String regex)  切割
String substring(int beginIndex)
String substring(int beginIndex,int endIndex)  截取字符串
String toUpperCase() 转大写
String toLowerCase()  转小写
String trim()  去除空格
 */
public class Demo6 {

	public static void main(String[] args) {
		String str="明天周末,我们要上课！";
		String str1="A-B-C-D-E-F-G-H-I";
		String[] arr=str1.split("-");
		String str2="abHGJbhghBhbhjV";
		String str3="      抬头看日光倾斜， 心随流水潺潺身轻欲上九天          ";
		System.out.println("替换："+str.replace("要上课！","休息，可以睡懒觉！"));
		System.out.println("切割："+Arrays.toString(arr));
		System.out.println("截取："+str.substring(5));
		System.out.println("包头不包尾截取："+str.substring(2,6));
		System.out.println("转大写："+str2.toUpperCase());
		System.out.println("转小写："+str2.toLowerCase());
		System.out.println("去除空格："+str3.trim());
	}

}
