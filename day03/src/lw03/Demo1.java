package lw03;
import java.util.*;
class Demo1
{
	public static void main(String[] args) 
	{
		int[] arr={-1,-2,1,2,4,6,5,3,8,9,10,7};//int������һ���Ǹ���
		int index=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0){
				int temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
				index++;
			}
		}
		System.out.println("�������ǣ�"+Arrays.toString(arr));
	}
}


