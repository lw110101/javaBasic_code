package test1;
//5.����һ����������һ���������,�ҳ������е������Сֵ��ӣ����ܺͷ��ظ������ߡ�
public class Demo2 {

	public static void main(String[] args) {
		int[] arr= {12,8,4,6,7,2};
		int sum=getSum(arr);
		System.out.println("����:"+sum);
		
	}
	//����һ
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
	//������
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
