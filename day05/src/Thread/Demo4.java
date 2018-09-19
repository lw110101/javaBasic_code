package Thread;
//四个窗口售票60张，多线程

class SaleTicket extends Thread{
	static int num=60;
	static Object o=new Object();//唯一共享
	public 	SaleTicket(String name){
		super(name);
	}
	public void run(){
		
		while(true){
			synchronized(o){
			if(num>0){     //this=Thread.currentThread();
			System.out.println(this.getName()+"售出了第"+num+"张票");
			num--;
		}else{
			System.out.println("售罄了。。");
			break;
			}
		}
		}
	}
}

public class Demo4{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SaleTicket thread1=new SaleTicket("窗口1");
		SaleTicket thread2=new SaleTicket("窗口2");
		SaleTicket thread3=new SaleTicket("窗口3");
		thread1.start();
		thread2.start();
		thread3.start();
	
	}

}
