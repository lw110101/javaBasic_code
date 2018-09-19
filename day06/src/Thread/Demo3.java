package Thread;
//生产与消费问题-----继承线程类
//产品类
class Products{//Product由于Demo4出现，所以加个s以示区别，要编译注意修改后面。
	String name;
	
	double price;
	
	boolean flag=false;
}
//生产类
class Producer extends Thread{
	public Producer(Product p){
		this.p=p;
	}
	
	Product p;
	int i=0;
	public void run(){
	while(true){
		synchronized (p) {
		if(p.flag==false){
				if(i%2==0){
					p.name="苹果";
					p.price=4.5;
				}else{
					p.name="香蕉";
					p.price=2.0;
				}
				System.out.println("生产者生产了"+p.name+"  价格是："+p.price);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				p.flag=true;
				i++;
			p.notify();
		}else{
			try {
				p.wait();
				}catch (InterruptedException e){
			// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	}
}
//消费类
class Customer extends Thread{
	public Customer(Product p){
		this.p=p;
	}
	Product p;
	public void run(){
	while(true){
		synchronized (p) {
		if(p.flag==true){
		System.out.println("消费者消费了"+p.name+"  价格是："+p.price);
		p.flag=false;
		p.notify();
		}else{
			try {
				p.wait();
			}catch (InterruptedException e){
				// TODO Auto-generated catch block
				e.printStackTrace();
					}
				}
			}
		}
	}
}

public class Demo3 {
	public static void main(String[] args) {
		Product p=new Product();
		Customer c=new Customer(p);
		Producer d=new Producer(p);
		c.start();
		d.start();
}
}
