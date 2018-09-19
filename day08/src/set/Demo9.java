package set;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//作业2：使用map实现教育工作经历，小明读过两个小学，三个公司，遍历输出
class Person{
	String name;

	public Person(String name) {
		
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "姓名:"+this.name;
	}
}
public class Demo9 {

	public static void main(String[] args) {
		
		HashMap<Person,String> map=new HashMap<Person,String>();
		
		map.put(new Person("小明"),"1999-9   阳光小学");
		map.put(new Person("小明"),"2002-9   希望小学");
		map.put(new Person("小明"),"2011-7 A公司");
		map.put(new Person("小明"),"2013-7 B公司");
		map.put(new Person("小明"),"2017-5 C公司");
		Set<Map.Entry<Person, String>> set=map.entrySet();
		System.out.println("教育工作经历:");
		for(Map.Entry<Person, String> entry:set ) {
			System.out.println(entry);
		}
		/*Iterator<Map.Entry<Person, String>> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+"  ");
		}*/
	}
}
