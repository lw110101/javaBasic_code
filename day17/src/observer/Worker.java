package observer;

public class Worker implements Weather{

	String name;

	public Worker(String name) {
		this.name = name;
	}
	@Override//"����","����","����","��ѩ","�η�","̨��","����"
	public void notifyWeather(String weather) {
		if("����".equals(weather)) {
			System.out.println(name+"�߸����˵ĳ�ȥ��ѧ��");
		}else if("����".equals(weather)){
			System.out.println(name+"����ɡȥ��ѧ��");
		}else if("����".equals(weather)){
			System.out.println(name+"������ȥ��ѧ��");
		}else if("��ѩ".equals(weather)){
			System.out.println(name+"���ڼ������Ϸ��");
		}else if("�η�".equals(weather)){
			System.out.println(name+"�����ȥ������");
		}else if("̨��".equals(weather)){
			System.out.println(name+"���ڼ���˯����");
		}else if("����".equals(weather)) {
			System.out.println(name+"����ͷ����");
		}
	}
}
