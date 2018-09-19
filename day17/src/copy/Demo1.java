package copy;
//��¡
class Address{
	String city;

	public Address(String city) {
		this.city = city;
	}
	
}
class Person implements Cloneable{
	
	String name;
	
	int id;

	Address address;
	public Person(String name, int id) {

		this.name = name;
		this.id = id;
	}
	public Person(String name, int id, Address address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}

	@Override
	public String toString() {
		return "����:" + this.name + "  ��ţ�" + this.id+"  ����:"+this.address.city;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public void show() {
		System.out.println("����������");
	}
	
}

public class Demo1 {

	public static void main(String[] args) throws Exception {
		Address address=new Address("�ϲ�");
		Person p1=new Person("����",110,address);
//============= ���õ�ַ����  =====================
		
		Person p2=p1;  
		p2.id=120;
		/*System.out.println("p1:"+p1);*/
		System.out.println("p2:"+p2);
		
//==============  ǳ��¡  ======================		
		Person p3=(Person) p1.clone();
		p3.name="��ʣ";
		p3.address.city="����";
		System.out.println("p1:"+p1);
		System.out.println("p3:"+p3);
		
		
	}
}
