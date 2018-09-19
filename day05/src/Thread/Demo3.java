package Thread;
//定义多个线程类实现多线程
class VideoChat extends Thread{
	
	public void run(){
		for(int i=0;i<20;i++){
			System.out.println(i+"正在视频聊天。。");
		}
	}
}

class BrowseWeb extends Thread{
	public void run(){
		for(int i=0;i<20;i++){
			System.out.println(i+"正在浏览网页。。");
		}
	}
} 

class TypeChat extends Thread{
	public void run(){
		for(int i=0;i<20;i++){
			System.out.println(i+"正在打字聊天。。");
		}
	}
}
public class Demo3 extends Thread {
	//需求：模拟视频聊天，浏览网页，打字聊天

	public static void main(String[] args) {
		VideoChat vc=new VideoChat();
		vc.start();
		BrowseWeb bw=new BrowseWeb();
		bw.start();
		TypeChat tc=new TypeChat();
		tc.start();
		for(int i=0;i<20;i++){
			System.out.println(i+"主线程正在执行。。");
		}
		
	}

}
