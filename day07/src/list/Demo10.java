package list;
import java.util.LinkedList;
import java.util.Random;
/*
���� ʹ��LinkedList�洢һ���˿��ƣ�Ȼ��ʵ��ϴ�ƹ��ܡ�
*/
//�˿���
class Pokers{
	
	String  color; //��ɫ
	
	String num;	//����

	public Pokers(String color, String num) {
		super();
		this.color = color;
		this.num = num;
	}
	@Override
	public String toString() {
		return color+num;
	}
}

public class Demo10{
	
	public static void main(String[] args) {
		LinkedList<Pokers> pokers = createPoker();
		shufflePoker(pokers);
		showPoker(pokers);
	}
	//ϴ�ƵĹ���
	public static void shufflePoker(LinkedList<Pokers> pokers){
		//�������������
		Random random = new Random();
		for(int i = 0 ; i <100; i++){ 
			//���������������ֵ
			int index1 = random.nextInt(pokers.size());
			int index2 = random.nextInt(pokers.size());
			//��������ֵȡ�������ƣ�Ȼ�󽻻������Ƶ�˳��
			Pokers poker1 = (Pokers) pokers.get(index1);
			Pokers poker2 = (Pokers) pokers.get(index2);
			pokers.set(index1, poker2);
			pokers.set(index2, poker1);
		}
		
	}
	//��ʾ�˿���
	public static void showPoker(LinkedList<Pokers> pokers){
		for(int i = 0 ; i<pokers.size() ; i++){
			System.out.print(pokers.get(i)+" "+"\t");
			//����
			if(i%10==9){
				System.out.println();
			}
		}
	
	}	
	
	//�����˿��Ƶķ���
	public static LinkedList<Pokers> createPoker(){
		//�ü������ڴ洢�˿˶���
		LinkedList<Pokers> list = new LinkedList<Pokers>();		
		//��������洢���еĻ�ɫ�����
		String[] colors = {"����","����","÷��","����"};
		String[] nums = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		for(int i = 0 ; i < nums.length ; i++){
			for(int j = 0 ; j<colors.length ; j++){
				list.add(new Pokers(colors[j], nums[i]));
			}
		}
		return list;
	}
	
	
}
