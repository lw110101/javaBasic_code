package Thread;
//ģ�����װ����̨��������---->�ػ��߳�

class Routine extends Thread{
	public Routine(String name){
		super(name);
	}
	public void run(){
		for(int i=0;i<=100;i++){
			System.out.println(this.getName()+"������°�������"+i+"%");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i==100){
				System.out.println(this.getName()+"���°�������ϣ�׼����װ��");
			}
		}
	}
}
public class Demo6 {
	public static void main(String[] args) {
		Routine r=new Routine("MyException");
		r.setDaemon(true);
		System.out.println("Routine���ػ��߳���"+	r.isDaemon());
	
		r.start();
		for(int i=0;i<=100;i++){
			System.out.println(Thread.currentThread().getName()+"�˳���"+i+"%");
		}
}
}
