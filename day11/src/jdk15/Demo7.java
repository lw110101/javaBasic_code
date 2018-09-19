package jdk15;
//
class Season{
	String value;

	public static final Season spring=new Season("´º");
	public static final Season summer=new Season("ÏÄ");
	public static final Season actumn=new Season("Çï");
	public static final Season winter=new Season("¶¬");
	private Season(String value) {
		this.value = value;
	}
}

class Date{

	private Season season;
	private String color;
	public Date() {
		
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public Season getSeason() {
		return season;
	}

	public void setSeason(Season season) {
		this.season = season;
	}
	
}
public class Demo7 {

	public static void main(String[] args) {
		
		Date d=new Date();
		d.setColor("ºìÉ«");
		d.setSeason(Season.actumn);
		System.out.println(d.getSeason().value+"ÊÇ"+d.getColor()+"µÄ");
		
	}
}
