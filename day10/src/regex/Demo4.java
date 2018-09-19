package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
查找：
	查找需要使用的对象：
		1.Pattern（匹配对象）
		2.Matcher（匹配器对象）

指定为字符串的正则表达式必须首先被编译为此类的实例。然后，可将得到的模式用于创建 Matcher 对象，
依照正则表达式，该对象可以与任意字符序列匹配。执行匹配所涉及的所有状态都驻留在匹配器中，
所以多个匹配器可以共享同一模式。因此，典型的调用顺序是 

		Pattern p = Pattern.compile("a*b");
		Matcher m = p.matcher("aaaaab");
		boolean b = m.matches();

匹配器要使用到的方法：
	1.find()  通知匹配器去匹配字符串，查找符号规则的字符串
	2.group()   获取符号规则的子串
注意：使用group方法时一定要先调用find方法让匹配器去查找符合规则的字符串

\b  单词边界匹配器只是代表了单词的开始或者是结束部分，不匹配任何字符
*/
public class Demo4 {

	public static void main(String[] args) {
		//需求：找出4个字母组成的单词
		String str="san qian hong cheng liao liao jiu zhou tu";
		String regex="\\b[a-zA-Z]{4}\\b";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(str);
		
		while(m.find()) {
			System.out.print(m.group()+"  ");
		}
	}
}
