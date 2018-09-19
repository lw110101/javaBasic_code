package list;

import java.util.LinkedList;
import java.util.Random;
/*
//洗牌-----------自己的思路-------------

public class Demo9 {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		String[] arr= {"红桃2","红桃3","红桃4","红桃5","红桃6","红桃7","红桃8"   //红桃
							,"红桃9","红桃10","红桃J","红桃Q","红桃K","红桃A",
						"方块2","方块3","方块4","方块5","方块6","方块7","方块8"   //方块
							,"方块9","方块10","方块J","方块Q","方块K","方块A",
						"黑桃2","黑桃3","黑桃4","黑桃5","黑桃6","黑桃7","黑桃8"   //黑桃
							,"黑桃9","黑桃10","黑桃J","黑桃Q","黑桃K","黑桃A",
						"梅花2","梅花3","梅花4","梅花5","梅花6","梅花7","梅花8"    //梅花
							,"梅花9","梅花10","梅花J","梅花Q","梅花K","梅花A",
						"大王","小王"};    //大小王
	//堆栈的存储方式：  先进后出
		Random ran=new Random();
		int count=0;
		int i=0;
		System.out.println("牌的初始顺序是：");
		while(count<54) {
			int index=ran.nextInt(54);
			
				if(!list.contains(arr[index])) {
					list.push(arr[index]);
					count++;
				}
		}
		while(i<54) {
			System.out.print(list.pop()+"  "+"\t");
			i++;
			if(i%14==0) {
				System.out.println();
			}
		}

		
	}
}*/

//洗牌优化
class Poker{
	String color;
	String num;
	public Poker(String color,String num) {
		this.color=color;
		this.num=num;
	}
	
	public String toString() {
		return this.color+this.num;
	}
	
	public boolean equals(Object obj) {
		Poker p=(Poker)obj;
		return this.color==p.color&&this.num==p.num;
	}
}

public class Demo9 {

	public static void main(String[] args) {
		LinkedList<Object> poker=new LinkedList<Object>();
		Random ran=new Random();
		String[] color= {"红桃","梅花","方块","黑桃"};
		String[] num= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		int count=0;
		int col=0;
		int k=ran.nextInt(52);
		while(count<52) {
			int i=ran.nextInt(4);
			int j=ran.nextInt(13);
			
			if(!poker.contains(new Poker(color[i],num[j]))){
				poker.push(new Poker(color[i],num[j]));
				count++;
			}
		}
		while(col<54) {
			System.out.print(poker.pop()+" "+""+"\t");
			col++;
			if(col==k) {
				poker.push("大王");
			}else if(col==(k^2)) {
				poker.push("小王");
			}
			if(col%9==0) {
				System.out.println();	
			}
		}
	}
}

