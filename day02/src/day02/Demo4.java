package day02;
/* 判断方法：
boolean endsWith(String str)  是否以指定的字符串结束
boolean isEmpty()  是否长度为0
boolean contains(CharSequences)  是否包含指定序列(内容) 应用：搜索
boolean equals(Object anObject)  内容是否相等
boolean equalsIgnoreCase(String anotherString)   内容是否一致，忽略大小写比较
 */
public class Demo4 {

	public static void main(String[] args) {
		String str="Water has a thing, heartless, ruthless, you mean to me";
		String str1="what are you doing?";
		String str2="WHAT ARE YOU DOING?";
		
		System.out.println("是否以指定的字符串结束?"+str.endsWith("water"));
		System.out.println("是否长度为0?"+str.isEmpty());
		System.out.println("是否包含指定序列(内容)?"+str.contains("mean"));
		System.out.println("内容是否相等?"+str.equals(str1));
		System.out.println("忽略大小写，内容是否一致？"+str1.equalsIgnoreCase(str2));
	}

}
