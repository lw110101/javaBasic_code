package regex;
/*
预定义字符类        
	. 任何字符（与行结束符可能匹配也可能不匹配） 
	\d 数字：[0-9] 
	\D 非数字： [^0-9] 
	\s 空白字符：[ \t\n\x0B\f\r] 
	\S 非空白字符：[^\s] 
	\w 单词字符：[a-zA-Z_0-9] 
	\W 非单词字符：[^\w] 
注意：任何预定义字符在没有加数量词之前都只能匹配一个字符。

Greedy 数量词 
	X? X，一次或一次也没有 
	X* X，零次或多次 
	X+ X，一次或多次 
	X{n} X，恰好 n 次 
	X{n,} X，至少 n 次 
	X{n,m} X，至少 n 次，但是不超过 m 次 

字符类 （范围词）
	[abc] a、b 或 c（简单类） 
	[^abc] 任何字符，除了 a、b 或 c（否定） 
	[a-zA-Z] a 到 z 或 A 到 Z，两头的字母包括在内（范围） 
	[a-d[m-p]] a 到 d 或 m 到 p：[a-dm-p]（并集） 
	[a-z&&[def]] d、e 或 f（交集） 
	[a-z&&[^bc]] a 到 z，除了 b 和 c：[ad-z]（减去） 
	[a-z&&[^m-p]] a 到 z，而非 m 到 p：[a-lq-z]（减去） 
注意：任何范围词在没加数量词之前都只能匹配一个字符。
*/
public class Demo2 {

	public static void main(String[] args) {
		//预定义字符类      
		System.out.println("任意字符:"+(".".matches(".")));  //匹配任意字符
		System.out.println("数字字符:"+("&".matches("\\d")));
		System.out.println("非数字字符:"+("a".matches("\\D")));
		System.out.println("空白字符:"+("\r".matches("\\s")));
		System.out.println("非空白字符:"+(" ".matches("\\S")));
		System.out.println("单词字符:"+("_".matches("\\w")));
		System.out.println("非单词字符:"+("g".matches("\\W")));
		
		//Greedy 数量词 
		System.out.println("一个或一个也没有:"+("a".matches("\\w?")));
		System.out.println("零个或多个:"+("avs".matches("\\w*")));
		System.out.println("一次或多次:"+(" ".matches("\\w+")));
		System.out.println("恰好一个:"+("zvc".matches("[zcv]{3}")));
		System.out.println("至少一个:"+("124".matches("\\w{1,}")));
		System.out.println("至少n次，至多m次:"+("dfsss".matches("[dssfs]{2,5}")));
		
		//字符类 （范围词）
		System.out.println("简单类:"+("d".matches("[abfd]")));
		System.out.println("^简单类:"+("d".matches("[^abfd]")));
		System.out.println("大小写字母:"+("5".matches("[a-zA-Z0-9]")));
		System.out.println("交集:"+("K".matches("[a-dH-T]")));
		//System.out.println("交集:"+("255.255.245.1".matches("([1-9]?\\d.|1\\d\\d.|2[0-4]\\d.|25[0-5]\\.){3}([1-9]?\\d.|1\\d\\d.|2[0-4]\\d.|25[0-5])")));
	}
}
