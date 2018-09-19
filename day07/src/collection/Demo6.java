package collection;

import java.util.*;
/*����
 toArray()
iterator()
�������ķ�����
hasNext()
next()
remove()
 */
 

public class Demo6 {
	
	public static void main(String[] args) {
		Collection<String> c=new ArrayList<String>();
		c.add("��ʣ");
		c.add("����");
		c.add("����");
		c.add("����");
		
		//toArray()��������
		Object[] arr=c.toArray();
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		
		//iterator()��������Ԫ��
		Iterator<String> it=c.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+"  ");
		}
		System.out.println();
		System.out.println(c);
		
		/*remove�÷�
		it.next();
		it.remove();
		System.out.println(c);
		*/
	}
}
