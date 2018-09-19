package set;
import java.util.HashSet;


//HashSet()

class Animals{
	String name;
	int id;
	public Animals(String name,int id) {
		this.name=name;
		this.id=id;
	}
	
	public String toString() {
		return "����:"+this.name+" ���:"+this.id;
	}
	
	public int hashCode() {
		
		return this.id ;
	}
	
	public boolean equals(Object obj) {
		Animals a=(Animals)obj;
		return this.id==a.id;
	}
}
public class Demo1 {
	public static void main(String[] args) {
		/*
		HashSet set=new HashSet();
		set.add("˫��");
		set.add("��˾��");
		set.add("����");
		System.out.println("���Ԫ�سɹ���"+set.add("����"));
		System.out.println("����Ԫ����:"+set);
		*/
		HashSet<Animals> set=new HashSet<Animals>();
		set.add(new Animals("����",110));
		set.add(new Animals("����",120));
		set.add(new Animals("����",130));
		set.add(new Animals("˹�ʹ�",110));
		
		System.out.println("���Ԫ�سɹ���"+set.add(new Animals("˹�ʹ�",110)));
		System.out.println("����Ԫ����:"+set);
	}
}
