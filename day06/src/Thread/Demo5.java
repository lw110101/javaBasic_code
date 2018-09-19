package Thread;
//线程的停止
class Demo extends Thread{
	
	public Demo(String name){
		super(name);
	}
	
	int i=0;
	boolean flag=true;
	
	public synchronized void run(){
		while(flag){
		try {
			this.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			System.out.println(this.getName()+i);
			i++;
		}
	}
}

public class Demo5{
	//主线程执行到80停止自定义线程。
	public static void main(String[] args) throws InterruptedException {
		Demo d=new Demo("肥喵");
		d.setPriority(10);
		d.start();
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+i);
			Thread.sleep(100);
			if(i==80){
				d.flag=false;
				synchronized (d) {
					d.notify();
				}
			}
		}
	}
}
