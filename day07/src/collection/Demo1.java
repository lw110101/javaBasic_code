package collection;

import java.util.Arrays;

/* Collection�ӿ��еķ�����
  ���ӣ�
	add(E e)
	addAll(Collection<? extends E> c)
  ɾ��
	clear() 
	remove(Object o) 
	removeAll(Collection<?> c)
	retainAll(Collection<?> c)	
  �鿴:
	size() 
  ������
	toArray()
	iterator() 
  �жϣ�
	contains(Object o)
	containsAll(Collection<?> c)
	isEmpty()
 
���ϱ���������ƣ�
1.���Ͽ��Դ洢�������͵Ķ������ݣ�����ֻ�ܴ洢ͬһ���������͵����ݡ�
2.���ϵĳ����ǻᷢ���仯�ģ������ǹ̶��ġ�
*/
public class Demo1 {

		public static void main(String[] args) {
			Object[] arr=new Object[10];
			arr[0]="abc";
			arr[1]=13;
			arr[2]=new Object();
			System.out.println(Arrays.toString(arr));
		}
}
