package test2;
/*
	使用java类描述 某某公司的门的实现过程,该公司的门具备普通门的所用属性与openDoor()和关门closeDoor()的功能。
	然后该公司对门进行另外的功能设计,防盗--theftproof()、防水--waterproof()、防弹--bulletproof() 
	要求利用继承、抽象类、接口的知识设计该门
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
	
		return "类型:"+this.name+"  颜色:"+this.color;
	}
}

class NewDoor extends Door {

	public NewDoor(String name, String color) {
		super(name, color);
	}

	public void openDoor() {
		System.out.println("开门。。");
	}

	public void closeDoor() {
		System.out.println("关门。。");
	}
	
	public void theftproof() {
		System.out.println("我能防盗。。");
	}

	public void waterproof() {
		System.out.println("我能防水。。");
	}

	public void bulletproof() {
		System.out.println("我能防弹。。");
	}
}

public class Demo3 {

	public static void main(String[] args) {
		 
		NewDoor door=new NewDoor("实木门", "棕色");
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
