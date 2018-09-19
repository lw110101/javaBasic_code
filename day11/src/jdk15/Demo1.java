package jdk15;
//新特性----静态导入
//import java.util.Arrays;
import static java.util.Arrays.*;
public class Demo1 {

	public static void main(String[] args) {
		int[] arr= {24,14,3,15,9};
		sort(arr);
		int b=binarySearch(arr,14);
		System.out.println(b);
	}
}
