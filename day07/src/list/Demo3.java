package list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//���ַ�����������
public class Demo3 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("������");
		list.add("�¹���");
		
		//����һ��
		System.out.println("==============get��������==========");
		for(int i=0;i<list.size();i++){
			list.get(i);
			
			System.out.print(list.get(i)+"  ");
		}
		
		//��������
		System.out.println("\r\n===========������˳�����===============");
		ListIterator<String> lit=list.listIterator();
		while(lit.hasNext()){
			
			System.out.print(lit.next()+"  ");
		}
		
		
		//��������
		System.out.println("\r\n===========�������������=============");
		while(lit.hasPrevious()){
			
			System.out.print(lit.previous()+"  ");
		}
		
		//�����ģ�
		System.out.println("\r\n==========��ǿfor()��������============");
		for(Object o:list) {
			System.out.print(o+"  ");
		}
		
	}
}
