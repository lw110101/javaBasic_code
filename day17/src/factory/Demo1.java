package factory;

import java.util.Random;

//����ģʽ�����������
class Car {
}

class BMW extends Car {

}

class BSJ extends Car {
}

public class Demo1 {

	public static void main(String[] args) {

	}

	public static Car getCar() {
		boolean flag;
		Random random = new Random();
		while (true) {
			int num = random.nextInt(2);
			if (num == 0) {
				flag = true;
			} else {
				flag = false;
			}
			if (flag) {
				return new BMW();
			} else {
				return new BSJ();
			}
		}
	}
}
