package other;

import java.io.IOException;
//�ݹ�
public class Demo7 {

	public static void main(String[] args) throws IOException {
		
		int result=getFactarial(5);
		System.out.println("�����:"+result);
	}
	
	//����:5�Ľ׳ˡ��ݹ顷
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
