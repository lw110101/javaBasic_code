package review;

import java.util.Arrays;

//数组的排序
public class Demo1 {

	public static void main(String[] args) {
		
		int[] arr= {12,8,45,32,25,16,29};
		arr=directSort(arr);
		System.out.println("直接排序后的数组是:"+Arrays.toString(arr));
		
		arr=bubbleSort(arr);
		System.out.println("冒泡排序后的数组是:"+Arrays.toString(arr));
		
		int index=binarySearch(arr,45);
		System.out.println("查找的索引值是:"+index);
	}
	
	//数组的直接排序：
	public static int[] directSort(int[] arr) {
		
		for (int i = 0; i < arr.length - 1; i++) {//外层循环控制轮数
			for (int j = i + 1; j < arr.length; j++) {//内层循环控制排序，将符合条件的后移
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
		
	}
	
	////数组的冒泡排序
	public static int[] bubbleSort(int[] arr) {
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j <arr.length-i-1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	
	//二分法查找：
	public static int binarySearch(int[] arr,int target) {
		
		int min=0;
		int max = arr.length - 1;
		int mid = (min + max) / 2;
		while (true) {
			if (arr[mid] < target) {
				min = mid+1;
			} else if (arr[mid] > target) {
				max = mid-1;
			} else {
				return mid;
			}
			mid = (min + max) / 2;
			if(min>max) {
				return -1;
			}
		}
	}
}
