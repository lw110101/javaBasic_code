package day01;

import java.util.*;

//�������
public class Demo5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������Ҫ�����������ǵ�������");
		int num=sc.nextInt();
		sc.close();
		int[][] arr=new int[num][];
		//�ڶ�ά���ȼ�ÿ����ĩλ��Ϊ1
		for(int i=0;i<num;i++){
			arr[i]=new int[i+1];
			arr[i][0]=1;
			arr[i][i]=1;
		}
		//�����м� Ԫ�� ���ӵڶ���Ԫ��----�����ڶ���Ԫ��
		for(int i=0;i<num;i++){
			for(int j=1;j<i;j++){
				arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
			}
		}
		//�����������
		for(int i=0;i<num;i++){
			for(int j=num-i-1;j>0;j--){
				System.out.print("  ");
			}
			for(int k=0;k<i+1;k++){
				System.out.print(arr[i][k]+"  ");
			}
			System.out.print("\n");
		}
}
}
