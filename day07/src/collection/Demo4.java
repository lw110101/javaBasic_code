package collection;

import java.util.ArrayList;
import java.util.Collection;

/* ������
	toArray()   ��������Ԫ�ء�
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
		
		return "������"+name+" �Ա�"+sex;
	}
}
public class Demo4 {

		public static void main(String[] args) {
			Collection<Person> c=new ArrayList<Person>();
			c.add(new Person("����","��"));
			c.add(new Person("����","Ů"));
			//c.add("abc");
			System.out.println(c);
			Collection<Person> c1=new ArrayList<Person>();
			c1.add(new Person("����","��"));
			System.out.println(c1);
			
			Object[] arr=c.toArray();
			for(int i=0;i<arr.length;i++){
				Person p=(Person)arr[i];  ///��������Ҫǿ������ת������ʹ��
				if(p.name.equals("����")){
					System.out.println(p);
				}
			}
			
			
			
		}
}
