package list;

import java.util.Enumeration;
import java.util.Vector;

public class Demo12 {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.addElement("张三");
		v.addElement("李四");
		v.addElement("王五");
		
		Enumeration<String> e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
