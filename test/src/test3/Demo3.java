package test3;

import java.util.Arrays;

//自定义类MyArrayList 模拟实现ArrayList类的增删查改的行为
class MyArrayList{
	
	Object[] obj;

	int index=0;
	public MyArrayList() {
		obj=new Object[1];
	}
	//判断内存是否足够
	public void ensureCapacity() {
		if(index==obj.length) {
			int newLength=obj.length*2;
			obj=Arrays.copyOf(obj, newLength);
		}
	}
	//判断元素是否存在
	public boolean ensureElement(Object o) {
		int count=0;
		for(Object element:obj) {
			if(!element.equals(o)) {
				count++;
			}
		}
		if(count==size()) {
			return false;
		}else {
			return true;
		}
	}
	//增
	public void add(Object o) {
		ensureCapacity();
		obj[index++]=o;
	}
	//删
	public boolean delete(Object o) {
		
		if(ensureElement(o)) {
			
			for(int i=0;i<size();i++) {
				if(obj[i]==o) {
					obj[i]=null;
				}
			}
			index--;
			return true;
		}else {
			return false;
		}		
	}
	//查
	public void checkAll() {
		System.out.println(Arrays.toString(obj));
	}
	public void check(Object element) {
		System.out.println(element);
	}
	//改
	public Object change(Object original,Object newObj) throws Exception{
		if(ensureElement(original)) {
			return newObj;
		}else {
			throw new Exception("元素不存在!");
		}
	}
	//长度
	public int size() {
		return index;
	}
	@Override
	public String toString() {
		
		return Arrays.toString(obj);
	}
}
public class Demo3 {

	public static void main(String[] args) {
		
		MyArrayList list=new MyArrayList();
		list.add(123);
		list.add("abc");
		
		System.out.println(list.delete(123));
		System.out.println("长度:"+list.size());
		list.checkAll();
	}
}
