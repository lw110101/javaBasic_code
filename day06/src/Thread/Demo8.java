package Thread;
/*
һ��ˮ�أ��̶�����500L��һ�߽�ˮ��һ�߳�ˮ����ˮ���ˮ����ͬʱ���У�
ˮ�����˲��ܽ���עˮ��һ�����ˣ����ܽ��з�ˮ����ˮ�ٶ�5Lÿ�룬��ˮ2Lÿ��
 */

class Collection implements Runnable{
	int bulk;

	public void run(){
		while(bulk<=500){
			synchronized ("ˮ��") {
		if("��ˮ".equals(Thread.currentThread().getName())){
			if(bulk>=2){
				bulk=bulk-2;
				System.out.println("�ɹ���ˮ2L����ʣ"+bulk);
				
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(bulk==1){
				System.out.println("�ɹ���ˮ1L��ˮ�ؿ��ˣ�ֹͣ��ˮ����");
				break;
			}
		}else if("��ˮ".equals(Thread.currentThread().getName())){
			if(bulk<=495){
				bulk=bulk+5;
				System.out.println("�ɹ���ˮ5L����ʣ"+bulk);

				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(bulk>495){
				
				System.out.println("�ɹ���ˮ"+(500-bulk)+"��ˮ���ˣ�ֹͣ��ˮ��");
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
			Thread thread1=new Thread(c,"��ˮ");
			Thread thread2=new Thread(c,"��ˮ");
	
			thread1.start();
			thread2.start();
		}
}
