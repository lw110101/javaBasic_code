package map;

import java.util.HashMap;
import java.util.Map;

/*
V put(K key, V value)   如果之前没有该键，返回Null,否则返回之前的值
void putAll(Map<? extends K,? extends V> m)  添加集合

 获取：
int size()   获取Map集合的键值对的个数
V get(Object key)   根据指定的键获取对应的值

 判断：
boolean containsKey(Object key)   判断集合是否包含指定的键
boolean containsValue(Object value)   判断集合是否包含指定的值   
boolean isEmpty()   判断是否为空集合

 删除：
clear()  情况集合的所有数据
V remove(Object key)   根据键删除一条数据，返回该键对应的值
*/
public class Demo1 {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		
		map.put("谢霆锋","张柏芝");
		map.put("文章","马伊俐");
		map.put("习近平","彭丽媛");
		
		System.out.println("返回值是:"+map.put("老师","学生"));
		System.out.println("返回值是:"+map.put("谢霆锋", "王菲"));  //根据键返回之前对应值，不存在返回NUll
		/*//添加
		Map<String,String> map1=new HashMap<String,String>();
		map1.put("许仙","白蛇");
		map1.put("吴奇隆","刘诗诗");
		map.putAll(map1);
		//获取
		System.out.println("集合个数是:"+map.size());
		System.out.println("根据键获取的值："+map.get("文章"));
		//删除
		map.clear();
		System.out.println("根据指定键删除一条数据："+map.remove("老师"));
		System.out.println(map.remove("学生"));
		*/ //判断
		System.out.println("判断是否包含指定键:"+map.containsKey("习近平"));
		System.out.println("判断是否包含指定值:"+map.containsValue("学生"));
		//map.clear();
		System.out.println("判断是否为空："+map.isEmpty());
		
		System.out.println("集合元素是:"+map);
	}
}
