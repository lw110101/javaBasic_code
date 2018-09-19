package math_date;
import java.util.LinkedList;
import java.util.Random;

public class Demo6 {

	public static void main(String[] args) {
		test();
		//test1();
	}
	public static void test() {
		LinkedList<Integer> list=new LinkedList<Integer>();
		int count=0;
		Random random=new Random();
		while(count<6) {
			int num = (random.nextInt(45)) + 1;
			if(!list.contains(num)) {
				list.push(num);
				count++;
			}
		}
		System.out.println("一等奖的号码:" + list.pop());
		System.out.print("二等奖号码是:");
		for (int i = 0; i < 2; i++) {
			System.out.print(list.pop() + "  ");
		}
		System.out.print("\r\n三等奖号码是:");
		for (int i = 0; i < 3; i++) {
			System.out.print(list.pop() + "  ");
		}
		
	}
	public static void test1() {
		int count=1;
		for(int i=1;i<10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((count++)+"  ");
			}
			System.out.println();
		}
	}
	
}
