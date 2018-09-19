package test2;
//8.编写一个函数模拟去坐车，如果没有带够两块钱，函数抛出一个”没有带够钱”的异常，如果已经带够了钱直接输出可以坐车。
class NoEnoughMoneyException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	String name;
	
	public NoEnoughMoneyException(String name) {
		this.name = name;
	}	

}

public class Demo2 {

	public static void main(String[] args) {
		
		try {
			takeCar(1);
		} catch (NoEnoughMoneyException e) {	
			e.printStackTrace();
			System.out.println("没有带够钱!回家拿钱去。。。");
		}
	}
	
	public static void takeCar(int money) throws NoEnoughMoneyException{
		
		if(money>=2) {
			System.out.println("可以坐车了。。。");
		}else {
			throw new NoEnoughMoneyException("免费坐车。。");
		}
	}
}
