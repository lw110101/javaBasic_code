package Thread;
//�ĸ�������Ʊ60�ţ����߳�

class SaleTicket extends Thread{
	static int num=60;
	static Object o=new Object();//Ψһ����
	public 	SaleTicket(String name){
		super(name);
	}
	public void run(){
		
		while(true){
			synchronized(o){
			if(num>0){     //this=Thread.currentThread();
			System.out.println(this.getName()+"�۳��˵�"+num+"��Ʊ");
			num--;
		}else{
			System.out.println("�����ˡ���");
			break;
			}
		}
		}
	}
}

public class Demo4{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SaleTicket thread1=new SaleTicket("����1");
		SaleTicket thread2=new SaleTicket("����2");
		SaleTicket thread3=new SaleTicket("����3");
		thread1.start();
		thread2.start();
		thread3.start();
	
	}

}
