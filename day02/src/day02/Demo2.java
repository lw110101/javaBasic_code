/*构造方法：
String()  创建一个空内容的字符串。
String(byte[] bytes) 使用一个字节数组构建一个字符串对象。如：97，98，99-->abc
String(byte[] bytes, int offset, int length)
	bytes:要解码的数组
	offset：指定从数组的哪个索引值开始解码
	length：需要解码的个数
String(char[] value)  使用一个字符数组构建一个字符串
String(char[] value, int offset, int count) 使用一个字符数组构建一个字符串，指定开始解码的索引值和解码个数
String(int[] codePoints, int offset, int count)
String(String original)   使用字符串构建字符串 **
 * 
 */
package day02;

public class Demo2 {
	public static void main(String[] args) {
		String str=new String();
		
		byte[] bytes={97,98,99,100,101,102};
		str=new String(bytes);
		str=new String(bytes,2,3);
		
		char[] ch={'南','昌','大','学','人','民','武','装','学','院'};
		str=new String(ch);
		str=new String(ch,4,6);
		
		int[] arr={65,66,67,68,69,70};
		str=new String(arr,2,3);
		
		String a="好好学java";
		str=new String(a);
		str = new String("天天听少司命的歌曲");
		System.out.println("创建的字符串："+str);
		
		
	}

}
