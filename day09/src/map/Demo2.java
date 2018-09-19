package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
������
	Set<K> keySet()
	Set<Map.Entry<K,V>> entrySet()
	Collection<V> values()   
	*/
public class Demo2 {

	public static void main(String[] args) {
		
		Map<String,String> map=new HashMap<String,String>();
		String[] arr= {"Сѧ","����","����","��ѧ"};
		String[] brr= {"ϣ��Сѧ","�ڶ���ѧ","ʦ����","�ϲ���ѧ"};
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], brr[i]);
		}
		System.out.println("����Ԫ����:"+map);
		System.out.println("====keySet()��������mapԪ��(��)=========");
		Set<String> set=map.keySet();
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			String key=it.next();
			System.out.print(key+"="+map.get(key)+"  ");
		}

		System.out.println("\r\n====values()��������mapԪ��(ֵ)=========");
		Collection<String> c=map.values();
		Iterator<String> it1=c.iterator();
		while(it1.hasNext()) {
			String value=it1.next();
			System.out.print("ֵ��:"+value+" ");
		}
		
		System.out.println("\r\n====entrySet()��������mapԪ��(����ֵ)=========");
		Set<Map.Entry<String,String>> set1=map.entrySet();
		Iterator<Map.Entry<String,String>> it2=set1.iterator();
		while(it2.hasNext()) {
			Map.Entry<String,String> entry=it2.next();
			//**Entry���ڲ��ࡣ�ڲ���ĸ�ʽ��	�ⲿ��.�ڲ���<> ������=new �ⲿ��.�ڲ���();						
			System.out.print(entry+"  ");
			System.out.println("��:"+entry.getKey()+" <==> "+"ֵ:"+entry.getValue());
		}
	}
}
