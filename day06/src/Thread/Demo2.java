package Thread;
//Runnable ʵ���߳�

public class Demo2 implements Runnable{
	
	int num=50;
	public void run(){
		while(true){
			synchronized("��"){
			if(num>0){
				System.out.println(Thread.currentThread().getName()+"�����˵�"+num+"��Ʊ");
				num--;
			
			}else{
				System.out.println("�����ˣ�");
				break;
				}
			}
		}
	}
public static void main(String[] args) {
	
	Demo2 d=new Demo2();
	Thread thread1=new Thread(d,"����1");
	Thread thread2=new Thread(d,"����2");
	Thread thread3=new Thread(d,"����3");
	thread1.start();
	thread2.start();
	thread3.start();

}
}
