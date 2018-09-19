package Thread;
/*
 * Thread(String name)   初始化线程名字
	gatName()    返回线程的名字
	setName(String name)   设置线程对象名
	
	sleep()   线程睡眠指定的毫秒数    静态的方法，哪个线程执行sleep方法，那么就哪个线程进入睡眠。
	getPriority()	返回当前线程对象的优先级，默认线程的优先级是5
	setPriority()	设置线程的优先级  虽然设置了线程优先级，但具体的实现取决于底层操作系统的实现
		（优先级最大10，最小1，默认5）
	currentThread()	返回cpu正在执行的线程的对象。静态的方法，哪个线程执行currentThread方法，那么就返回哪个线程的对象。
 */
public class Demo2 extends Thread{
	public Demo2(String name){
		super(name);
	}
	@Override
	public void run() {
		for(int i=0;i<20;i++){
		System.out.println("肥喵"+i);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		System.out.println("线程对象是："+Thread.currentThread());
		System.out.println("this："+this);//this表示当前对象	
	}
	public static void main(String[] args) throws InterruptedException {
		Demo2 d=new Demo2("司姐");
		System.out.println("线程的名字是："+d.getName());
		d.setName("少司命");
		System.out.println("设置线程名字："+d.getName());
		//sleep()方法
		d.setPriority(10);
		Thread.sleep(500);
		d.start();
		//currentThread方法
		System.out.println("主线程对象是："+Thread.currentThread());
		//(get)setPriority()方法
		System.out.println("主线程的优先级："+Thread.currentThread().getPriority());
		System.out.println("自定义线程的优先级："+d.getPriority());

	}

}
