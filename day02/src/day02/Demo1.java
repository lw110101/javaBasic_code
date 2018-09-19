package day02;

import java.util.Arrays;

public class Demo1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,21,13,4,5,6,7,8,14,10,11,12};
		//int[] arr=null;
		try{
		arr=getArr(arr);
		System.out.println("新数组是："+Arrays.toString(arr));
		}catch(NullPointerException e){
			System.out.println("重新输入数组！");
		}
	}
	public static int[] getArr(int[] arr) throws NullPointerException{
		
			int[] newArr=new int[arr.length];
		
			int index=0;
			int n=1;
			
			if(newArr.length==0){
				throw new NullPointerException();
			}

			for(int i=0;i<arr.length;i++){
				
			if(arr[i]%2==1){
				newArr[index++]=arr[i];
				
			}else if(arr[i]%2==0){
				newArr[newArr.length-n]=arr[i];
				n++;
			}
			}
		
		return newArr;
		
	}

}
