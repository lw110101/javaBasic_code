package review;

public class Demo4 {

	public static void main(String[] args) {
		int[] arr= {12,8,5,13,24};
		int num1=test1(arr);
		System.out.println(num1);
		int num2=test2(arr);
		System.out.println(num2);
	}
	public static int test1(int[] arr) {
		int min=0;
		int max=arr.length-1;
		int mid=(min+max)/2;
		while(true) {
			return mid;
		}
	}
	public static int test2(int[] arr) {
		int min=0;
		int max=arr.length-1;
		int mid=(min+max)/2;
		while(min<max) {
			return mid;
		}
		return mid;
	}
}
