package reflect;

public class Person {

	String name;

	private int id;

	public Person(String name, int id) {

		this.name = name;
		this.id = id;
	}

	@SuppressWarnings("unused")
	private Person() {

	}

	@Override
	public String toString() {

		return "����:" + this.name + "  ���:" + this.id;
	}

	@SuppressWarnings("unused")
	private void run() {
		System.out.println("���ݡ�����");
	}

	public void eat() {
		System.out.println(name + "�Գԡ���");
	}
}
