package collection;
/*
���ӣ�
add(E e)  ��Ӽ���Ԫ��
addAll(Collection<? extends E> c)
 ɾ��
	clear()   ����ɹ�������Ture��ʧ�ܷ���False��
	remove(Object o) 
	removeAll(Collection<?> c)    ɾ������
	retainAll(Collection<?> c)	��������������һ��ɾ��
*/
import java.util.ArrayList;
import java.util.Collection;

public class Demo2 {

	public static void main(String[] args) {
		Collection<String> c=new ArrayList<String>();
		c.add("C����");
		c.add("���ݽṹ");
		c.add("java");
		System.out.println("����Ԫ���ǣ�"+c);
		
		Collection<String> c1=new ArrayList<String>();
		c1.add("VBA");
		c1.add("���ݿ�");
		c1.add("java");
//		c.addAll(c1);
//		System.out.println("�µļ���Ԫ���ǣ�"+c);
		/*
		c1.clear();
		System.out.println("����Ԫ���ǣ�"+c1);
		
		c.remove("C����");
		System.out.println("����Ԫ���ǣ�"+c);
		*/
		c.removeAll(c1);
		System.out.println("�µļ���Ԫ���ǣ�"+c);
		
		c.retainAll(c1);
		System.out.println("�µļ���Ԫ���ǣ�"+c);
		}
}
