package Thread;
//��������

class DeadLock extends Thread{
	public DeadLock(String name){
		super(name);
	}
	public void run(){
		if("����1".equals(this.getName())){
			synchronized ("5�ſ���"){
				System.out.println("����1�õ���5�ſ꣬׼����1�ſ��ӳԷ���");
				synchronized ("1�ſ���") {
					System.out.println("����1�õ���5�Ÿ�1�ſ��ӿ�ʼ�Է���");
				}
			}
		}else if("����2".equals(this.getName())){
			synchronized ("1�ſ���"){
				System.out.println("����2�õ���1�ſ꣬׼����2�ſ��ӳԷ���");
				synchronized ("2�ſ���") {
					System.out.println("����2�õ���2�Ÿ�1�ſ��ӿ�ʼ�Է���");
				}
			}
		}else if("����3".equals(this.getName())){
			synchronized ("2�ſ���"){
				System.out.println("����3�õ���2�ſ꣬׼����3�ſ��ӳԷ���");
				synchronized ("3�ſ���") {
					System.out.println("����3�õ���2�Ÿ�3�ſ��ӿ�ʼ�Է���");
				}
			}
		}else if("����4".equals(this.getName())){
			synchronized ("3�ſ���"){
				System.out.println("����4�õ���3�ſ꣬׼����4�ſ��ӳԷ���");
				synchronized ("4�ſ���") {
					System.out.println("����4�õ���3�Ÿ�4�ſ��ӿ�ʼ�Է���");
				}
			}
		}else if("����5".equals(this.getName())){
			synchronized ("4�ſ���"){
				System.out.println("����5�õ���4�ſ꣬׼����5�ſ��ӳԷ���");
				synchronized ("5�ſ���") {
					System.out.println("����5�õ���4�Ÿ�5�ſ��ӿ�ʼ�Է���");
				}
			}
		}
	}
}
public class Demo1 {
	public static void main(String[] args) {
		DeadLock thread1=new DeadLock("����1");
		DeadLock thread2=new DeadLock("����2");
		DeadLock thread3=new DeadLock("����3");
		DeadLock thread4=new DeadLock("����4");
		DeadLock thread5=new DeadLock("����5");
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
	}
}
