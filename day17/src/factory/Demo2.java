package factory;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import reflect.Person;

public class Demo2 {

	public static void main(String[] args) throws Exception {

		Person p = (Person) getInstance();
		System.out.println(p);
	}

	// 编写一个工厂方法根据配置文件返回对应的对象。
	public static Object getInstance() throws Exception {
		// 创建输入流
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(".\\info.txt")));
		// 获取第一行的数据
		String forName = bufferedReader.readLine();
		// 获取Class对象
		Class clazz = Class.forName(forName);
		// 获取构造方法
		Constructor construct = clazz.getDeclaredConstructor(null);
		// 设置权限
		construct.setAccessible(true);
		// 创建对象
		Object o = construct.newInstance(null);
		// 读取其他数据
		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			String[] data = line.split("=");
			// 获取成员变量
			Field field = clazz.getDeclaredField(data[0]);
			field.setAccessible(true);
			// 赋值
			if (field.getType() == int.class) {
				field.set(o, Integer.parseInt(data[1]));
			} else {
				field.set(o, data[1]);
			}

		}
		bufferedReader.close();
		return o;
	}
}
