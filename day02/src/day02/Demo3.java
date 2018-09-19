package day02;
/*
 获取方法：
int length()  获取字符串的长度。
char charAt(int index) 获取特定位置的字符（角标越界）
int indexOf(String str)  获取特定字符的第一次出现的位置,如果找不到返回-1（overload）
int lastIndexOf(int ch)  获取特定字符的最后出现的位置,如果找不到返回-1
 *///Java中用int表示所有Unicode代码点,int能表示出char不能表示的增补字符
public class Demo3 {

	public static void main(String[] args) {
		String str="good good study,day day up!";

		System.out.println("字符串长度是："+str.length());
		System.out.println("获取特定位置的字符："+str.charAt(5));
		System.out.println("获取字符第一次出现的位置是："+str.indexOf("day"));
		System.out.println("获取字符最后出现的位置是："+str.lastIndexOf(5));
	}

}
