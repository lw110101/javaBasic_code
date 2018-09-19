package Thread;
/*
一个水池，固定容量500L，一边进水，一边出水，进水与放水不能同时进行，
水池满了不能进行注水，一旦空了，不能进行放水，进水速度5L每秒，放水2L每秒
 */

class Collection implements Runnable{
	int bulk;

	public void run(){
		while(bulk<=500){
			synchronized ("水阀") {
		if("放水".equals(Thread.currentThread().getName())){
			if(bulk>=2){
				bulk=bulk-2;
				System.out.println("成功放水2L！还剩"+bulk);
				
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(bulk==1){
				System.out.println("成功放水1L！水池空了！停止放水。。");
				break;
			}
		}else if("进水".equals(Thread.currentThread().getName())){
			if(bulk<=495){
				bulk=bulk+5;
				System.out.println("成功进水5L，还剩"+bulk);

				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(bulk>495){
				
				System.out.println("成功进水"+(500-bulk)+"，水满了，停止进水！");
				bulk=500;
				break;
			}
				}
			}
		}
	}
}
public class Demo8 {

		public static void main(String[] args) {
			Collection c=new Collection();
			Thread thread1=new Thread(c,"放水");
			Thread thread2=new Thread(c,"进水");
	
			thread1.start();
			thread2.start();
		}
}
