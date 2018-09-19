package list;

import java.util.Arrays;

//¼¯ºÏÄ£Äâ¶ÑÕ»´æ´¢-----ÄÚ´æÐ¹Â©
class Stack {
	Object[] obj;

	int index = 0;

	public Stack() {
		obj = new Object[3];
	}

	public void push(Object o) {
		if (getSize() == obj.length) {
			int newLength = obj.length * 2;
			obj = Arrays.copyOf(obj, newLength);
		}
		obj[index++] = o;
	}

	public Object pop() {// Å×Õ» ---- É¾³ý²¢·µ»Ø
		int i = --index;
		Object temp = obj[i];
		obj[i] = null;
		return temp;
	}

	public int getSize() {
		return index;
	}

}

public class Demo1 {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("¹·ÍÞ");
		stack.push("¹·Ê£");
		stack.push("Ìúµ°");
		stack.push("ÀîËÄ");
		int size = stack.getSize();
		for (int i = 0; i < size; i++) {
			Object o = stack.pop();
			System.out.println(o);
		}
	}
}
