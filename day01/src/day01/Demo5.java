package day01;

import java.util.*;

//杨辉三角
public class Demo5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要输出的杨辉三角的行数：");
		int num=sc.nextInt();
		sc.close();
		int[][] arr=new int[num][];
		//第二维长度及每行首末位均为1
		for(int i=0;i<num;i++){
			arr[i]=new int[i+1];
			arr[i][0]=1;
			arr[i][i]=1;
		}
		//处理中间 元素 ，从第二个元素----倒数第二个元素
		for(int i=0;i<num;i++){
			for(int j=1;j<i;j++){
				arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
			}
		}
		//遍历数组输出
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
