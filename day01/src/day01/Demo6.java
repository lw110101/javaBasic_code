package day01;
//矩阵相乘
public class Demo6 {
	public static void main(String[] args) {
		int[][] a={{1,2},{3,4},{5,6}};
		int[][] b={{7,8,9},{4,5,6}};
		int[][] c=new int[a.length][b[0].length];
		int temp=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b[0].length;j++){
				for(int k=0;k<b.length;k++){   //长度 较小的做第三层循环
					temp+=a[i][k]*b[k][j];
				}
				c[i][j]=temp;
			}
		}
		
		for(int i=0;i<c.length;i++){
			for(int j=0;j<c.length;j++){
			System.out.print(c[i][j]+"\t");
		}
			System.out.println();
		}
	}
}
