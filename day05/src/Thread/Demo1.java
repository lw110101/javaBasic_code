package Thread;
//线程
public class Demo1 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<100;i++){
			System.out.println("自定义线程"+i);
		}
	}

	public static void main(String[] args) {
		Demo1 d=new Demo1();
		d.start();
		for(int i=0;i<100;i++){
			System.out.println("主线程"+i);
		}
	
	}

}
