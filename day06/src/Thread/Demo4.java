package Thread;
//--Runnableʵ������������
class Product implements Runnable{
	String name;
	double price;
	boolean flag=false;
	int i=0;
	static Object o=new Object();
	//Product p;
	public void run(){
		while(true){	
			if("������".equals(Thread.currentThread().getName())){
				synchronized (o) {
				if(flag==false){
				if(i%2==0){
					name="ƻ��";
					price=4.5;
				}else{
					name="�㽶";
					price=2.5;
				}
				System.out.println("������������"+name+"  �۸��ǣ�"+price);
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
			}else if("������".equals(Thread.currentThread().getName())){
				synchronized (o) {
				if(flag==true){
				System.out.println("������������"+name+"  �۸��ǣ�"+price);
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
		Thread thread1=new Thread(p,"������");
		Thread thread2=new Thread(p,"������");
		thread1.start();
		thread2.start();

}
}
