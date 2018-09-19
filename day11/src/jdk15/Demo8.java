package jdk15;
//枚举类
enum Seasons{
	spring("春天") {
		@Override
		public void run() {
			System.out.println("春天在跑");
		}
	},summer("夏天") {
		@Override
		public void run() {
			System.out.println("夏天在跑");
		}
	},actumn("秋天") {
		@Override
		public void run() {
			System.out.println("秋天在跑");
		}
	},winter("冬天") {
		@Override
		public void run() {
			System.out.println("冬天在跑");	
		}
	};
	String value;

	private Seasons(String value) {
		this.value = value;
	}
	
	public void getValue(String value) {
		System.out.println("value:"+value);
	}
	
	public abstract void run();
}

public class Demo8 {
	
	public static void main(String[] args) {
		/*
		Seasons s=Seasons.actumn;
		s.getValue("春天");
		s.run();
		*/
		Seasons s=Seasons.actumn;
		switch(s) {
		case spring:
			System.out.println("春天");
			break;
		case summer:
			System.out.println("夏天");
			break;
		case actumn:
			System.out.println("秋天");
			break;
		case winter:
			System.out.println("冬天");
			break;
			default:
				System.out.println("abc");
		}
	}
}
