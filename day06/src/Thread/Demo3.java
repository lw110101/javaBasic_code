package Thread;
//��������������-----�̳��߳���
//��Ʒ��
class Products{//Product����Demo4���֣����ԼӸ�s��ʾ����Ҫ����ע���޸ĺ��档
	String name;
	
	double price;
	
	boolean flag=false;
}
//������
class Producer extends Thread{
	public Producer(Product p){
		this.p=p;
	}
	
	Product p;
	int i=0;
	public void run(){
	while(true){
		synchronized (p) {
		if(p.flag==false){
				if(i%2==0){
					p.name="ƻ��";
					p.price=4.5;
				}else{
					p.name="�㽶";
					p.price=2.0;
				}
				System.out.println("������������"+p.name+"  �۸��ǣ�"+p.price);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				p.flag=true;
				i++;
			p.notify();
		}else{
			try {
				p.wait();
				}catch (InterruptedException e){
			// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	}
}
//������
class Customer extends Thread{
	public Customer(Product p){
		this.p=p;
	}
	Product p;
	public void run(){
	while(true){
		synchronized (p) {
		if(p.flag==true){
		System.out.println("������������"+p.name+"  �۸��ǣ�"+p.price);
		p.flag=false;
		p.notify();
		}else{
			try {
				p.wait();
			}catch (InterruptedException e){
				// TODO Auto-generated catch block
				e.printStackTrace();
					}
				}
			}
		}
	}
}

public class Demo3 {
	public static void main(String[] args) {
		Product p=new Product();
		Customer c=new Customer(p);
		Producer d=new Producer(p);
		c.start();
		d.start();
}
}
