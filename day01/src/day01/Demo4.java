package day01;

import java.util.Arrays;

public class Demo4 {
	public static void main(String[] args){
		int[] arr={1,2,3,4,5,6,7};
		arr=getArr(arr);
		System.out.println("新数组是："+Arrays.toString(arr));
	
}
public static int[] getArr(int[] arr){
	int[] newArr=new int[arr.length];
	int n=0;
	for(int i=0;i<arr.length;i++){
		if(arr[i]%2==1){
			newArr[n]=arr[i];
			System.out.print("奇数是："+newArr[n]);
			n++;
		}
	}
	for(int i=0;i<arr.length;i++){
		if(arr[i]%2==0){
			newArr[n]=arr[i];
			System.out.print("偶数是："+newArr[n]);
			n++;
		}
	}
	
	return newArr;
}
}
