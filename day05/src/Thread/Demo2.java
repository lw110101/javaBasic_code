package Thread;
/*
 * Thread(String name)   ��ʼ���߳�����
	gatName()    �����̵߳�����
	setName(String name)   �����̶߳�����
	
	sleep()   �߳�˯��ָ���ĺ�����    ��̬�ķ������ĸ��߳�ִ��sleep��������ô���ĸ��߳̽���˯�ߡ�
	getPriority()	���ص�ǰ�̶߳�������ȼ���Ĭ���̵߳����ȼ���5
	setPriority()	�����̵߳����ȼ�  ��Ȼ�������߳����ȼ����������ʵ��ȡ���ڵײ����ϵͳ��ʵ��
		�����ȼ����10����С1��Ĭ��5��
	currentThread()	����cpu����ִ�е��̵߳Ķ��󡣾�̬�ķ������ĸ��߳�ִ��currentThread��������ô�ͷ����ĸ��̵߳Ķ���
 */
public class Demo2 extends Thread{
	public Demo2(String name){
		super(name);
	}
	@Override
	public void run() {
		for(int i=0;i<20;i++){
		System.out.println("����"+i);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		System.out.println("�̶߳����ǣ�"+Thread.currentThread());
		System.out.println("this��"+this);//this��ʾ��ǰ����	
	}
	public static void main(String[] args) throws InterruptedException {
		Demo2 d=new Demo2("˾��");
		System.out.println("�̵߳������ǣ�"+d.getName());
		d.setName("��˾��");
		System.out.println("�����߳����֣�"+d.getName());
		//sleep()����
		d.setPriority(10);
		Thread.sleep(500);
		d.start();
		//currentThread����
		System.out.println("���̶߳����ǣ�"+Thread.currentThread());
		//(get)setPriority()����
		System.out.println("���̵߳����ȼ���"+Thread.currentThread().getPriority());
		System.out.println("�Զ����̵߳����ȼ���"+d.getPriority());

	}

}
