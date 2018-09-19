package Thread;
//建筑施工------》join方法

class Builder extends Thread{
	public void run(){
		System.out.println("选址打地基");
		System.out.println("开始外围砌墙");
		System.out.println("浇水泥");
		System.out.println("第一层做好了,材料不够了");
		//建筑材料不够，叫boss买
		Boss B=new Boss();
		B.start();
		try {
			B.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("继续砌墙");
		System.out.println("建筑封顶");

	}
}

class Boss extends Thread{
	public void run(){
		System.out.println("开始筹资");
		System.out.println("去建材市场进货");
		System.out.println("把沙石，水泥运到工地");
	}
}
public class Demo7 {
	public static void main(String[] args) {
		Builder b=new Builder();
		b.start();
	}
}
