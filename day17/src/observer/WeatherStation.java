package observer;

import java.util.ArrayList;
import java.util.Random;

public class WeatherStation {

	String[] weathers= {"����","����","����","��ѩ","�η�","̨��","����"};

	String weather;//��¼��ǰ����
	
	ArrayList<Weather> list=new ArrayList<Weather>();
	
	public void addListener(Weather e) {//�ӿ�
		list.add(e);
	}

	public void startWork() {
		Random random = new Random();
		new Thread() {
			public void run() {
				while (true) {
					upDateWeather();
					for (Weather e : list) {
						e.notifyWeather(weather);
					}
					int num = random.nextInt(501) + 1000;
					try {
						Thread.sleep(num);
					} catch (InterruptedException e1) {

						e1.printStackTrace();
					}
				}
			}
		}.start();
	}

	public void upDateWeather() {
		Random random = new Random();
		int num = random.nextInt(weathers.length);
		weather = weathers[num];
		System.out.println("��ǰ������:" + weather);
	}
}
	
	

