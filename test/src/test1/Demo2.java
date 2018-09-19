package test1;
//5.定义一个函数接收一个数组对象,找出数组中的最大、最小值相加，把总和返回给调用者。
public class Demo2 {

	public static void main(String[] args) {
		int[] arr= {12,8,4,6,7,2};
		int sum=getSum(arr);
		System.out.println("和是:"+sum);
		
	}
	//方法一
	public static int sum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
		}
		sum=arr[0]+arr[arr.length-1];
		return sum;
	}
	//方法二
	public static int getSum(int[] arr) {
		
		int max = arr[0], min = arr[arr.length - 1], sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
			sum = min+max;
		}
		System.out.println("MAX:"+max);
		System.out.println("MIN:"+min);
		return sum;
	}	

}
