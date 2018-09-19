package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
���ң�
	������Ҫʹ�õĶ���
		1.Pattern��ƥ�����
		2.Matcher��ƥ��������

ָ��Ϊ�ַ�����������ʽ�������ȱ�����Ϊ�����ʵ����Ȼ�󣬿ɽ��õ���ģʽ���ڴ��� Matcher ����
����������ʽ���ö�������������ַ�����ƥ�䡣ִ��ƥ�����漰������״̬��פ����ƥ�����У�
���Զ��ƥ�������Թ���ͬһģʽ����ˣ����͵ĵ���˳���� 

		Pattern p = Pattern.compile("a*b");
		Matcher m = p.matcher("aaaaab");
		boolean b = m.matches();

ƥ����Ҫʹ�õ��ķ�����
	1.find()  ֪ͨƥ����ȥƥ���ַ��������ҷ��Ź�����ַ���
	2.group()   ��ȡ���Ź�����Ӵ�
ע�⣺ʹ��group����ʱһ��Ҫ�ȵ���find������ƥ����ȥ���ҷ��Ϲ�����ַ���

\b  ���ʱ߽�ƥ����ֻ�Ǵ����˵��ʵĿ�ʼ�����ǽ������֣���ƥ���κ��ַ�
*/
public class Demo4 {

	public static void main(String[] args) {
		//�����ҳ�4����ĸ��ɵĵ���
		String str="san qian hong cheng liao liao jiu zhou tu";
		String regex="\\b[a-zA-Z]{4}\\b";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(str);
		
		while(m.find()) {
			System.out.print(m.group()+"  ");
		}
	}
}
