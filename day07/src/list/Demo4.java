package list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//����Ԫ��ע�����
public class Demo4 {
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("����");
		list.add("����");
		list.add("����");
		
		ListIterator<String> lit=list.listIterator();
		/*while(lit.hasNext()){
			System.out.print(lit.next()+"  ");
			//lit.add("����");
			//list.add("abc");  �������
			//lit.set("����");
			list.set(1,"����");
		}*/
		
		lit.next();   //λ��һ���ͳ���
		list.add("����");
		System.out.println("\r\n����Ԫ�أ�"+list);
	}
}
