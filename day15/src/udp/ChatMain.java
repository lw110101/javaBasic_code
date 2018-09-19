package udp;

public class ChatMain {

	public static void main(String[] args) {
		ChatReceiver receiver=new ChatReceiver();
		receiver.start();
		
		ChatSender sender=new ChatSender();
		sender.start();
		
	}
}
