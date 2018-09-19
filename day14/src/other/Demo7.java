package other;

import java.io.IOException;
//递归
public class Demo7 {

	public static void main(String[] args) throws IOException {
		
		int result=getFactarial(5);
		System.out.println("结果是:"+result);
	}
	
	//需求:5的阶乘《递归》
	public static int getFactarial(int num) {
		
		if(num==1) {
			return 1;
		}
		return num*getFactarial(num-1);
	}
	
	public static int test(int num) {
		int result=1;
		while(num>0) {
		result=result*num;
		num--;
		}
		return result;
		
	}
}
