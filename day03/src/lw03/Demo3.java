package lw03;
/*
 * append(boolean b) 可以添加任意类型的数据
	insert(int offset, boolean b) 指定插入的索引值插入对应的内容  

删除：
	delete(int start, int end)  根据指定的开始与结束索引值删除对应内容
	deleteCharAt(int index)  根据指定索引值删除一个字符
查看：
	charAt(int index)
	capacity()  查看字符数组的长度
	length()  查看存储字符个数
	lastIndexOf(String str) 
	indexOf(String str, int fromIndex) 查找指定查找位置查看指定内容第一次出现的索引值
	toString  把字符串缓存类的内容以字符串返回
 
修改：
	ensureCapacity(int minimumCapacity)  指定StringBuffer内部字符数组长度
	substring(int start，int end)  根据指定的开始与结束索引值截取子串
	replace(int start, int end, String str)  根据指定的开始与结束索引值替代指定内容
	reverse()  反转
	setCharAt(int index, char ch)  把指定字符替换到指定索引值处

 */
public class Demo3 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();//默认16个字符.增加一倍+2
		sb.append("南昌大学人民武装学院");
		sb.append(123);
		sb.append(true);
		sb.insert(10,"刘伟");
		sb.delete(12, 15);
		sb.deleteCharAt(15);
		sb.append("imlwejavaabcjavaacbjkh");
		String str=sb.toString();
	//增删	
	System.out.println(sb);
	//查看
	System.out.println(sb.capacity());
	System.out.println(sb.length());
	System.out.println(sb.lastIndexOf("人民"));
	System.out.println(sb.indexOf("java",1));
	System.out.println("字符内容是："+str);
	System.out.println("查看charAt:"+sb.charAt(5));
	//修改
	sb.setCharAt(5, '大');//void返回类型
	System.out.println("截取的字符串是："+sb.substring(0, 10));
	System.out.println("replace方法："+sb.replace(12, 37, "15计算机科学与技术"));
	System.out.println(sb);
	System.out.println("反转："+sb.reverse());

}
}
