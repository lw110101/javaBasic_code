package day01;

import java.util.Arrays;

public class Demo4 {
	public static void main(String[] args){
		int[] arr={1,2,3,4,5,6,7};
		arr=getArr(arr);
		System.out.println("�������ǣ�"+Arrays.toString(arr));
	
}
public static int[] getArr(int[] arr){
	int[] newArr=new int[arr.length];
	int n=0;
	for(int i=0;i<arr.length;i++){
		if(arr[i]%2==1){
			newArr[n]=arr[i];
			System.out.print("�����ǣ�"+newArr[n]);
			n++;
		}
	}
	for(int i=0;i<arr.length;i++){
		if(arr[i]%2==0){
			newArr[n]=arr[i];
			System.out.print("ż���ǣ�"+newArr[n]);
			n++;
		}
	}
	
	return newArr;
}
}
