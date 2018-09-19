package observer;

public class Worker implements Weather{

	String name;

	public Worker(String name) {
		this.name = name;
	}
	@Override//"晴天","阴雨","大雾","雨雪","刮风","台风","冰雹"
	public void notifyWeather(String weather) {
		if("晴天".equals(weather)) {
			System.out.println(name+"高高兴兴的出去上学。");
		}else if("阴雨".equals(weather)){
			System.out.println(name+"带着伞去上学。");
		}else if("大雾".equals(weather)){
			System.out.println(name+"坐公交去上学。");
		}else if("雨雪".equals(weather)){
			System.out.println(name+"呆在家里打游戏。");
		}else if("刮风".equals(weather)){
			System.out.println(name+"穿厚点去买东西。");
		}else if("台风".equals(weather)){
			System.out.println(name+"窝在家里睡觉。");
		}else if("冰雹".equals(weather)) {
			System.out.println(name+"带好头盔。");
		}
	}
}
