package test1;
//����1-100�������ܺ�,Ҫ��ʹ����continue�ؼ���
public class Demo1 {

	public static void main(String[] args) {
		int sum=oddSum();
		System.out.println("��������:"+sum);
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
