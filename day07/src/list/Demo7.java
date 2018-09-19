package list;

import java.util.Iterator;
import java.util.LinkedList;

/*LinkedList�����з�����
		1����������
			addFirst(E e) 
			addLast(E e) 
		-----------------
			getFirst() 
			getLast() 
		-----------------
			removeFirst() 
			removeLast() 
			���������û��Ԫ�أ���ȡ����ɾ��Ԫ���ף�NoSuchElementException
		2�����ݽṹ
			1��ջ ��1.6��
				�Ƚ����
				push() 
				pop()
			2�����У�˫�˶���1.5��
				�Ƚ��ȳ�
				offer()
				poll()
		3����������ĵ���������      
			descendingIterator()   ��������ĵ���������*/
public class Demo7 {

	public static void main(String[] args) {
		LinkedList<Student> list=new LinkedList<Student>();
		list.add(new Student("����",110));
		list.add(new Student("����",120));
		list.add(new Student("����",130));
		/*
		list.addFirst("��ʣ");
		list.addLast("����");
		
		System.out.println("�Ƴ������ص�һ��Ԫ�أ�"+list.removeFirst());
		System.out.println("�Ƴ����������һ��Ԫ�أ�"+list.removeLast());
		
		System.out.println("��ȡ��һ��Ԫ�أ�"+list.getFirst());
		System.out.println("��ȡ���һ��Ԫ�أ�"+list.getLast());
		
		list.push("����");   //���Ԫ�ص���λ��
		System.out.println("���ϣ�"+list);
		System.out.println("�Ƴ���������Ԫ�أ�"+list.pop());   //�Ƴ� ��������Ԫ��
		
		list.offer("����");
		System.out.println("���ϣ�"+list);   //���Ԫ�ص�ĩβ
		System.out.println("�Ƴ���������Ԫ�أ�"+list.poll());     //�Ƴ� ��������Ԫ��
		*/
		Iterator<Student> it=list.descendingIterator();
		while(it.hasNext()) {
		
			System.out.print(it.next()+"  ");
		}
	}
}
