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
		return "名字:"+this.name+" 编号:"+this.id;
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
		set.add("双笙");
		set.add("少司命");
		set.add("许嵩");
		System.out.println("添加元素成功吗？"+set.add("许嵩"));
		System.out.println("集合元素是:"+set);
		*/
		HashSet<Animals> set=new HashSet<Animals>();
		set.add(new Animals("阿旺",110));
		set.add(new Animals("肥喵",120));
		set.add(new Animals("阿紫",130));
		set.add(new Animals("斯巴达",110));
		
		System.out.println("添加元素成功吗？"+set.add(new Animals("斯巴达",110)));
		System.out.println("集合元素是:"+set);
	}
}
