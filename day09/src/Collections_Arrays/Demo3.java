package Collections_Arrays;

import java.util.Arrays;
import java.util.List;

/*
1.二分查找,数组需要有序
		binarySearch(int[])
		binarySearch(double[])

    2.数组排序
		sort(int[])
		sort(char[])……

    3.将数组变成字符串。
		toString(int[])

    4.复制数组。
		copyOf(original, newLength)   original:原数组     newLength:新数组长度
		copyOfRange(original, from, to);    复制部分数组。

    5.比较两个数组是否相同。
		equals(int[],int[]);    //对应位置的元素是否相等

    6.将数组变成集合。
		List asList(T[]);   数组与集合可以相互转换。
		/*
	如果数组中存入的基本数据类型，那么asList会将数组实体作为集合中的元素。
	如果数组中的存入的引用数据类型，那么asList会将数组中的元素作为集合中
	的元素。
	  */
public class Demo3 {

	public static void main(String[] args) {
		
		Integer[] arr= {11,5,16,9};      //Integer初始值为:null    int初始值为:0
		
		/*Arrays.sort(arr);  
		System.out.println("排序后的数组:"+Arrays.toString(arr));
		System.out.println("查找元素的索引值是:"+Arrays.binarySearch(arr,11));
		*/
		Integer[] arr1=Arrays.copyOf(arr, 6);
		System.out.println("复制后的数组是:"+Arrays.toString(arr1));
		
		Integer[] arr2=Arrays.copyOfRange(arr, 1, 3);
		System.out.println("指定区间复制后的数组是:"+Arrays.toString(arr2));
		
		System.out.println("arr与arr1对应位置的元素是否完全相等？"+arr.equals(arr1));  
		
		List<Integer> list=Arrays.asList(arr);
		System.out.println("集合元素是:"+list);
	
		Object[] o=list.toArray();
		System.out.println(Arrays.toString(o));
		
		int[] brr= {1,15,5,9,7};
		List<int[]> list1=Arrays.asList(brr);
		System.out.println("集合元素是:"+list1);
	}
}
