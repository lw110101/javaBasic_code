package map;

import java.util.HashMap;
import java.util.Map;

/*
V put(K key, V value)   ���֮ǰû�иü�������Null,���򷵻�֮ǰ��ֵ
void putAll(Map<? extends K,? extends V> m)  ��Ӽ���

 ��ȡ��
int size()   ��ȡMap���ϵļ�ֵ�Եĸ���
V get(Object key)   ����ָ���ļ���ȡ��Ӧ��ֵ

 �жϣ�
boolean containsKey(Object key)   �жϼ����Ƿ����ָ���ļ�
boolean containsValue(Object value)   �жϼ����Ƿ����ָ����ֵ   
boolean isEmpty()   �ж��Ƿ�Ϊ�ռ���

 ɾ����
clear()  ������ϵ���������
V remove(Object key)   ���ݼ�ɾ��һ�����ݣ����ظü���Ӧ��ֵ
*/
public class Demo1 {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		
		map.put("л����","�Ű�֥");
		map.put("����","������");
		map.put("ϰ��ƽ","������");
		
		System.out.println("����ֵ��:"+map.put("��ʦ","ѧ��"));
		System.out.println("����ֵ��:"+map.put("л����", "����"));  //���ݼ�����֮ǰ��Ӧֵ�������ڷ���NUll
		/*//���
		Map<String,String> map1=new HashMap<String,String>();
		map1.put("����","����");
		map1.put("����¡","��ʫʫ");
		map.putAll(map1);
		//��ȡ
		System.out.println("���ϸ�����:"+map.size());
		System.out.println("���ݼ���ȡ��ֵ��"+map.get("����"));
		//ɾ��
		map.clear();
		System.out.println("����ָ����ɾ��һ�����ݣ�"+map.remove("��ʦ"));
		System.out.println(map.remove("ѧ��"));
		*/ //�ж�
		System.out.println("�ж��Ƿ����ָ����:"+map.containsKey("ϰ��ƽ"));
		System.out.println("�ж��Ƿ����ָ��ֵ:"+map.containsValue("ѧ��"));
		//map.clear();
		System.out.println("�ж��Ƿ�Ϊ�գ�"+map.isEmpty());
		
		System.out.println("����Ԫ����:"+map);
	}
}
