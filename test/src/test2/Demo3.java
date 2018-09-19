package test2;
/*
	ʹ��java������ ĳĳ��˾���ŵ�ʵ�ֹ���,�ù�˾���ž߱���ͨ�ŵ�����������openDoor()�͹���closeDoor()�Ĺ��ܡ�
	Ȼ��ù�˾���Ž�������Ĺ������,����--theftproof()����ˮ--waterproof()������--bulletproof() 
	Ҫ�����ü̳С������ࡢ�ӿڵ�֪ʶ��Ƹ���
*/
interface Function {
	
	
	public void theftproof();
	
	public void waterproof();
	
	public void bulletproof();
}

abstract class Door implements Function {
	String name;
	String color;

	public Door(String name, String color) {
		this.name = name;
		this.color = color;
	}
	public abstract void openDoor();

	public abstract void closeDoor();

	@Override
	public String toString() {
	
		return "����:"+this.name+"  ��ɫ:"+this.color;
	}
}

class NewDoor extends Door {

	public NewDoor(String name, String color) {
		super(name, color);
	}

	public void openDoor() {
		System.out.println("���š���");
	}

	public void closeDoor() {
		System.out.println("���š���");
	}
	
	public void theftproof() {
		System.out.println("���ܷ�������");
	}

	public void waterproof() {
		System.out.println("���ܷ�ˮ����");
	}

	public void bulletproof() {
		System.out.println("���ܷ�������");
	}
}

public class Demo3 {

	public static void main(String[] args) {
		 
		NewDoor door=new NewDoor("ʵľ��", "��ɫ");
		System.out.println(door);
		print(door);
		
	}

	public static void print(NewDoor door) {	
		door.closeDoor();
		door.openDoor();
		door.bulletproof();
		door.theftproof();
		door.waterproof();
	}
}
