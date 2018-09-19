package Collections_Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Collections������������
	1.��list���ж��ֲ��ң�(ǰ��ü���һ��Ҫ����.)	
		int binarySearch(list,key);
	1>. �������Ԫ����Ȼ˳����б������������
	2>. Ҫ��list �����е�Ԫ�ض���Comparable �����ࡣ
		int binarySearch(list,key,Comparator);
	
	2.��list���Ͻ�������
		sort(list); 
	 . ��list��������,��ʵʹ�õ���list�����еĶ����compareTo����
		sort(list,comaprator);
	     . ������߱���Ȼ˳��Ҫ�����Զ���ȽϹ���ıȽ�����������
	
	3.�Լ���ȡ���ֵ������Сֵ��
		max(Collection)
		max(Collection,comparator)
		min(Collection)
		min(Collection,comparator)
	
	4.��list���Ͻ��з�ת��
		reverse(list);
	
	5.���Խ���ͬ���ļ��ϱ��ͬ���ļ��ϡ�
		Set synchronizedSet(Set<T> s)
		Map synchronizedMap(Map<K,V> m)
		List synchronizedList(List<T> list)
	*/
public class Demo1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(5);
		list.add(2);
		list.add(32);
		list.add(15);
		
		Collections.sort(list);
		System.out.println("����Ԫ�ص�����ֵ��:"+Collections.binarySearch(list, 15));
		System.out.println("���ϵ����ֵ��:"+Collections.max(list));
		System.out.println("���ϵ���Сֵ��:"+Collections.min(list));
		System.out.println("����Ԫ����:"+list);
		Collections.reverse(list);
		System.out.println("��ת��ļ�����:"+list);
		List<Integer> list1=Collections.synchronizedList(list);
		System.out.println(list1);
	}
}
