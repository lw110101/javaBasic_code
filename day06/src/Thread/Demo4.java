package Thread;
//--Runnable实现生产与消费
class Product implements Runnable{
	String name;
	double price;
	boolean flag=false;
	int i=0;
	static Object o=new Object();
	//Product p;
	public void run(){
		while(true){	
			if("生产者".equals(Thread.currentThread().getName())){
				synchronized (o) {
				if(flag==false){
				if(i%2==0){
					name="苹果";
					price=4.5;
				}else{
					name="香蕉";
					price=2.5;
				}
				System.out.println("生产者生产了"+name+"  价格是："+price);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				i=i+(int)Math.round(Math.random());
				flag=true;
				o.notify();
				}else{
					try {
						o.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				}
			}else if("消费者".equals(Thread.currentThread().getName())){
				synchronized (o) {
				if(flag==true){
				System.out.println("消费者消费了"+name+"  价格是："+price);
				flag=false;
				o.notify();
				}else{
					try {
						o.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			}
		}
	}
}

public class Demo4 {
	public static void main(String[] args) {
		Product p=new Product();
		Thread thread1=new Thread(p,"生产者");
		Thread thread2=new Thread(p,"消费者");
		thread1.start();
		thread2.start();

}
}
