package observer;

// 编写一个气象站、一个工人两个类，当气象站更新天气 的时候，要通知人做出相应的处理。
public class WeatherMain {

	public static void main(String[] args) throws Exception {
		
		WeatherStation station=new WeatherStation();
		Student s1=new Student("刘伟");
		Student s2=new Student("付豪");
		
		Worker w1=new Worker("教师");
		Worker w2=new Worker("工人");
		
		station.addListener(s1);
		station.addListener(s2);
		station.addListener(w1);
		station.addListener(w2);
		
		station.startWork();
		
	}
}
