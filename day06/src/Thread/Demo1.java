package Thread;
//死锁问题

class DeadLock extends Thread{
	public DeadLock(String name){
		super(name);
	}
	public void run(){
		if("智者1".equals(this.getName())){
			synchronized ("5号筷子"){
				System.out.println("智者1拿到了5号筷，准备拿1号筷子吃饭！");
				synchronized ("1号筷子") {
					System.out.println("智者1拿到了5号跟1号筷子开始吃饭！");
				}
			}
		}else if("智者2".equals(this.getName())){
			synchronized ("1号筷子"){
				System.out.println("智者2拿到了1号筷，准备拿2号筷子吃饭！");
				synchronized ("2号筷子") {
					System.out.println("智者2拿到了2号跟1号筷子开始吃饭！");
				}
			}
		}else if("智者3".equals(this.getName())){
			synchronized ("2号筷子"){
				System.out.println("智者3拿到了2号筷，准备拿3号筷子吃饭！");
				synchronized ("3号筷子") {
					System.out.println("智者3拿到了2号跟3号筷子开始吃饭！");
				}
			}
		}else if("智者4".equals(this.getName())){
			synchronized ("3号筷子"){
				System.out.println("智者4拿到了3号筷，准备拿4号筷子吃饭！");
				synchronized ("4号筷子") {
					System.out.println("智者4拿到了3号跟4号筷子开始吃饭！");
				}
			}
		}else if("智者5".equals(this.getName())){
			synchronized ("4号筷子"){
				System.out.println("智者5拿到了4号筷，准备拿5号筷子吃饭！");
				synchronized ("5号筷子") {
					System.out.println("智者5拿到了4号跟5号筷子开始吃饭！");
				}
			}
		}
	}
}
public class Demo1 {
	public static void main(String[] args) {
		DeadLock thread1=new DeadLock("智者1");
		DeadLock thread2=new DeadLock("智者2");
		DeadLock thread3=new DeadLock("智者3");
		DeadLock thread4=new DeadLock("智者4");
		DeadLock thread5=new DeadLock("智者5");
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
	}
}
