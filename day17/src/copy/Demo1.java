package copy;
//克隆
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
		return "姓名:" + this.name + "  编号：" + this.id+"  城市:"+this.address.city;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public void show() {
		System.out.println("哈哈！！！");
	}
	
}

public class Demo1 {

	public static void main(String[] args) throws Exception {
		Address address=new Address("南昌");
		Person p1=new Person("狗娃",110,address);
//============= 引用地址而已  =====================
		
		Person p2=p1;  
		p2.id=120;
		/*System.out.println("p1:"+p1);*/
		System.out.println("p2:"+p2);
		
//==============  浅克隆  ======================		
		Person p3=(Person) p1.clone();
		p3.name="狗剩";
		p3.address.city="赣州";
		System.out.println("p1:"+p1);
		System.out.println("p3:"+p3);
		
		
	}
}
