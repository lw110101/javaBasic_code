package observer;

// ��дһ������վ��һ�����������࣬������վ�������� ��ʱ��Ҫ֪ͨ��������Ӧ�Ĵ���
public class WeatherMain {

	public static void main(String[] args) throws Exception {
		
		WeatherStation station=new WeatherStation();
		Student s1=new Student("��ΰ");
		Student s2=new Student("����");
		
		Worker w1=new Worker("��ʦ");
		Worker w2=new Worker("����");
		
		station.addListener(s1);
		station.addListener(s2);
		station.addListener(w1);
		station.addListener(w2);
		
		station.startWork();
		
	}
}
