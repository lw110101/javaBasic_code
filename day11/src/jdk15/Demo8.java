package jdk15;
//ö����
enum Seasons{
	spring("����") {
		@Override
		public void run() {
			System.out.println("��������");
		}
	},summer("����") {
		@Override
		public void run() {
			System.out.println("��������");
		}
	},actumn("����") {
		@Override
		public void run() {
			System.out.println("��������");
		}
	},winter("����") {
		@Override
		public void run() {
			System.out.println("��������");	
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
		s.getValue("����");
		s.run();
		*/
		Seasons s=Seasons.actumn;
		switch(s) {
		case spring:
			System.out.println("����");
			break;
		case summer:
			System.out.println("����");
			break;
		case actumn:
			System.out.println("����");
			break;
		case winter:
			System.out.println("����");
			break;
			default:
				System.out.println("abc");
		}
	}
}
