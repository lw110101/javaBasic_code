package Thread;
//需求：银行取钱，，一个存折，一个卡，同时取10000.不出现线程安全问题

class DrawMoney extends Thread{
	static int money=10000;
	public DrawMoney(String name){
		super(name);
	}
	
	public void run(){
		
		while(true){
			synchronized ("🔒") {
			if(money>0){
		System.out.println("用"+this.getName()+"取了500块钱");
		money=money-500;
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}else{
		System.out.println("余额不足，请查询后再操作！");
		break;
		}
	}
		}
			
	}
}

public class Demo5 {
	public static void main(String[] args) {
		
		DrawMoney d1=new DrawMoney("存折");
		DrawMoney d2=new DrawMoney("银行卡");
		d1.start();
		d2.start();

	}
}
