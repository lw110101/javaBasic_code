package Thread;
//����ʩ��------��join����

class Builder extends Thread{
	public void run(){
		System.out.println("ѡַ��ػ�");
		System.out.println("��ʼ��Χ��ǽ");
		System.out.println("��ˮ��");
		System.out.println("��һ��������,���ϲ�����");
		//�������ϲ�������boss��
		Boss B=new Boss();
		B.start();
		try {
			B.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("������ǽ");
		System.out.println("�����ⶥ");

	}
}

class Boss extends Thread{
	public void run(){
		System.out.println("��ʼ����");
		System.out.println("ȥ�����г�����");
		System.out.println("��ɳʯ��ˮ���˵�����");
	}
}
public class Demo7 {
	public static void main(String[] args) {
		Builder b=new Builder();
		b.start();
	}
}
