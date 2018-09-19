package list;

import java.util.LinkedList;

//�����⣺��LinkedListģ���ջ��������ݽṹ�洢��ʽ
//------��ջ���ݽṹ���Ƚ����-------------
class StackList{
	LinkedList<Object> list;
	public StackList() {
		list=new LinkedList<Object>();
	}
	
	public void add(Object obj) {
		list.push(obj);
	}
	
	public Object pop() {
		return list.pop();
	}
	
	public int getSize() {
		return list.size();
	}
}
//------�������ݽṹ���Ƚ��ȳ�-------------
class TeamList{
	LinkedList<Object> list;
	
	public TeamList(){
		list = new LinkedList<Object>();
	}
	public void add(Object obj) {
		list.offer(obj);
	}
	
	public Object remove() {
		return list.poll();
	}
	
	public int getSize() {
		return list.size();
	}
	
}

public class Demo8 {

	public static void main(String[] args) {
		//��ջ
		StackList list=new StackList();
		list.add("����");
		list.add("��ʣ");
		list.add("����");
		
		int size=list.getSize();
		System.out.println("��ջ����ջ��");
		for(int i=0;i<size;i++) {
			System.out.print(list.pop()+"  ");
		}
		
		
	/*---------�Լ����뷨----------
		LinkedList list=new LinkedList();
		list.push("1");
		list.push("2");
		list.push("3");
		
		System.out.println("��ջ�洢��ʽ--��ջ��"+list);
		System.out.println("��ջ�洢��ʽ--��ջ��");
		int size=list.size();
		for(int i=0;i<size;i++) {
			System.out.print(list.pop()+"  ");
		}
		
		list.offer("1");
		list.offer("2");
		list.offer("3");
		
		System.out.println("���д洢��ʽ--���ӣ�"+list);
		System.out.println("���д洢��ʽ--���ӣ�");
		int size=list.size();
		for(int i=0;i<size;i++) {
			System.out.print(list.poll()+"  ");
		}*/
	}
}
