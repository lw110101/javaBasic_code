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

	// ��дһ�������������������ļ����ض�Ӧ�Ķ���
	public static Object getInstance() throws Exception {
		// ����������
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(".\\info.txt")));
		// ��ȡ��һ�е�����
		String forName = bufferedReader.readLine();
		// ��ȡClass����
		Class clazz = Class.forName(forName);
		// ��ȡ���췽��
		Constructor construct = clazz.getDeclaredConstructor(null);
		// ����Ȩ��
		construct.setAccessible(true);
		// ��������
		Object o = construct.newInstance(null);
		// ��ȡ��������
		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			String[] data = line.split("=");
			// ��ȡ��Ա����
			Field field = clazz.getDeclaredField(data[0]);
			field.setAccessible(true);
			// ��ֵ
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
