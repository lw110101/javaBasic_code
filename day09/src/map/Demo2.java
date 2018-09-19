package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
迭代：
	Set<K> keySet()
	Set<Map.Entry<K,V>> entrySet()
	Collection<V> values()   
	*/
public class Demo2 {

	public static void main(String[] args) {
		
		Map<String,String> map=new HashMap<String,String>();
		String[] arr= {"小学","初中","高中","大学"};
		String[] brr= {"希望小学","于都中学","师大附中","南昌大学"};
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], brr[i]);
		}
		System.out.println("集合元素是:"+map);
		System.out.println("====keySet()方法遍历map元素(键)=========");
		Set<String> set=map.keySet();
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			String key=it.next();
			System.out.print(key+"="+map.get(key)+"  ");
		}

		System.out.println("\r\n====values()方法遍历map元素(值)=========");
		Collection<String> c=map.values();
		Iterator<String> it1=c.iterator();
		while(it1.hasNext()) {
			String value=it1.next();
			System.out.print("值是:"+value+" ");
		}
		
		System.out.println("\r\n====entrySet()方法遍历map元素(键与值)=========");
		Set<Map.Entry<String,String>> set1=map.entrySet();
		Iterator<Map.Entry<String,String>> it2=set1.iterator();
		while(it2.hasNext()) {
			Map.Entry<String,String> entry=it2.next();
			//**Entry是内部类。内部类的格式：	外部类.内部类<> 变量名=new 外部类.内部类();						
			System.out.print(entry+"  ");
			System.out.println("键:"+entry.getKey()+" <==> "+"值:"+entry.getValue());
		}
	}
}
