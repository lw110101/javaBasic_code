package test2;
//8.��дһ������ģ��ȥ���������û�д�������Ǯ�������׳�һ����û�д���Ǯ�����쳣������Ѿ�������Ǯֱ���������������
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
			System.out.println("û�д���Ǯ!�ؼ���Ǯȥ������");
		}
	}
	
	public static void takeCar(int money) throws NoEnoughMoneyException{
		
		if(money>=2) {
			System.out.println("���������ˡ�����");
		}else {
			throw new NoEnoughMoneyException("�����������");
		}
	}
}
