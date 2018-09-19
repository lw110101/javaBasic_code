package list;

import java.util.LinkedList;
import java.util.Random;
/*
//ϴ��-----------�Լ���˼·-------------

public class Demo9 {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		String[] arr= {"����2","����3","����4","����5","����6","����7","����8"   //����
							,"����9","����10","����J","����Q","����K","����A",
						"����2","����3","����4","����5","����6","����7","����8"   //����
							,"����9","����10","����J","����Q","����K","����A",
						"����2","����3","����4","����5","����6","����7","����8"   //����
							,"����9","����10","����J","����Q","����K","����A",
						"÷��2","÷��3","÷��4","÷��5","÷��6","÷��7","÷��8"    //÷��
							,"÷��9","÷��10","÷��J","÷��Q","÷��K","÷��A",
						"����","С��"};    //��С��
	//��ջ�Ĵ洢��ʽ��  �Ƚ����
		Random ran=new Random();
		int count=0;
		int i=0;
		System.out.println("�Ƶĳ�ʼ˳���ǣ�");
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

//ϴ���Ż�
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
		String[] color= {"����","÷��","����","����"};
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
				poker.push("����");
			}else if(col==(k^2)) {
				poker.push("С��");
			}
			if(col%9==0) {
				System.out.println();	
			}
		}
	}
}

