package list;

import java.util.Enumeration;
import java.util.Vector;

public class Demo12 {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.addElement("����");
		v.addElement("����");
		v.addElement("����");
		
		Enumeration<String> e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
