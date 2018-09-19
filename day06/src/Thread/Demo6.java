package Thread;
//模拟程序安装包后台运行下载---->守护线程

class Routine extends Thread{
	public Routine(String name){
		super(name);
	}
	public void run(){
		for(int i=0;i<=100;i++){
			System.out.println(this.getName()+"软件更新包下载了"+i+"%");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i==100){
				System.out.println(this.getName()+"更新包下载完毕，准备安装！");
			}
		}
	}
}
public class Demo6 {
	public static void main(String[] args) {
		Routine r=new Routine("MyException");
		r.setDaemon(true);
		System.out.println("Routine是守护线程吗？"+	r.isDaemon());
	
		r.start();
		for(int i=0;i<=100;i++){
			System.out.println(Thread.currentThread().getName()+"退出中"+i+"%");
		}
}
}
