package Thread;
//�������߳���ʵ�ֶ��߳�
class VideoChat extends Thread{
	
	public void run(){
		for(int i=0;i<20;i++){
			System.out.println(i+"������Ƶ���졣��");
		}
	}
}

class BrowseWeb extends Thread{
	public void run(){
		for(int i=0;i<20;i++){
			System.out.println(i+"���������ҳ����");
		}
	}
} 

class TypeChat extends Thread{
	public void run(){
		for(int i=0;i<20;i++){
			System.out.println(i+"���ڴ������졣��");
		}
	}
}
public class Demo3 extends Thread {
	//����ģ����Ƶ���죬�����ҳ����������

	public static void main(String[] args) {
		VideoChat vc=new VideoChat();
		vc.start();
		BrowseWeb bw=new BrowseWeb();
		bw.start();
		TypeChat tc=new TypeChat();
		tc.start();
		for(int i=0;i<20;i++){
			System.out.println(i+"���߳�����ִ�С���");
		}
		
	}

}
