package test1;
//����һ������������һ��������һ��Ҫ���ҵ�Ԫ�أ������Ԫ�ش��������У���ô���ظ�Ԫ���������е�����ֵ����������ڷ���-1��(��Ҫ�ϸ�Ҫ��ʹ�ö��ֲ��ҷ�)
public class Demo3 {

	public static void main(String[] args) {
		
		int[] arr= {12,8,4,6,7,2,6};
		int index=getIndex(arr,6);
		System.out.println("����ֵ��:"+index);
	}
	
	public static int getIndex(int[] arr,int target) {
		int index=-1,count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				index=i;
				count++;
			}
		}
		if(count>0) {
			System.out.println("��������"+count+"��Ԫ��");
		}
		return index;
	}
}
