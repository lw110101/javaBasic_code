package genrictiry;

import java.util.ArrayList;
import java.util.Collection;
//import java.util.HashSet;
import java.util.LinkedList;

/*//���͵�������
����1�� ����һ���������Խ��ս����������͵ļ��϶��� Ҫ����յļ��϶���ֻ�ܴ洢Integer������Integer�ĸ����������ݡ�

����2�� ����һ���������Խ��ս����������͵ļ��϶��� Ҫ����յļ��϶���ֻ�ܴ洢Number������Number�������������ݡ�
*/
public class Demo5 {

	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<Integer>();
		//HashSet<String> set=new HashSet<String>();
		LinkedList<Integer> list2=new LinkedList<Integer>();
		getBate(list1);
		getBate(list2);  //getBate(set);---������
		
		getBata(list1);
		getBata(list2);   //getBata(set);---������
	}
	//��������
	public static void getBate(Collection<? super Integer> c) {
		
	}
	//��������
	public static void getBata(Collection<? extends Number> c) {
		
	}
}
