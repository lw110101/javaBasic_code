package list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*������
ListIterator<E> listIterator() 
ListIterator���еķ�����
	add(E e)   ���Ԫ�ص���ǰָ��λ��
	set(E e)    �滻���������һ�η��ص�Ԫ�ء�
---------------------
	hasPrevious()
	previous()
*/
public class Demo2 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		System.out.println("��ʼ����Ԫ���ǣ�"+list);
		
		ListIterator<String> lit=list.listIterator();
		/*lit.next();
		System.out.println("��ǰһ��Ԫ����"+lit.hasPrevious());
		System.out.println("ǰһ��Ԫ���ǣ�"+lit.previous());*/
		
		/*while(lit.hasNext()){    //��ѭ��
			lit.next();
			System.out.println("��ǰԪ���ǣ�"+lit.previous());
		}*/
		
		/*while(lit.hasNext()){
			lit.next();
		}
		while(lit.hasPrevious()){
			System.out.println("��ǰԪ���ǣ�"+lit.previous());
		}
		*/
		lit.next();
		lit.next();
		lit.set("����");
		System.out.println("set���Ԫ���ǣ�"+list);
		
		lit.add("������");
		System.out.println("add�󼯺�Ԫ���ǣ�"+list);
		
		
	}
}
