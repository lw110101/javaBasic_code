package math_date;
/*
 * Math  数学类;提供很多数学公式
	abs(double b)   获取绝对值
	ceil(double b)   向上取整
	floor(double b)   向下取整
	round(float a)   四舍五入
	random()    产生一个随机数   [0.0,1.0)的伪随机数

Random  随机数类 
 */
public class Demo2 {

	public static void main(String[] args) {
	
		System.out.println("绝对值："+Math.abs(-3.14));
		System.out.println("向上取整："+Math.ceil(-3.14));
		System.out.println("向下取整："+Math.floor(-3.14));
		System.out.println("四舍五入："+Math.round(-3.54));
		System.out.println("伪随机数："+(Math.random()+1));
	
	}

}
