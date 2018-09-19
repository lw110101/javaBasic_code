package Thread;
//Runnable 实现线程

public class Demo2 implements Runnable{
	
	int num=50;
	public void run(){
		while(true){
			synchronized("锁"){
			if(num>0){
				System.out.println(Thread.currentThread().getName()+"卖出了第"+num+"张票");
				num--;
			
			}else{
				System.out.println("售罄了！");
				break;
				}
			}
		}
	}
public static void main(String[] args) {
	
	Demo2 d=new Demo2();
	Thread thread1=new Thread(d,"窗口1");
	Thread thread2=new Thread(d,"窗口2");
	Thread thread3=new Thread(d,"窗口3");
	thread1.start();
	thread2.start();
	thread3.start();

}
}
