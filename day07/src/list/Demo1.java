package list;

import java.util.ArrayList;
import java.util.List;

/*List�ӿ����з�����
��ӣ�
	void add(int index, E element)
	boolean addAll(int index, Collection<? extends E> c)

��ȡ��
	E get(int index) 
	int indexOf(Object o)  
	int lastIndexOf(Object o)  
	List<E> subList(int fromIndex, int toIndex) 

�޸ģ�
	E set(int index, E element)

*/
public class Demo1 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		
		/*���
		List list1=new ArrayList();
		list1.add("������");
		list1.add("�¹���");
		
		list.add(2, "����");
		System.out.println("Ԫ���ǣ�"+list);
		list.addAll(3,list1);
		System.out.println("����Ԫ���ǣ�"+list);*/
		
		/*��ȡ
		System.out.println("��ǰԪ���ǣ�"+list.get(2));
		System.out.println("��ǰԪ�ص�һ�γ��ֵ�����ֵ�ǣ�"+list.indexOf("����"));//�����ڷ���-1
		System.out.println("��ǰԪ�������ֵ�λ���ǣ�"+list.lastIndexOf("����"));
		List sublist=list.subList(1, 3);
		System.out.println("��ȡ��Ԫ���ǣ�"+sublist);//��ͷ����β
		 */	
		//�޸�
		list.set(2, "������");
		System.out.println("����Ԫ���ǣ�"+list);
	}
}
