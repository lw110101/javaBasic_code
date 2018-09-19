package Collections_Arrays;

import java.util.Arrays;
import java.util.List;

/*
1.���ֲ���,������Ҫ����
		binarySearch(int[])
		binarySearch(double[])

    2.��������
		sort(int[])
		sort(char[])����

    3.���������ַ�����
		toString(int[])

    4.�������顣
		copyOf(original, newLength)   original:ԭ����     newLength:�����鳤��
		copyOfRange(original, from, to);    ���Ʋ������顣

    5.�Ƚ����������Ƿ���ͬ��
		equals(int[],int[]);    //��Ӧλ�õ�Ԫ���Ƿ����

    6.�������ɼ��ϡ�
		List asList(T[]);   �����뼯�Ͽ����໥ת����
		/*
	��������д���Ļ����������ͣ���ôasList�Ὣ����ʵ����Ϊ�����е�Ԫ�ء�
	��������еĴ���������������ͣ���ôasList�Ὣ�����е�Ԫ����Ϊ������
	��Ԫ�ء�
	  */
public class Demo3 {

	public static void main(String[] args) {
		
		Integer[] arr= {11,5,16,9};      //Integer��ʼֵΪ:null    int��ʼֵΪ:0
		
		/*Arrays.sort(arr);  
		System.out.println("����������:"+Arrays.toString(arr));
		System.out.println("����Ԫ�ص�����ֵ��:"+Arrays.binarySearch(arr,11));
		*/
		Integer[] arr1=Arrays.copyOf(arr, 6);
		System.out.println("���ƺ��������:"+Arrays.toString(arr1));
		
		Integer[] arr2=Arrays.copyOfRange(arr, 1, 3);
		System.out.println("ָ�����临�ƺ��������:"+Arrays.toString(arr2));
		
		System.out.println("arr��arr1��Ӧλ�õ�Ԫ���Ƿ���ȫ��ȣ�"+arr.equals(arr1));  
		
		List<Integer> list=Arrays.asList(arr);
		System.out.println("����Ԫ����:"+list);
	
		Object[] o=list.toArray();
		System.out.println(Arrays.toString(o));
		
		int[] brr= {1,15,5,9,7};
		List<int[]> list1=Arrays.asList(brr);
		System.out.println("����Ԫ����:"+list1);
	}
}
