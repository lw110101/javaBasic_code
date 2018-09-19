package collection;

import java.util.ArrayList;
import java.util.Collection;

/* 迭代：
	toArray()   遍历集合元素。
	iterator()
 */

class Person{
	String name;
	String sex;
	public Person(String name,String sex){
		this.name=name;
		this.sex=sex;
	}
	public String toString(){
		
		return "姓名："+name+" 性别："+sex;
	}
}
public class Demo4 {

		public static void main(String[] args) {
			Collection<Person> c=new ArrayList<Person>();
			c.add(new Person("张三","男"));
			c.add(new Person("李四","女"));
			//c.add("abc");
			System.out.println(c);
			Collection<Person> c1=new ArrayList<Person>();
			c1.add(new Person("铁蛋","男"));
			System.out.println(c1);
			
			Object[] arr=c.toArray();
			for(int i=0;i<arr.length;i++){
				Person p=(Person)arr[i];  ///特有属性要强制类型转换才能使用
				if(p.name.equals("李四")){
					System.out.println(p);
				}
			}
			
			
			
		}
}
