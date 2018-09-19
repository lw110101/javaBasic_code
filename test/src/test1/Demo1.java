package test1;
//计算1-100奇数的总和,要求使用上continue关键字
public class Demo1 {

	public static void main(String[] args) {
		int sum=oddSum();
		System.out.println("奇数和是:"+sum);
	}
	
	public static int oddSum() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
			continue;
		}
		return sum;
	}
}
